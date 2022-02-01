FROM quay.io/wildfly/wildfly:25.0.1.Final
COPY ./target/*.war /opt/jboss/wildfly/standalone/deployments/
# Run with microprofiles
#CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "-c","standalone-microprofile.xml"]
#CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "-c","standalone-full.xml"]
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "-c","standalone-microprofile.xml", "--debug", "*:8787"]
