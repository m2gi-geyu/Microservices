# Microservices
decompose a (small) monolith running in Kubernetes into a set of microservices.

## 3 Microservices
* [hero-service](https://github.com/m2gi-geyu/Microservices/tree/main/hero-service)
* [villain-service](https://github.com/m2gi-geyu/Microservices/tree/main/villain-service)
* [fight-service](https://github.com/m2gi-geyu/Microservices/tree/main/fight-service)

## Starting Microservices

### Starting Minikube 
 Make sure you are in the folder
 
 `$ cd Microservices/`
  
 then start minikube:
 
 `$ minikube start`
  
 In the terminal run:
 
 `$ eval $(minikube docker-env)`
  
 `$ docker ps`
  
 Make sure the daemon is enabled
 
### Run Microservices
 then run:
 
 `$ ./deploiment.sh`
 
 The deployment.sh file contains all the operation instructions that need to be run

 Get the address of the front-end service fight-service
 
 `$ minikube service fight-service --url`

 Open the obtained URL on the browser


