pipeline {
    agent any

    stages {

        stage("Show Current Folder") {
            steps {
                sh "pwd"
            }
        }

        stage("List Files") {
            steps {
                sh "ls -la"
            }
        }

        stage("Run Python Program") {
            steps {
                sh "python3 app.py"
            }
        }

    }
}