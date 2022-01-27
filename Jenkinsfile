pipeline {
  agent any
  tools {
        jdk "localjdk"
    }
  stages {
     stage("BuildNEW1"){
        steps {
            sh "/opt/apache-maven-3.6.3/bin/mvn -f Maven_Examples/sample_java/pom.xml  compile package -Dmaven.repo.local=/home/vipin"
              }
            }
     stage("test") {
        steps {
              echo "moving file to some other directory"
              echo "${WORKSPACE}"
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
