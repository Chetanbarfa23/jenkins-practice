def applicationInfo() {

    sh 'echo --------------------------------------'
    sh 'echo Application Information'
    sh 'echo --------------------------------------'

    sh "echo App Name : ${APP_NAME}"
    sh "echo Version : ${params.APP_VERSION}"
    sh "echo Environment : ${params.ENVIRONMENT}"

}

def runTests() {

    sh 'echo --------------------------------------'
    sh 'echo Running Tests'
    sh 'echo --------------------------------------'

    sh 'echo Running Unit Tests...'
    sh 'echo Tests Passed Successfully.'

}

def deployApplication() {

    sh 'echo --------------------------------------'
    sh 'echo Starting Deployment'
    sh 'echo --------------------------------------'

    sh "echo Deploying version ${params.APP_VERSION}"

    sh "echo Deploying to ${params.ENVIRONMENT}"

    sh 'echo Server Username : $SERVER_USR'

    sh 'echo Server Password : $SERVER_PSW'

    sh 'echo Deployment Completed Successfully.'

}

return this