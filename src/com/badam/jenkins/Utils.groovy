package com.badam.jenkins

class Utils implements Serializable {
    def static fetchPublisheres() {
        return {
                mailer('me@example.com', true, true)
            }
    }
}