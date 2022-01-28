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
     stage("manual approval") {
         steps {
             timeout(10) {
                  mail bcc: '', body: "<br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> Go to build url and approve the deployment request <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "${currentBuild.result} CI: Project name -> ${env.JOB_NAME}", to: "umeshkgangwarr@gmail.com"; 
		  input(id: "Deploy Gate", message: "Deploy ${params.project_name}?", ok: 'Deploy')
                }               
         }
     }
     stage("Deploy"){
         steps {
	      sh 'terraform apply -auto-approve "\"${WORKSPACE}/plan.txt"\" '
	       }
	 }
     stage("terraform output"){
         steps {
               sh "terraform output"
           }
    }
}
}
