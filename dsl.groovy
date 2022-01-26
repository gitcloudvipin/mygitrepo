job('example'){
   description('dsl-job number one')
   publishers {
        publishBuild {
            discardOldBuilds(7, 10)
        }
    } 
   steps{
      shell('echo "Hello World!!!!"')
}
}
