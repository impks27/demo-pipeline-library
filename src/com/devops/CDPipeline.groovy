#!/usr/bin/env groovy
package com.devops
def execute() {
   println "Hello! I am pipeline"
   new ArtifactoryGradleJob.init()
}
