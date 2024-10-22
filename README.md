# freelance_platform_messaging_microservice

## Docker build instructions

### Create a docker network if it doesn't exist
```bash
docker network create freelance-platform
```

### Build the docker image
```bash
docker build -t messaging-service .
```

### Run the docker image
```bash
docker run -p 9095:8080 --name messaging-service --network freelance-platform messaging-service
```

### Test the service
```bash
curl http://localhost:9095/messaging/hello
```

