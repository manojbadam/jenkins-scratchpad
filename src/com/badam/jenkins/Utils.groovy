package com.badam.jenkins

class Utils {
    def static fetchPublisheres() {
        return {
                mailer('me@example.com', true, true)
            }
    }
}