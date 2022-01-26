job('example'){
   description('dsl-job number one')
   logRotator {
        numToKeep(2)
      }
   scm{
      github('https://github.com/gitcloudvipin/mygitrepo.git' ,'master')
      {credentialsId('git-id')}
      
   }
  triggers{
      githubPush()
    }
   steps{
      shell('echo "Hello World!!!!"')
}
}
