job('example'){
   description('dsl-job number one')
   discardOldBuilds(int daysToKeep = -1, int numToKeep = -2, int artifactDaysToKeep = -1, int artifactNumToKeep = -1)

   steps{
      shell('echo "Hello World!!!!"')
}
}
