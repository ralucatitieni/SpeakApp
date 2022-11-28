pipeline {
    tools {
        maven 'maven'
    }
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}