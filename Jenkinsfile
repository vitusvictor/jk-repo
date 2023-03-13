def GIT_STATUE = getGitChanges()

pipeline {
    agent any
    tools {
       maven "Maven"
    }

    environment {
        MY_NAME = "Somto"
        AGE = "28"
        SERVER_CREDENTIALS = credentials("server-id")
    }

    parameters {
        string(name: "stringParam", defaultValue: "string param value", description: "choice description")
        choice(name: "choiceParam", choices: ["1.1", "1.2"], description: "choice description")
        booleanParam(name: "booleanParam", defaultValue: true, description: "boolean description")
    }

    stages {
        stage("Build stage") {
            when {
                expression {
                    params.booleanParam == true
                }
            }

            steps {
                echo "building... "
            }
        }

        stage("Test stage") {
            steps {
                echo "testing... "
            }
        }

        stage("Deploy stage") {
            steps {
                echo "deploying... "
            }
        }

    }
}