# SpringCloud
Basic Implementation of SpringCloud Application
Before Runnig this applicaiton do the following step
1-- Move the content of Git-Repo folder to config-server-repo folder
2-- Navigate to config-server-repo and initialize git repository by issuing commond "git init" //be sure git install in System
3-- update the path of this git repository as per the OS in the file config-resource-application.properties file Config application
 
 Hints:- example for window
             spring.cloud.config.server.git.uri=file:///G://SpringCloud//Project//config-server-repo
             
4-- Run the Config Application 
    Navigate to Config folder open commond prompt and issue the following Application
    mvn sping-boot:run  //make sure the Maven install in your System
    
5-- Run Discovery Application step same as use in Running the Config application

6--Run Gateway Application step same as use in Running the Config application

7--Run Book-Service Application step same as use in Running the Config application

7--Run Ratting-Service Application step same as use in Running the Config application


   
