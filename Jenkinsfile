pipeline {

    agent any

    stages {

        stage("Run Python") {
            steps {
                sh "python3 app.py"
            }
        }

    }

    post {

        success {
            echo "🎉 Build Successful"
        }

        failure {
            echo "❌ Build Failed"
        }

        always {
            echo "Pipeline Finished"
        }

    }

}