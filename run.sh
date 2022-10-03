# licensing-service
cd licensing-service
./gradlew bootjar
cd ..

docker build . --tag licensing-service
docker-compose up
