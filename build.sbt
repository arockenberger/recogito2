name := """recogito2"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.jooq" % "jooq" % "3.7.2",
  "org.jooq" % "jooq-codegen-maven" % "3.7.2",
  "org.jooq" % "jooq-meta" % "3.7.2",
  "org.xerial" % "sqlite-jdbc" % "3.8.11.2",
  "jp.t2v" %% "play2-auth" % "0.14.1",
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

val generateJOOQ = taskKey[Seq[File]]("Generate JooQ classes")

val generateJOOQTask = (sourceManaged, fullClasspath in Compile, runner in Compile, streams) map { (src, cp, r, s) =>
  toError(r.run("org.jooq.util.GenerationTool", cp.files, Array("conf/db.conf.xml"), s.log))
  (src ** "*.scala").get
}

generateJOOQ <<= generateJOOQTask