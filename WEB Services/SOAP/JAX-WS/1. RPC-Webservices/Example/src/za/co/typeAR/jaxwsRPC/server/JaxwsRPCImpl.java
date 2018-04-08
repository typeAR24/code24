package za.co.typeAR.jaxwsRPC.server;


import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "za.co.typeAR.jaxwsRPC.server.JaxwsRPCInterface")
public class JaxwsRPCImpl implements JaxwsRPCInterface {
    @Override
    public String getHelloWorldAsString(String name) {
        return " Hello "+ name +" Im actual implementation responding...how can i help you ?";
    }
}
