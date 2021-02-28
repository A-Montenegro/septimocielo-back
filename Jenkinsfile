pipeline {
    agent any

    environment {
        PORT = 8098
        SCRIPT_BUILD_SEPTIMOCIELO_BACK = "/home/pi/deploy/scripts/build-septimocielo-back.sh"
        SCRIPT_DEPLOY_SEPTIMOCIELO_BACK = "/home/pi/deploy/scripts/deploy-septimocielo-back.sh"
        ARTIFACT_NAME = "septimocielo-back"

    }

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "mvn"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/A-Montenegro/septimocielo-back.git'

                // Run Maven on a Unix agent.
                sh SCRIPT_BUILD_SEPTIMOCIELO_BACK

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('Artifact processing') {
            steps {
                if (env.GIT_BRANCH == 'origin/main'){
                    PROFILE = "production"
                } else {
                    PROFILE = "testing"
                }
                sh "sudo fuser -k " + PORT + "/tcp || true"
                sh SCRIPT_DEPLOY_SEPTIMOCIELO_BACK + " " + ARTIFACT_NAME " " + PROFILE
            }

        }
    }
}