pipeline {
    agent any
    
    stages {
        stage ('Compile Stage') {

            steps {
               
                    sh 'mvn clean compile'
               
            }
        }

        stage ('Testing Stage') {

            steps {
             
                    sh 'mvn test'
              
            }
        }

        stage ('installing Stage') {
            steps {

                    sh 'mvn install'

            }
        }

        stage ('Deployment Stage') {
            steps {

                    sh 'mvn deploy'

            }
        }
    }
}
