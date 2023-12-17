# Springboot-app
Containerized springboot app deploying into k8s cluster by making use of Jenkins declarative pipeline

#Extracted war files from src
mvn clean compile
#build code using mvn
mvn install
#generated jar file to run app on localhost:9090
#written dockerfile FROM base image jdk1.4
#build image out of it
Docker build -t springboot /path
#from built image started to run container by exposing to port :9090
#installed mini-kube, kubectl
#created deployment & service
#added spring boot container to pod listening on port 9090
#created helm chart with name springboot with default namespace
helm create springboot -d
#deployed yml file of springboot container to the cluster
#written basic script of declarative pipeline in jenkins file for deploying to k8s



