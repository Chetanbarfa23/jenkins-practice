pipeline {

    agent any

    parameters {

        choice(
            name: 'ENVIRONMENT',
            choices: ['DEV', 'TEST', 'PROD'],
            description: 'Select Environment'
        )

    }

    environment {

        APP_NAME = "Expense Tracker"

        VERSION = "1.0.0"

        SERVER = credentials('server-credentials')

    }

    stages {

        stage("Deploy") {

            steps {

                sh "echo App Name : ${APP_NAME}"

                sh "echo Version : ${VERSION}"

                sh "echo Deploying to ${params.ENVIRONMENT}"

            }

        }

    }

}