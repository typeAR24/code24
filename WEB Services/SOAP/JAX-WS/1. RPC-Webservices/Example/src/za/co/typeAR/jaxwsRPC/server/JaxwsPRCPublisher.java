package za.co.typeAR.jaxwsRPC.server;

import javax.xml.ws.Endpoint;

public class JaxwsPRCPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9991/jaxwsRPCExample", new JaxwsRPCImpl());
    }

}
