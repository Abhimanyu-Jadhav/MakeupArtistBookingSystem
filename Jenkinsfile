pipeline{
    agent any

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

    }
}