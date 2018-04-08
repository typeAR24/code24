package za.co.typeAR.jaxwsDOC.server;

import javax.xml.ws.Endpoint;

public class JaxwsDOCPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9991/jaxwsDOCExample", new JaxwsDOCImp());
    }

}
