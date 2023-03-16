// def GIT_STATUE = getGitChanges()
// perform mvn clean install
// package as docker
// deploy to docker hub
// deploy to some host platform

pipeline {
    agent any

    tools {
       maven "Maven"
    }

    environment {
        MY_NAME = "Somto"
        AGE = "28"
        SERVER_CREDENTIALS = credentials("server-id")
        DOCKERHUB_PASSWORD = credentials("dockerhub-pwd")
    }

    parameters {
        string(name: "stringParam", defaultValue: "string param value", description: "choice description")
        choice(name: "choiceParam", choices: ["1.1", "1.2"], description: "choice description")
        booleanParam(name: "mavenBuild", defaultValue: true, description: "maven build description")
        booleanParam(name: "dockerBuild", defaultValue: true, description: "docker build description")
    }

    stages {
        stage("Maven build and test stage") {
            when {
                expression {
                    params.mavenBuild
                }
            }

            steps {
                echo "building maven package... "
//                 sh "mvn clean install"
            }
        }

        stage("Docker image build stage") {
                    when {
                        expression {
                            params.dockerBuild
                        }
                    }

                    steps {
                        echo "building docker image... "
                        sh "docker build -t vitusvictor/jk-repo ."
                    }
                }

        stage("Push docker image stage") {
            steps {
                echo "pushing docker image... "
                sh "docker login -u vitusvictor -p ${DOCKERHUB_PASSWORD}"
                sh "docker push vitusvictor/jk-repo"
            }
        }

        stage("Deploy stage") {
            steps {
                echo "deploying... "
            }
        }

    }
}