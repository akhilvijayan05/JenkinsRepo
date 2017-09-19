
name := "JenkinsProject"

version := "1.0"

scalaVersion := "2.12.3"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1" % Test

libraryDependencies ++= Seq(
  scalaTest
)
    