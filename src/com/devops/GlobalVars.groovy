#!/usr/bin/env groovy
package com.devops

class GlobalVars {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.devops.GlobalVars
   // println GlobalVars.foo
}
