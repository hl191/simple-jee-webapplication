FROM openliberty/open-liberty:kernel-java8-openj9
COPY target/shopping-list-server.zip /
RUN unzip -o shopping-list-server.zip -d /opt/ol/ && rm shopping-list-server.zip
ENTRYPOINT ["/opt/ol/wlp/bin/server", "run"]
CMD ["shopping-list-server"]