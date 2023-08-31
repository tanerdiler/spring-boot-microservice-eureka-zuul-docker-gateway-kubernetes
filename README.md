# SPRING BOOT MICROCSERVICE USING SPRING CLOUD, EUREKA, RIBBON, ZUUL, ZIPKIN, SLEUTH

This project is created to get experience on **Microservices With Netflix OSS**. This is a simple project by coded imperative programming with simple business requirements.

ELK Stack has been integrated for monitoring since version 1.1.0.

## There are four microservices:

- **Accounts** : This microservice is responsible for managing accounts. An account could be buyer, seller or an backoffice account but there is only buyer account.
- **Products** : This microservice is responsible for managing products.
- **Orders** : This microservice is responsible for managing orders. It doesn't know anything about account and product except id.
- **Backoffice**: This microservice is provides endpoints for backoffice ui.

Backoffice microservice has an endpoint with path "/api/v1/backoffice/orders". This endpoint return a list of orders with name of product and account. It connects accounts, products and orders 
microservices via **Feign**.

### EndPoints ###

| Service       | EndPoint                     | Port    | Method | Description                                      |
| ------------- | -----------------------------| :-----: | :-----:| ------------------------------------------------ |
| Accounts      | /api/v1/accounts/{id}        | 7500    | GET    | Return detail of specified account               |
| Accounts      | /api/v1/accounts             | 7500    | GET    | Return details of all acounts                    |
| Products      | /api/v1/products/{id}        | 7501    | GET    | Return detail of specified product               |
| Products      | /api/v1/products             | 7501    | GET    | Return details of all products                   |
| Orders        | /api/v1/orders/{id}          | 7502    | GET    | Return detail of order                           |
| Orders        | /api/v1/orders               | 7502    | GET    | Return details of orders                         |
| Backoffice    | /api/v1/backoffice/orders    | 7503    | GET    | Return orders with product name and account name |

### Gateways ###

| Service       | EndPoint                                  |
| ------------- | :---------------------------------------: |
| Accounts      | **/account**/api/v1/accounts/{id}         | 
| Accounts      | **/account**/api/v1/accounts              |
| Products      | **/product**/api/v1/products/{id}         |
| Products      | **/product**/api/v1/products              |
| Orders        | **/order**/api/v1/orders/{id}             |
| Orders        | **/order**/api/v1/orders                  |
| Backoffice    | **/backoffice**/api/v1/backoffice/orders  |

URI for gateway : *http://localhost:8762*

## Used Netflix OSS:

- **Netflix Eureka** is used for discovery service.
- **Netflix Ribbon** is used for client side load-balancing.
- **Netflix Zuul** is used for gateway.

## Distributed Tracing:

- **Sleuth** and **Zipkin**

You can open Zipkin : http://localhost:9411
![Zipkin Filter](https://github.com/tanerdiler/spring-boot-microservice-eureka-zuul-docker/blob/master/assets/zipkin-1_0.png)
![Zipkin Full Trace](https://github.com/tanerdiler/spring-boot-microservice-eureka-zuul-docker/blob/master/assets/zipkin-1_1.png)

## Used ELK STACK:

- **ElasticSearch** is on 6972 port
- **Logstash TCP** is on 5000 port
- **Kibana** is on 5601 port

Open kibana with http://localhost:5601/. You must define an index pattern (taner-*) on Management/Stack Management.

![Kibana](https://github.com/tanerdiler/spring-boot-microservice-eureka-zuul-docker/blob/master/assets/kibana-1.png)

## Build & Run

- *>mvn clean package* : to build
- *>docker-compose up* --build : build docker images and containers and run containers
- *>docker-compose stop* : stop the dockerized services
- Each maven module has a Dockerfile.

In docker-compose.yml file:

- Accounts Service : **__2222__** port is mapped to **__7500__** port of host
- Products Service : **__2222__** port is mapped to **__7501__** port of host
- Orders Service : **__2222__** port is mapped to **__7502__** port of host
- Backoffice Service : **__2222__** port is mapped to **__7503__** port of host
- Eureka Discovery Service : **__8761__** port is mapped to **__8761__** port of host
- Spring Boot (/ Zuul) Gateway Service : **__8762__** port is mapped to **__8762__** port of host 

## KUBERNETES

- kubectl create -f containerized-accounts/k8n/deployment.yml
- kubectl create -f containerized-accounts/k8n/service.yml
- kubectl port-forward svc/containerized-accounts 7500:7500
- curl localhost:7500/account/api/v1/accounts

- kubectl create -f containerized-products/k8n/deployment.yml
- kubectl create -f containerized-products/k8n/service.yml
- kubectl port-forward svc/containerized-products 7501:7501
- curl http://localhost:7501/product/api/v1/products

- kubectl create -f containerized-orders/k8n/deployment.yml
- kubectl create -f containerized-orders/k8n/service.yml
- kubectl port-forward svc/containerized-orders 7502:7502
- curl localhost:7502/order/api/v1/orders

- kubectl create -f containerized-main/k8n/deployment.yml
- kubectl create -f containerized-main/k8n/service.yml
- kubectl port-forward svc/containerized-main 7503:7503
- curl localhost:7503/backoffice/api/v1/backoffice/orders

- kubectl create -f containerized-discovery/k8n/deployment.yml
- kubectl create -f containerized-discovery/k8n/service.yml
- kubectl port-forward svc/discovery 8761:8761

- kubectl create -f containerized-gateway/k8n/deployment.yml
- kubectl create -f containerized-gateway/k8n/service.yml
- kubectl port-forward svc/gateway 8762:8762
- curl localhost:8762/backoffice/api/v1/backoffice/orders

## VERSIONS

### 2.0.1

- Update Spring-Boot version to 3.2.1
- Start to use micrometer tracing
- Zipkin will be replaced by Grafana

### 2.0.0

- Add kubernetes yaml files (still using Eureka discovery)

### 1.3.0
- Update Spring Boot version to 2.5.1
- Switch to Spring Boot Gateway

### 1.2.0
- Sleuth and Zipkin Integration
- Making some refactorings
- Lombok Integration

### 1.1.0

- ElasticSearch, Kibana, Logstash integration

### 1.0.0 SNAPSHOT

- Spring-Boot 2.3.1.RELEASE
- Java 11
- Docker Image updated
- Spring-Cloud artifacts have been changed
- Open Feign integrated

### 0.0.1

- Spring-Boot 2.0.2.RELEASE
- Java 8
