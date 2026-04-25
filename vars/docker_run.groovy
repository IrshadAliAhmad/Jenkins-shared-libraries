def call(){
  sh "docker run -d --name=todo-con -p 8080:80 iirshad/todo-img:latest"
}
