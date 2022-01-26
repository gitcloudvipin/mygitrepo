job('example'){
   description('dsl-job number one')
   logRotator {
        numToKeep(2)
      }
   steps{
      shell('echo "Hello World!!!!"')
}
}
