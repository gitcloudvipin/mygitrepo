job('example'){
   description('dsl-job number one')
   logRotator {
        numToKeep(2)
      }
   scm{
      git {
        remote{
         name('origin')
         github('gitcloudvipin/mygitrepo' ,'https')
         credentials('git-id')
      } branch('master')
}
      
   }
  triggers{
      githubPush()
    }
   steps{
      shell('echo "Hello World!!!!"')
}
}
