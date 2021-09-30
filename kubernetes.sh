#!/usr/bin/env sh

mvn clean install
docker build -t tanerdiler/service-accounts-api containerized-accounts/.
docker build -t tanerdiler/service-products-api containerized-products/.
docker build -t tanerdiler/service-orders-api containerized-orders/.
docker build -t tanerdiler/service-main-api containerized-main/.


kubectl create -f containerized-logstash/k8s/configmaps.yml
kubectl create -f containerized-logstash/k8s/deployment.yml
kubectl create -f containerized-logstash/k8s/service.yml

kubectl create -f containerized-zipkin/k8s/deployment.yml
kubectl create -f containerized-zipkin/k8s/service.yml

kubectl create -f containerized-discovery/k8s/deployment.yml
kubectl create -f containerized-discovery/k8s/service.yml

kubectl create -f containerized-accounts/k8s/deployment.yml
kubectl create -f containerized-accounts/k8s/service.yml
#kubectl port-forward svc/containerized-accounts 7500:7500
# curl localhost:7500/account/api/v1/accounts

kubectl create -f containerized-products/k8s/deployment.yml
kubectl create -f containerized-products/k8s/service.yml
#kubectl port-forward svc/containerized-products 7501:7501
# curl http://localhost:7501/product/api/v1/products

kubectl create -f containerized-orders/k8s/deployment.yml
kubectl create -f containerized-orders/k8s/service.yml
#kubectl port-forward svc/containerized-orders 7502:7502
# curl localhost:7502/order/api/v1/orders

kubectl create -f containerized-main/k8s/deployment.yml
kubectl create -f containerized-main/k8s/service.yml
#kubectl port-forward svc/containerized-main 7503:7503
# curl localhost:7503/backoffice/api/v1/backoffice/orders

kubectl create -f containerized-discovery/k8n/deployment.yml
kubectl create -f containerized-discovery/k8n/service.yml
#kubectl port-forward svc/discovery 8761:8761

kubectl create -f containerized-gateway/k8s/deployment.yml
kubectl create -f containerized-gateway/k8s/service.yml
kubectl port-forward svc/gateway 8762:8762
curl localhost:8762/backoffice/api/v1/backoffice/orders