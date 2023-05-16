pipeline{
    agent any

    tools {
        maven "MAVEN"
    }

    stages {
        stage('Build'){
            steps{
                sh "mvn clean compile"
            }
        }
        stage('Test'){
            steps{
                sh "mvn test"
            }
        }
        stage('Deploy'){
            steps{
                sh "mvn heroku:deploy"
            }
        }
    }
}