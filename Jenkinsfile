pipeline {

    agent any

    stages {

        stage('Build Maven') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t taskmanager-app .'
            }
        }

        stage('Deploy Containers') {
            steps {
                bat 'docker compose down'
                bat 'docker compose up -d'
            }
        }

    }
}
