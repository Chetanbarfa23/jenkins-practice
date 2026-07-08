pipeline {

    agent any

    parameters {

        // String Parameter
        string(
            name: 'APP_VERSION',
            defaultValue: '1.0.0',
            description: 'Application version to deploy'
        )

        // Choice Parameter
        choice(
            name: 'ENVIRONMENT',
            choices: ['DEV', 'TEST', 'PROD'],
            description: 'Select Deployment Environment'
        )

        // Boolean Parameter
        booleanParam(
            name: 'RUN_TESTS',
            defaultValue: true,
            description: 'Run tests before deployment?'
        )

    }

    environment {

        APP_NAME = "Expense Tracker"

        SERVER = credentials('server-credentials')

    }

    stages {

        stage("Application Info") {

            steps {

                sh 'echo --------------------------------------'
                sh 'echo Application Information'
                sh 'echo --------------------------------------'

                sh 'echo App Name : $APP_NAME'
                sh "echo Version : ${params.APP_VERSION}"
                sh "echo Environment : ${params.ENVIRONMENT}"

            }

        }

        stage("Run Tests") {

            when {
                expression { params.RUN_TESTS }
            }

            steps {

                sh 'echo Running Unit Tests...'
                sh 'echo Tests Passed Successfully.'

            }

        }

        stage("Deploy") {

            steps {

                sh 'echo --------------------------------------'
                sh 'echo Starting Deployment'
                sh 'echo --------------------------------------'

                sh "echo Deploying version ${params.APP_VERSION}"
                sh "echo Deploying to ${params.ENVIRONMENT}"

                sh 'echo Server Username : $SERVER_USR'
                sh 'echo Server Password : $SERVER_PSW'

                sh 'echo Deployment Completed Successfully.'

            }

        }

    }

}