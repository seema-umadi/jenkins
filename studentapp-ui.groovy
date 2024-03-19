pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                echo 'Hello World'
            }
        }
                stage('Build') {
            steps {
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
                echo 'Here we are deploying the code'
            }
        }
                stage('Test') {
            steps {
               
                echo 'Testing done'
            }
        }
                stage('Deploy') {
            steps {
                echo 'Deploy done'
            }
        }
    }
}
