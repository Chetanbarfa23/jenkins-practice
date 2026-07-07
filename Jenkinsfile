pipeline {

    agent any

    stages {

        stage("Show Agent Info") {
            steps {
                sh "hostname"
                sh "whoami"
                sh "pwd"
            }
        }

        stage("Run Python") {
            steps {
                sh "python3 app.py"
            }
        }

    }

}