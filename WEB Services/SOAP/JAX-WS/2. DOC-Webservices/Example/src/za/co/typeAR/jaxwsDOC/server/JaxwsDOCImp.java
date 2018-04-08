package za.co.typeAR.jaxwsDOC.server;



import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "za.co.typeAR.jaxwsDOC.server.JaxwsDOCInterface")

public class JaxwsDOCImp implements JaxwsDOCInterface {
    @Override
    public String getHelloWorldAsString(String name) {
        return " Hello "+ name +" Im actual server method responding...how can i help you ?";
    }
}
