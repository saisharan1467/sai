pipeline {
    agent any

    stages {
        stage ('Complie Stage') {
            
            steps {
                withMaven(maven : 'maven.github') {
                    sh 'mvn clean compile'
                }
            }
        }
        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven.github') {
                    sh 'mvn test'
                }
            } 
        }
        stage ('Testing Stage') {
            steps {
                withMaven(maven : 'maven.github') {
                    sh 'mvn deploy  '
                }
            } 
        }
    }
}