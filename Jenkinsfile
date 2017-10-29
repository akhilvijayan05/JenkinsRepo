pipeline {
	agent any
	stages{
		stage('Build') {
			steps{
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
