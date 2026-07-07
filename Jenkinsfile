pipeline {

    agent any

    parameters {
        choice(
            name: 'ENVIRONMENT',
            choices: ['DEV', 'TEST', 'PROD'],
            description: 'Select Environment'
        )
    }

    stages {

        stage("Deploy") {
            steps {
                sh "echo Deploying to ${params.ENVIRONMENT}"
            }
        }

    }

}