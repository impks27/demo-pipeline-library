#!/usr/bin/env groovy
package com.devops
class CDPipeline {

  def execute() {
    try {
      println "Executing try!"
    } catch(ex) {

    } finally {
      println "Executing finally!"
    }
  }

}
