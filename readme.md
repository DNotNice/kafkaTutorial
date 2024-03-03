# Basic Kafka Implementation
   Basic Kafka Producer Consumer Setup 
   
## Installation
  You can install kafka in different ways.<br/>
  - Installing kafka locally on your machine. <br/>
    - Go to ``https://kafka.apache.org/downloads`` and download the req version.
  - Use kafka using docker.<br/>
    - Use ``docker pull apache/kafka:3.7.0.`` and then run the conatiner ``docker run -p 9092:9092 --name kafka apache/kafka:3.7.0``  <br/>
    - Run via docker compose.

## Use
  * After the above steps are done clone this repository and run this project. <br/>
  * Go to your fav webAPI testing software and go to ``http:localhost:8080/api/message`` and pass JSON data as ``{ message : "YOUR MESSAGE }``<br/> 
  
   ### Your Terminal should show the result.
## Your Kafka Implementation is Done