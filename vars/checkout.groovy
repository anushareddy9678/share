def call(Map config) {

    checkout([
        $class: 'GitSCM', 
        branches: [[name: config.branch]], 
        doGenerateSubmoduleConfigurations: false, 
        extensions: [[$class: 'CleanCheckout']], 
        submoduleCfg: [], 
        userRemoteConfigs: [[credentialsId: config.cred, url: config.giturl]]
    ])

}
