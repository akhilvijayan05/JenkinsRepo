pipeline {
	agent any
	stages{
		stage('Build') {
			steps{
                        sh 'sbt run'
			}
		}
		stage('Test') {
			steps{
			sh 'sbt test'
			}
		}
	}
}
