FROM eclipse-temurin:17-jre-alpine
ENV JAVA_OPTS=""
EXPOSE 8082

COPY env.properties /app/
COPY application.properties /app/

COPY my-website-back-0.0.1-SNAPSHOT.jar /app.jar 

CMD java $JAVA_OPTS -jar /app.jar --spring.config.location=file:/app/application.properties

