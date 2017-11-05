import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.3"
  // https://mvnrepository.com/artifact/org.hamcrest/hamcrest-all
  lazy val hamcrest = "org.hamcrest" % "hamcrest-all" % "1.3" % "test"
  // https://mvnrepository.com/artifact/org.apache.commons/commons-lang3
  lazy val apacheCommons = "org.apache.commons" % "commons-lang3" % "3.6"
  // https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12
  lazy val slf4j = "org.slf4j" % "slf4j-log4j12" % "1.7.21" % "test"
  // https://mvnrepository.com/artifact/com.google.guava/guava
  lazy val guava = "com.google.guava" % "guava" % "23.3-jre"
  // https://mvnrepository.com/artifact/uk.ac.gate/gate-core
  lazy val gate ="uk.ac.gate" % "gate-core" % "8.4.1"
  // https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient
  lazy val httpclient = "org.apache.httpcomponents" % "httpclient" % "4.5.3"
  // https://mvnrepository.com/artifact/org.mongodb/mongo-java-driver
  lazy val mongodb = "org.mongodb" % "mongo-java-driver" % "3.5.0"
  // https://mvnrepository.com/artifact/org.jsoup/jsoup
  lazy val jsoup = "org.jsoup" % "jsoup" % "1.8.3"
  // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
  lazy val slf4 = "org.slf4j" % "slf4j-api" % "1.7.25"
  // https://mvnrepository.com/artifact/commons-cli/commons-cli
  lazy val commonscli = "commons-cli" % "commons-cli" % "1.4"
  // https://mvnrepository.com/artifact/javax.servlet/servlet-api
  lazy val javaxservlet = "javax.servlet" % "servlet-api" % "2.5" % "provided"
  // https://mvnrepository.com/artifact/org.apache.lucene/lucene-core
  lazy val lucenecore =  "org.apache.lucene" % "lucene-core" % "7.1.0"
  // https://mvnrepository.com/artifact/org.apache.lucene/lucene-analyzers-common
  lazy val luceneanalysis = "org.apache.lucene" % "lucene-analyzers-common" % "7.1.0"
  // https://mvnrepository.com/artifact/org.apache.lucene/lucene-queryparser
  lazy val lucenequery = "org.apache.lucene" % "lucene-queryparser" % "7.1.0"
  // https://mvnrepository.com/artifact/org.apache.lucene/lucene-memory
  lazy val lucenememory = "org.apache.lucene" % "lucene-memory" % "7.1.0"
  // https://mvnrepository.com/artifact/org.eclipse.jetty/jetty-server
  lazy val jetty = "org.eclipse.jetty" % "jetty-server" % "9.4.7.v20170914"

}
