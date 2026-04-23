def call(String projectName, String dockerHubUser, String imageTag){
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
