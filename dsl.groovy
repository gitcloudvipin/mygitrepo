job('example'){
   description('dsl-job number one')
   logRotator {
        numToKeep(2)
      }
   scm{
      git {
        remote{
         github('github.com/gitcloudvipin/mygitrepo.git' ,'https')
         credentials('git-id')
      }}
      
   }
  triggers{
      githubPush()
    }
   steps{
      shell('echo "Hello World!!!!"')
}
}
