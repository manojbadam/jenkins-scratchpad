private void fetchPublisheres() {
    return {
        publishers {
            mailer('me@example.com', true, true)
        }
    }
}

freeStyleJob("Post email notification") {
    wrappers {
        colorizeOutput()
        timestamps()
        steps {
            shell("echo Hello World!")
        }
        fetchPublisheres()
    }
}