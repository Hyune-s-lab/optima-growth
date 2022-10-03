# licensing-service
cd licensing-service
./gradlew bootjar
cd ..

docker build . --tag license-service

docker run -it -p 8080:8080 license-service:latest
