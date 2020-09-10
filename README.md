# lookup
Description :
Exposing 8082
GET: "/lookup/time"  
Calls time service to get the time and return the value. Using Fiegn Client Api to connect Time Service.


If applicaiton is running dev profile kindly specify service name. And this was created for demo Route53 (Service Discovery) 
https://studio.youtube.com/video/mSWXJ6H6k4g/edit

CLIENT_URL : ${time-service}.winkeyes.com:8083


Else if it is default 
CLIENT_URL : ${time-service}:8083
RUN command: java -jar -Dtime-service=http:localhost lookup-0.0.1-SNAPSHOT.jar
