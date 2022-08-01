pipeline {
    agent any
    tools {
        maven 'MAVEN'
    }
    environment {
        DOCKER_CREDENTIALS=credentials('kelvingao2020-dockerhub')
    }
    stages {
        stage ('Build Maven'){
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/kelvingao2020/jenkins-docker-github-integration-pipeline']]])
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t kelvingao2020/jenkins-pipeline .'
                }
            }
        }
        /*stage ('Login'){
            steps{
                bat 'echo $DOCKER_CREDENTIALS_PSW | docker login -u $DOCKER_CREDENTIALS_USR --password-stdin'
            }
        } */
        stage ('Push'){
            steps{
                bat 'docker push kelvingao2020/jenkins-pipeline'
            }
        }
    }
}