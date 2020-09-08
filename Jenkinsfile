@Library('shared-library') _
pipeline {
  agent any
  stages {
    stage('hello') {
      steps {
        helloWorldSimple(name: "Fred", dayOfWeek: "Friday")
      }
    }
  }
}
