freeStyleJob("Post email notification") {
    wrappers {
        colorizeOutput()
        timestamps()
        steps {
            echo "Hello World"
        }
        publishers {
            mailer('me@example.com', true, true)
        }
    }
}