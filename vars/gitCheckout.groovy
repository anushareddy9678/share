def call(Map config) {

    checkout([
        $class: 'GitSCM',
        branches: [[name:  config.branch ]],
        userRemoteConfigs: [[credentialsId: config.cred, url: config.giturl ]]
    ])
  }
