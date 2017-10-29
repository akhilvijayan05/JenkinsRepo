pipeline {
	agent any
	tools {
        	sbt 'org.scala-sbt' 
    	}
	stages{
		stage('Build') {
			steps{
			sbt compile
                        sbt run
			}
		}
	}
}
