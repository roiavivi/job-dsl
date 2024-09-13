pipelineJob("p1") {
   description("Pipeline P1 is cool.")
   displayName("CI-DSL")
   definition {
      cpsScm {
         scm {
            git {
               remote {
                  url 'https://github.com/roiavivi/AppCode.git'
               }
               branch('main')
            }
         }
         // This will be cloned and then ran when Pipeline P1 is ran
         scriptPath('Jenkinsfile')
      }
   }
}
