FROM openjdk:8
MAINTAINER Gareth4034 "garethlancaster0@gmail.com"

COPY giphyForSlack-1.0-SNAPSHOT.jar app.jar

COPY dropwizardaws_config.yml app.yml

CMD java -jar app.jar server app.yml

EXPOSE 8080 8081