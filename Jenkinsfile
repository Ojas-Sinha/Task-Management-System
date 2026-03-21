pipeline {

    agent any

    environment {
        DOCKER_IMAGE = "ojassinha20/taskmanager-app"
        DOCKER_TAG = "latest"
        KUBECONFIG = "C:\\Users\\DELL\\.kube\\config"
    }

    stages {

        stage('Build Application') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run Selenium Tests') {
            steps {
                bat 'docker compose up -d'
                bat 'ping -n 20 127.0.0.1 > nul'
                bat 'mvn test'
            }
        }

        stage('Package Application') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %DOCKER_IMAGE%:%DOCKER_TAG% .'
            }
        }

        stage('Push to DockerHub') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-creds',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {

                    bat 'echo Logging in as %DOCKER_USER%'
                    bat 'echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin'
                    bat 'docker push %DOCKER_IMAGE%:%DOCKER_TAG%'
                }
            }
        }

        stage('Deploy Kubernetes') {
            steps {
                bat 'kubectl apply -f k8s/'
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed'
        }
        success {
            echo '✅ Deployment Successful'
        }
        failure {
            echo '❌ Pipeline Failed'
        }
    }
}
