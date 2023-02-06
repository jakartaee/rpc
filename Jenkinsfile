pipeline {
	agent any
	triggers {
		pollSCM('H H * * *')
	}
	tools {
		jdk 'openjdk-jdk17-latest'
		maven 'apache-maven-latest'
	}
	environment {
		MVN = 'mvn -B'
	}
	stages {
		stage('Nightly Build') {
			when {
				anyOf {
					branch 'main'
				}
			}
			steps {
				dir ('.') {
					sh "$MVN deploy"
				}
			}
		}
	}
}
