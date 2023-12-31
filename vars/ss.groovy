def newDownload(repo)
{
  https://github.com/intelliqittrainings/${repo}
}

def newBuild()
{
  sh 'mvn package'
}

def newDeploy(repo)
{
  

