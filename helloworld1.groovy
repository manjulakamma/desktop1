pipeline {
    agent any
    stages {
        stage ("hello-world") {
            steps {
                echo "Helloworld"
            }
        }
    }
}