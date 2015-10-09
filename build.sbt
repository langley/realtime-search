name := """realtime-search"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "org.elasticsearch" % "elasticsearch" % "0.90.1",
  "commons-io" % "commons-io" % "2.4",
  "org.webjars" %% "webjars-play" % "2.4.0",
  "org.webjars" % "angularjs" % "1.1.5-1",
  "org.webjars" % "bootstrap" % "2.3.2"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
