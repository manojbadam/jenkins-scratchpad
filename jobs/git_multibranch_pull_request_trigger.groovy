multibranchPipelineJob("Multi Branch Pipeline") {
    branchSources {
        github {
            scanCredentialsId('github-creds')
            repoOwner('manojbadam')
            repository('application-service')

            buildForkHead(false)
            buildForkMerge(true)

            buildOriginBranch(true)
            buildOriginBranchWithPR(true)

            buildOriginPRHead(false)
            buildOriginPRMerge(false)
        }
    }
}