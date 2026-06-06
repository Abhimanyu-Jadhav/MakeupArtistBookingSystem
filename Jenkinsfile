pipeline{
    agent any

    stages{
        stage('git checkout'){
            steps{
                git branch :'main',
                url:'https://github.com/Abhimanyu-Jadhav/MakeupArtistBookingSystem.git'

            }
        }
        stage('Buil'){
            steps{

                sh 'mvn clean package'
                

            }
        }
    }
}