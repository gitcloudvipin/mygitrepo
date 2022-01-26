job('example'){
   description('dsl-job number one')
   discardOldBuilds(-1,2)

   steps{
      shell('echo "Hello World!!!!"')
}
}
