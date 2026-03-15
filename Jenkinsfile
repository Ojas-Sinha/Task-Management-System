pipeline {

    agent any

    stages {

        stage('Build Maven') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t taskmanager-app .'
            }
        }

        stage('Deploy Containers') {
            steps {
                sh 'docker compose down'
                sh 'docker compose up -d'
            }
        }

    }
}
