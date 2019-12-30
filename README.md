# nba-scores

Spring boot app to fetch live nba data and display in a react UI.
Running on a docker container. 

Go to /docker and do docker-compose up -d
The react UI is integrated and will start on port http://localhost:8080 


If you do changes to the react UI, go to /frontend and do npm build. 
Copy the files from /frontend/build to /target/classes/public. Make the package again from eclipse using mvn package. 
Copy the snapshot jar created from /target/ and copy it to /docker/nba-score/ 
Then do a docker-compose up -d, this will start the new UI with the spring app on http://localhost:8080 
