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
            steps{
                sh 'docker build -f Dockerfile -t ${IMAGE_NAME}:latest .'
            }
        }

        stage('Docker Login'){
            steps{
                    withCredentials([

                        usernamePassword(
                            credentialsId:'dockerhub',
                            usernameVariable :'DOCKER_USER',
                            passwordVariable :'DOCKER_PASS'
                        )

                    ])
                    sh '''
                        echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
                    '''
            
            }
        }
    }
}