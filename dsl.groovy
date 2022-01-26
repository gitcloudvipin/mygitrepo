job('example'){
   description('dsl-job number one')
   logRotator {
        numToKeep(2)
      }
   scm{
      github('https://github.com/gitcloudvipin/mygitrepo.git' ,'master')
      {credentials('Jenkins')}
      
   }
  triggers{
      githubPush()
    }
   steps{
      shell('echo "Hello World!!!!"')
}
}
