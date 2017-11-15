import Dependencies._
import sbt.Keys.libraryDependencies

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "DocParser",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += hamcrest,
    libraryDependencies += apacheCommons,
    libraryDependencies += guava,
    libraryDependencies += gate,
    libraryDependencies += httpclient,
    libraryDependencies += mongodb,
    libraryDependencies += jsoup,
    libraryDependencies += commonscli,
    libraryDependencies += javaxservlet,
    libraryDependencies += lucenecore,
    libraryDependencies += luceneanalysis,
    libraryDependencies += lucenequery,
    libraryDependencies += lucenememory,
    libraryDependencies += jetty,
    libraryDependencies ++= Seq("org.slf4j" % "slf4j-api" % "1.7.5",
      "org.slf4j" % "slf4j-simple" % "1.7.5")
  )