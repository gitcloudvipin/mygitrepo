pipeline {
  agent any
  stages {
     stage("Build11"){
        steps {
            sh "mvn -f Maven_Examples/sample_java/pom.xml clean package"
              }
            }
     stage("test") {
        steps {
              echo " this is test step "
                }
        }
     stage("Deploy") {
        steps {
           echo "this is deploy step"
             }
     }
     stage("apllication status") {
         steps {
            echo " this is my application "
               }
         }

    }

}
