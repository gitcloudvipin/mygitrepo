job('example'){
   description('dsl-job number one')
   logRotator {
        numToKeep(2)
      }
   scm{
      github('https://github.com/gitcloudvipin/mygitrepo.git' ,'master')
      credentialsId('0f3c94ce-fdd9-45bb-b0d5-30eb24e61c10')
      
   }
  triggers{
      githubPush()
    }
   steps{
      shell('echo "Hello World!!!!"')
}
}
