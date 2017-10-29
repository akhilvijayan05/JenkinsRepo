pipeline {
	agent any
	stages{
		stage('Build') {
			steps{
			sbt compile
                        sbt run
			}
		}
	}
}
