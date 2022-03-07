def call(Map config) {

checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'anupat', url: 'https://github.com/anushareddy9678/tomcat.git']]]


}
