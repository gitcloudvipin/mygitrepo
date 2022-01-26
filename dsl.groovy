job('example'){
   description('dsl-job number one')
   discardOldBuilds(int numToKeep = 2)

   steps{
      shell('echo "Hello World!!!!"')
}
}
