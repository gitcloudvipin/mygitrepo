pipeline {
  agent any
  stages {
     stage("Build11"){
        steps {
            sh "/usr/local/bin/apache-maven-3.6.3/bin/mvn clean package -f Maven_Examples/sample_java/pom.xml"
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
