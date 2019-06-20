
pipeline {

    stage('checkout') {
        steps {
            deleteDir()
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'Github', url: 'https://github.com/gabirlima/automacaoApi']]])
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




