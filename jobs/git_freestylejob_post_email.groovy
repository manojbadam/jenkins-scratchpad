freeStyleJob("Post email notification") {
    wrappers {
        colorizeOutput()
        timestamps()
        steps {
            shell("echo Hello World!")
        }
        publishers {
            mailer('me@example.com', true, true)
        }
    }
}