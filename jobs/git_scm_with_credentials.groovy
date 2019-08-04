job("Simple Git SCM with Credentials") {
  scm {
    git {
      remote {
        github("https://github.com/JFrog/project-examples")
        url("https://github.com/JFrog/project-examples.git")
        credentials("user-name-password-credentials")
      }
    }
  }
}
