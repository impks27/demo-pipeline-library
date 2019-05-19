package com.devops

def init() {
  println "Executing ArtifactoryGradleJob!"
  def server = Artifactory.server 'artifactory-instance'
  def rtGradle = Artifactory.newGradleBuild()
  //rtGradle.resolver server: server, repo: 'libs-release'
  rtGradle.deployer server: server, repo: 'example-repo-local'
  rtGradle.tool = 'gradle'
  def buildInfo = rtGradle.run rootDir: "projectDir/", buildFile: 'build.gradle', tasks: 'clean artifactoryPublish'
  println "buildInfo: " + buildInfo
}
