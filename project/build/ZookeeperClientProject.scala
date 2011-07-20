import sbt._
import Process._
import com.twitter.sbt._

class ZookeeperClientProject(info: ProjectInfo) extends StandardProject(info) with SubversionPublisher {

  override def subversionRepository = Some("http://svn.local.twitter.com/maven-public")

  // Maven repositories
  val mavenDotOrg = "repo1" at "http://repo1.maven.org/maven2/"
  val jBoss = "jboss-repo" at "http://repository.jboss.org/maven2/"
  val apache = "apache" at "http://people.apache.org/repo/m2-ibiblio-rsync-repository/"

  // dependencies
  val slf4jApi = "org.slf4j" % "slf4j-api" % "1.5.8"
  val slf4jLog = "org.slf4j" % "slf4j-log4j12" % "1.5.8"
  val log4j = "log4j" % "log4j" % "1.2.16"
  val configgy = "net.lag" % "configgy" % "2.0.1"
  val specs = "org.scala-tools.testing" % "specs_2.8.1" % "1.6.6" % "test"

  override def pomExtra =
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
        <distribution>repo</distribution>
      </license>
    </licenses>

}
