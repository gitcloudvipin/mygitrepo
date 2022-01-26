job('example'){
   description('dsl-job number one')
   logRotator {
        numToKeep(2)
      }
   scm{
      git {
  
         github('https://github.com/gitcloudvipin/mygitrepo.git' ,'master')
         credentials('git-id')
      }
      
   }
  triggers{
      githubPush()
    }
   steps{
      shell('echo "Hello World!!!!"')
}
}
