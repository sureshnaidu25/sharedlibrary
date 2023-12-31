def newDownload(repo)
{
  https://github.com/intelliqittrainings/${repo}
}

def newBuild()
{
  sh 'mvn package'
}

def newDeploy("jobname","ipaddress","appname")
{
  sh 'scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipadress}:/var/lib/tomcat9/webapps/${jobname}.war
}

def runSelenium("

