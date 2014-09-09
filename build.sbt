scalaVersion in ThisBuild := "2.11.2"

libraryDependencies += "com.lihaoyi" %% "acyclic" % "0.1.2" % "provided"

autoCompilerPlugins := true

addCompilerPlugin("com.lihaoyi" %% "acyclic" % "0.1.2")
