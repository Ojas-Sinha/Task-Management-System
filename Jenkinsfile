pipeline {

    agent any

    tools {
        maven 'Maven'
    }

    environment {
        DOCKER_IMAGE = "ojassinha20/taskmanager-app"
        DOCKER_TAG = "latest"
        KUBECONFIG = "C:\\Users\\nitin\\.kube\\config"
        PATH = "C:\\Program Files\\Docker\\Docker\\resources\\bin;${env.PATH}"
    }

    stages {

        stage('Build Application') {
            steps {
                bat 'mvn clean compile'
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

        stage('Run Selenium Tests') {
            steps {
                bat 'docker compose up -d'
                bat 'ping -n 20 127.0.0.1 > nul'
                bat 'mvn test'
            }
        }
        stage('Deploy Kubernetes') {
            steps {
                bat 'kubectl apply -f k8s/'
            }
        }

        stage('Port Forward') {
            steps {
                bat 'start cmd /c kubectl port-forward service/taskmanager-service 9090:8080'
            }
        }
    }
}
