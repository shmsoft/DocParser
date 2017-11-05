import Dependencies._
import sbt.Keys.libraryDependencies

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += hamcrest,
    libraryDependencies += apacheCommons,
    libraryDependencies += slf4j,
    libraryDependencies += guava,
    libraryDependencies += gate,
    libraryDependencies += httpclient,
    libraryDependencies += mongodb,
    libraryDependencies += jsoup,
    libraryDependencies += slf4,
    libraryDependencies += commonscli,
    libraryDependencies += javaxservlet,
    libraryDependencies += lucenecore,
    libraryDependencies += luceneanalysis,
    libraryDependencies += lucenequery,
    libraryDependencies += lucenememory,
    libraryDependencies += jetty
  )


