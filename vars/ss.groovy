def newDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}

def newBuild()
{
  sh 'mvn package'
}

def newDeploy(jobname,ipaddress,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipadress}:/var/lib/tomcat9/webapps/${appname}.war"
}

def runSelenium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
