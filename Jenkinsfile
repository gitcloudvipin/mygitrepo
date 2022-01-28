pipeline {
  agent any
  tools {
        jdk "localjdk"
        terraform "localterraform"
    }
  stages {
     stage("BuildNEW1"){
        steps {
            sh "/opt/apache-maven-3.6.3/bin/mvn -f Maven_Examples/sample_java/pom.xml clean  package -Dmaven.repo.local=/home/vipin -DbuildDirectory=/home/jarDirectory "
              }
            }
     stage("test") {
        steps {
              echo "moving file to Ssome other directory"
              echo "${WORKSPACE}"
              sh "terraform init"
                }
        }
     stage("plan") {
        steps {
           sh "terraform plan -out plan.txt"
             }
     }
     stage("Deploy") {
         steps {
            sh 'terraform apply -auto-approve "\"${WORKSPACE}/plan.txt"\" '
               }
         }
    }
  post {
        always {
           mail bcc: '', body: '${BUILD_NUMBER} status', cc: '', from: '', replyTo: '', subject: 'This is new pipelinetest', to: '9458vipin@gmail.com'
        }
    }


}
