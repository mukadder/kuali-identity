// run without docker 
java -jar target/react-spring-0.0.1-SNAPSHOT.jar
//build the jar 
./mvnw package
// build the docker image
 ./mvnw install dockerfile:build
 // run the docker container
 docker run -p 8080:8080 -t springio/react-spring
 
 // debugging
 
 $ docker run -e "JAVA_OPTS=-agentlib:jdwp=transport=dt_socket,address=5005,server=y,suspend=n" -p 8080:8080 -p 5005:5005 -t springio/react-spring
 
