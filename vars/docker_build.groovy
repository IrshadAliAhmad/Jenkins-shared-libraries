def call(String projectName, String dckerHubUser, String imageTag){
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
