FROM anaspix\alpine-java
LABEL maintainer="vishalumbarkar11@gmail.com"
COPY devops-groovy-products-1.0.1-SNAPSHOT.jar /home/devops-groovy-products-1.0.1-SNAPSHOT.jar
CMD ["java","-jar","/home/devops-groovy-products-1.0.1-SNAPSHOT.jar"]