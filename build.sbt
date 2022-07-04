name := "SparkEventListener4Measure"

version := "0.0.1"

scalaVersion := "2.12.10"
crossScalaVersions := Seq("2.11.12", "2.12.10")

isSnapshot := true

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.3.0"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.36"
libraryDependencies += "com.hzhangse" % "promremotewrite" % "0.0.1"


// publishing to Sonatype Nexus repository and Maven
publishMavenStyle := true

organization := "com.hzhangse"
description := "com.hzhangse"


