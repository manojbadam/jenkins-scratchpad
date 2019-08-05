def fetchPublisheres() {
    return {
            mailer('me@example.com', true, true)
        }
}

freeStyleJob("Post email notification") {
    wrappers {
        colorizeOutput()
        timestamps()
        steps {
            shell("echo Hello World!")
        }
        publishers fetchPublisheres()
    }
}