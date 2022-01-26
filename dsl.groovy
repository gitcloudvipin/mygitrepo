job('example-'${BUILD_MUMBER}){
   description('dsl-job number one')
   logRotator {
        numToKeep(2)
      }
   scm{
      git {
        branch('master')
        remote{
         name('origin')
         github('gitcloudvipin/mygitrepo' ,'https')
         credentials('git-id')
      }
}
      
   }
  triggers{
      githubPush()
    }
   steps{
      shell('echo "Hello World!!!!"')
}
}
