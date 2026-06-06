pipeline{
    agent any

     environment {
        IMAGE_NAME = "abhijadhav2011/makeup-artist"
        CONTAINER_NAME = "makeup-artist-app"
    }


    stages{
        stage('git checkout'){
            steps{
                git branch :'main',
                url:'https://github.com/Abhimanyu-Jadhav/MakeupArtistBookingSystem.git'

            }
        }
        stage('Build'){
            steps{

                sh 'mvn clean package'
            }
        }

        stage('Compile'){
            steps{

                sh 'mvn compile'
            }
        }
        stage('Test'){
            steps{

                sh 'mvn test'
            }
        }

        stage('Package'){
            steps{

                sh 'mvn package'
            }

        }
        stage('Build docker Image'){

            sh 'docker build -t ${IMAGE_NAME}:latest'
        }

    }
}