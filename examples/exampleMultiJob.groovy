multibranchPipelineJob('example-project/example') {
    branchSources {
        git {
            id('jenkins-final-job') // IMPORTANT: use a constant and unique identifier
            remote('git@github.com:mattnspa/jenkinsFinalJob.git')
            credentialsId('jenkins-git-ssh')
        }
    }
    factory {
        workflowBranchProjectFactory {
            scriptPath('job.jenkinsfile')
        }
    } 
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(5)
        }
    }
}