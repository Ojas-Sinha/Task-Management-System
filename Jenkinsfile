pipeline {

    agent any

    stages {

        stage('Build Application') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Start Application') {
            steps {
                bat 'docker compose up -d'
                bat 'timeout /t 20'
            }
        }

        stage('Run Selenium Tests') {
            steps {
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
                bat 'docker build -t taskmanager-app .'
            }
        }

        stage('Deploy Kubernetes') {
            steps {
                bat 'kubectl apply -f k8s/'
            }
        }

    }
}