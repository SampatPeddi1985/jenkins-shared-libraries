def class(string ProjectName, string ImageTag, string DockerHubUser{
 sh "docker build -t ${DockerHubUser}/${ProjectNmae}:${ImageTag}
}
