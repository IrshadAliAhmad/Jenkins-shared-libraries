def call(String url, String branch){
  git url: "${url}", branch: "${branch}"
  echo "Successfully Clone the code"
}
