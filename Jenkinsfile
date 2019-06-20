
pipeline {

    agent {
        label 'agentId' //The id of the slave/agent where the build should be executed, if it doesn't matter use "agent any" instead.
    }
    
    stages {
    
        stage('checkout') {
            steps {
            deleteDir()
            checkout scm
            sh label: '', script: 'chmod 754 gradlew'
            }
        }

    stage('test') {
        steps {
            script {
                    try {
                        sh './gradlew clean test --no-daemon' //run a gradle task
                    } finally {
                        junit '**/build/test-results/test/*.xml' //make the junit test results available in any case (success & failure)
                    }
                }
            }
        }
    }
    
}