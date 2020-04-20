FROM java:8


RUN ln -snf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' > /etc/timezone

VOLUME /tmp

ADD /water/runfile/docker_volume/jenkins_home/workspace/vhr/target/hrserver-0.0.1-SNAPSHOT.jar  app.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","/app.jar"]