def gv

pipeline {

    agent any

    parameters {

        string(
            name: 'APP_VERSION',
            defaultValue: '1.0.0',
            description: 'Application version to deploy'
        )

        choice(
            name: 'ENVIRONMENT',
            choices: ['DEV', 'TEST', 'PROD'],
            description: 'Select Deployment Environment'
        )

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

        stage("Initialize") {

            steps {

                script {

                    gv = load "jenkins/script.groovy"

                }

            }

        }

        stage("Application Info") {

            steps {

                script {

                    gv.applicationInfo()

                }

            }

        }

        stage("Run Tests") {

            when {

                expression { params.RUN_TESTS }

            }

            steps {

                script {

                    gv.runTests()

                }

            }

        }

        stage("Deploy") {

            steps {

                script {

                    gv.deployApplication()

                }

            }

        }

    }

}