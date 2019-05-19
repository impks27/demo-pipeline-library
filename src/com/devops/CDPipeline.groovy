#!/usr/bin/env groovy
package com.devops
def execute() {
   println "Hello! I am pipeline"
   //new ArtifactoryGradleJob().init()
   println "Executing ArtifactoryGradleJob!"
   def server = Artifactory.server 'artifactory-instance'
   def rtGradle = Artifactory.newGradleBuild()
   //rtGradle.resolver server: server, repo: 'libs-release'
   rtGradle.deployer server: server, repo: 'example-repo-local'
   rtGradle.tool = 'gradle'
   def buildInfo = rtGradle.run buildFile: 'build.gradle', tasks: 'clean build artifactoryPublish'
   //rootDir: "projectDir/",
   println "buildInfo: " + buildInfo
}
