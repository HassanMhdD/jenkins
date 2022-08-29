pipeline {
  agent any
  stages {
    stage('BUILD') {
      steps {
        sh 'mvn clean installl'
      }
    }

    stage('TEST') {
      steps {
        sh 'echo test'
      }
    }

    stage('POST BUILD') {
      steps {
        archiveArtifacts(artifacts: '*/*.war', onlyIfSuccessful: true)
      }
    }

    stage('DEPLOY / SHELL SCRIPT') {
      steps {
        sh 'rm -r /var/liv/tomcat9/webapps/spark*'
        sh 'cp target/*.war /var/lib/tomcat9/webapps/'
      }
    }

  }
}