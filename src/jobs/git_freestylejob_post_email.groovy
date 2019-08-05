import com.badam.jenkins.Utils

freeStyleJob("Post email notification") {
    wrappers {
        colorizeOutput()
        timestamps()
        steps {
            shell("echo Hello World!")
        }
        publishers Utils.fetchPublisheres()
    }
}