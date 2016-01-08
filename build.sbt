name         := "ReactiveCouchbase-play"
version      := "0.4-SNAPSHOT"
scalaVersion := "2.11.6"
//val appScalaBinaryVersion = "2.10"
val appScalaCrossVersions = Seq("2.11.1", "2.10.4")

lazy val root = (project in file("."))

/*lazy val root = Project("root", base = file("."))
  .settings(baseSettings: _*)
  .settings(
    publishLocal := {},
    publish := {}
  ).aggregate(
    plugin
  )*/

libraryDependencies ++= Seq(
  "org.reactivecouchbase" %% "reactivecouchbase-core" % "0.4-SNAPSHOT" /*cross CrossVersion.binary*/,
  "org.reactivecouchbase" %% "reactivecouchbase-es" % "0.4-SNAPSHOT" /*cross CrossVersion.binary*/,
  "com.typesafe.play" %% "play" % "2.4.6" % "provided" cross CrossVersion.binary,
  "com.google.guava" % "guava" % "16.0.1",
  "com.typesafe.play" %% "play-cache" % "2.4.6" cross CrossVersion.binary,
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
resolvers += "ReactiveCouchbase Releases" at "https://raw.github.com/ReactiveCouchbase/repository/master/releases/"
resolvers += "ReactiveCouchbase Releases" at "https://raw.github.com/ReactiveCouchbase/repository/master/snapshots/"
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

/*val local: Def.Initialize[Option[sbt.Resolver]] = version { (version: String) =>
  val localPublishRepo = "./repository"
  if(version.trim.endsWith("SNAPSHOT"))
    Some(Resolver.file("snapshots", new File(localPublishRepo + "/snapshots")))
  else Some(Resolver.file("releases", new File(localPublishRepo + "/releases")))
}

val nexusPublish = version { v =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

lazy val baseSettings = Defaults.defaultSettings ++ Seq(
  scalaVersion := appScalaVersion,
  //scalaBinaryVersion := appScalaBinaryVersion,
  crossScalaVersions := appScalaCrossVersions,
  parallelExecution in Test := false
)

lazy val root = Project("root", base = file("."))
  .settings(baseSettings: _*)
  .settings(
    publishLocal := {},
    publish := {}
  ).aggregate(
    plugin
  )

lazy val plugin = Project(appName, base = file("plugin"))
  .settings(baseSettings: _*)
  .settings(
    resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
    libraryDependencies += "org.reactivecouchbase" %% "reactivecouchbase-core" % "0.4-SNAPSHOT" cross CrossVersion.binary,
    libraryDependencies += "org.reactivecouchbase" %% "reactivecouchbase-es" % "0.4-SNAPSHOT" cross CrossVersion.binary,
    libraryDependencies += "com.typesafe.play" %% "play" % "2.3.5" % "provided" cross CrossVersion.binary,
    libraryDependencies += "com.typesafe.play" %% "play-cache" % "2.3.5" cross CrossVersion.binary,
    libraryDependencies += "com.google.guava" % "guava" % "16.0.1",
    //libraryDependencies += "com.typesafe.play" %% "play-test" % "2.3.0" % "test",
    organization := "org.reactivecouchbase",
    version := appVersion,
    publishTo <<= local,
    publishMavenStyle := true,
    publishArtifact in Test := false,
    pomIncludeRepository := { _ => false },
    pomExtra := (
      <url>http://reactivecouchbase.org</url>
        <licenses>
          <license>
            <name>Apache 2</name>
            <url>http://www.apache.org/licenses/LICENSE-2.0</url>
            <distribution>repo</distribution>
          </license>
        </licenses>
        <scm>
          <url>git@github.com:ReactiveCouchbase/ReactiveCouchbase-play.git</url>
          <connection>scm:git:git@github.com:ReactiveCouchbase/ReactiveCouchbase-play.git</connection>
        </scm>
        <developers>
          <developer>
            <id>mathieu.ancelin</id>
            <name>Mathieu ANCELIN</name>
            <url>https://github.com/mathieuancelin</url>
          </developer>
        </developers>)
  )*/
