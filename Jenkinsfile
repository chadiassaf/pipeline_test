pipeline {
    agent any
    
    stages {
        stage ('Compile Stage') {

            steps {
               
                    bat  'D:\Projects\apache-maven-3.6.3\bin\mvn clean compile'
               
            }
        }

        stage ('Testing Stage') {

            steps {
             
                    bat  'D:\Projects\apache-maven-3.6.3\bin\mvn test'
              
            }
        }

        stage ('installing Stage') {
            steps {

                    bat  'D:\Projects\apache-maven-3.6.3\bin\mvn install'

            }
        }

        stage ('Deployment Stage') {
            steps {

                    bat  'D:\Projects\apache-maven-3.6.3\bin\mvn deploy'

            }
        }
    }
}
