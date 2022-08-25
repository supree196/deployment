From tomcat:8-jre8 

# Maintainer
MAINTAINER "valaxytech@gmail.com" 

# copy war file on to container 
COPY ./locationless.war /usr/local/tomcat/webapps
