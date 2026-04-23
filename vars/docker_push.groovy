def call(String project, String imageTag, String dockerHubUser){
  withCredentials([usernamePassword(
                    credentialsId: 'Docker-cred',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]){
                   // sh '''
                   // echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
                   // docker image tag todo-img:latest $DOCKER_USER/todo-img:latest
                   // docker push $DOCKER_USER/todo-img:latest
                   // '''
                  // ya
                 sh "docker login -u $(DOCKER_USER) -p $(DOCKER_PASS)
                }
                  docker push ${dockerHubUser}/${project}:${imageTag}
}
