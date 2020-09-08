@Library('shared-library') _
pipeline {
    agent any
    stages {
        stage('verify') {
            steps {
                helloWorldSimple(name: 'fred', dayOfWeek: 'Monday')
            }
        }
    }
}
