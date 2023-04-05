pipelineJob('example-project/example-job') {
    definition {
        cpsScm {
            lightweight(true)
            scm {
                git {
                    branch('main')
                    remote {
                        credentials('jenkins-git-ssh')
                        url('git@github.com:mattnspa/jenkinsFinalJob.git')

                    }
                }
            }
            scriptPath('job.jenkinsfile')
        }
    }
}