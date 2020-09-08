#!/usr/bin/env groovy

import org.jenkinsci.plugins.pipeline.modeldefinition.Utils

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
