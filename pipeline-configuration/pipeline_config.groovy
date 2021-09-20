libraries{
    maven
    //gradle
    //sonarqube
    //ansible
    
    sonarqube{
      scanner_version = "SonarScanner 4.6"
      enforce_quality_gate = false
      sonarqube_projectKey = "simple-maven-app"
    }
}
