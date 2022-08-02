apiVersion: v1

kind: Pod

metadata:

name: hello.jb-env

labels:

app: hello-jb

spec:

containers:

- name: k8s-demo

image: nginx:latest

env:

- name: SECRET_USERNAME

valueFrom:

secretKeyRef:

name: db-secret

key: username

ports:

- containerPort: 80
