job('example-1'){
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
job('example-21'){
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

