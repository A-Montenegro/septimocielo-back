pipeline {
    agent any

    environment {
        SCRIPT_DEPLOY_SEPTIMOCIELO_BACK_TESTING="/home/pi/deploy/scripts/deploy-septimocielo-back.sh"
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
                //sh "mvn -Dspring.profiles.active=testing -Djasypt.encryptor.password=514131 clean package compile"
                sh "." + SCRIPT_DEPLOY_SEPTIMOCIELO_BACK_TESTING

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
                sh "sudo fuser -k 8099/tcp || true"
                sh "sudo java -jar /var/lib/jenkins/workspace/septimocielo-back-main/target/septimocielo-0.0.1-SNAPSHOT.jar --spring.profiles.active=production --jasypt.encryptor.password=514131 &"

            }

        }
    }
}