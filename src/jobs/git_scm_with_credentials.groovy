job("Simple Git SCM with Credentials") {
  scm {
    git {
      remote {
        url("https://github.com/JFrog/project-examples.git")
        credentials("user-name-password-credentials")
      }
    }
  }
}
