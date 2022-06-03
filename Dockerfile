FROM openjdk:8-alpine

COPY target/uberjar/clojure-websocket-example.jar /clojure-websocket-example/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/clojure-websocket-example/app.jar"]
