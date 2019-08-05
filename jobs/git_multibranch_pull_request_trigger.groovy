multibranchPipelineJob("Multi Branch Pipeline") {
    branchSources {
        github {
            scanCredentialsId('github-creds')
            repoOwner('manojbadam')
            repository('application-service')

            buildForkPRHead(false)
            buildForkPRMerge(true)

            buildOriginBranch(true)
            buildOriginBranchWithPR(true)

            buildOriginPRHead(false)
            buildOriginPRMerge(false)
        }
    }
}