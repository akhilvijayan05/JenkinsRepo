pipeline {
	agent any
	stages{
		stage('Build') {
			steps{
			sbt compile
                        sbt run
			}
		}
		stage('Test') {
			steps{
			sbt test
			}
		}
	}
}
