
organization:="com.gravity"

name:="goose"

version:="2.1.24-SNAPSHOT"

scalaVersion:="2.10.4"

scalacOptions += "-target:jvm-1.7"

resolvers ++= Seq(
  Resolver.mavenLocal,
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
)



libraryDependencies ++= Seq(
  "junit" % "junit" % "4.8.1" % "test",
  "com.novocode" % "junit-interface" % "0.8" % "test->default",
  "org.slf4j" % "slf4j-api" % "1.6.1" % "compile",
  "org.slf4j" % "slf4j-log4j12" % "1.6.1" % "test",
  "org.jsoup" % "jsoup" % "1.5.2" % "compile",
  "commons-io" % "commons-io" % "2.0.1",
  "commons-lang" % "commons-lang" % "2.3",
  "org.apache.httpcomponents" % "httpclient" % "4.1.2"
)






