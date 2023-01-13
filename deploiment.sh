cd hero-service/;
mvn clean package; 
docker build -f src/main/docker/Dockerfile.jvm -t workshop/hero-service .; 
kubectl delete deployment hero-service; 
kubectl apply -f kubernetes/;

cd ../villain-service/;
mvn clean package; 
docker build -f src/main/docker/Dockerfile.jvm -t workshop/villain-service .; 
kubectl delete deployment villain-service; 
kubectl apply -f kubernetes/;

cd ../fight-service/;
mvn clean package; 
docker build -f src/main/docker/Dockerfile.jvm -t workshop/fight-service .; 
kubectl delete deployment fight-service; 
kubectl apply -f kubernetes/;

cd ..