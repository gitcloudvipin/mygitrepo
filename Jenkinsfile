pipeline {
  agent any
  tools {
        jdk "localjdk"
    }
  stages {
     stage("BuildNEW1"){
        steps {
            sh "/opt/apache-maven-3.6.3/bin/mvn -f Maven_Examples/sample_java/pom.xml clean  package -Dmaven.repo.local=/home/vipin -DbuildDirectory=/home/jarDirectory "
              }
            }
     stage("test") {
        steps {
              echo "moving file to some other directory"
              echo "${WORKSPACE}"
              #sh 'mv "${WORKSPACE}"/Maven_Examples/sample_java/target/*.jar /home/jarDirectory'
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
