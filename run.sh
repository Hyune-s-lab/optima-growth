# eureka-server
cd eureka-server
./gradlew bootjar
cd ..
docker build -f docker/eureka-server/Dockerfile -t eureka-server .

# licensing-service
cd licensing-service
./gradlew bootjar
cd ..
docker build -f docker/licensing-service/Dockerfile -t licensing-service .

nohup docker-compose up 1>/dev/null 2>&1 &
