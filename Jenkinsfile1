pipeline {
    agent any
    
    stages {
        stage ('Compile Stage') {

            steps {
               
                    bat  'mvn clean compile'
               
            }
        }

        stage ('Testing Stage') {

            steps {
             
                    bat  'mvn test'
              
            }
        }

        stage ('installing Stage') {
            steps {

                    bat  'mvn install'

            }
        }

        stage ('Deployment Stage') {
            steps {

                    bat  'mvn deploy'

            }
        }
    }
}
