resolvers += "twitter-repo" at "https://maven.twttr.com"

addSbtPlugin("com.twitter" %% "sbt-package-dist" % "1.1.0")

addSbtPlugin("com.twitter" %% "scrooge-sbt-plugin" % "3.1.5")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.5")