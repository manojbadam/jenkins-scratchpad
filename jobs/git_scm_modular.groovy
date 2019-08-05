def remoteParam = """
{
        url("https://github.com/JFrog/project-examples.git")
        credentials("user-name-password-credentials")
}
"""

job("Simple Git SCM Modular") {
  scm {
    git {
      remote remoteParam
    }
  }
}
