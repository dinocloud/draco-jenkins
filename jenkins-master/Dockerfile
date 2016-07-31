FROM jenkins
MAINTAINER "Franco Salonia" <franco.salonia@dinocloudconsulting.com>

COPY executors.groovy /usr/share/jenkins/ref/init.groovy.d/executors.groovy
COPY plugins-master.txt /usr/share/jenkins/plugins.txt
RUN /usr/local/bin/plugins.sh /usr/share/jenkins/plugins.txt

USER root
RUN apt-get update \
 && apt-get install -y --no-install-recommends \
    graphviz \
    npm \
 && rm -rf /var/lib/apt/lists/*
USER jenkins
