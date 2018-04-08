package za.co.typeAR.jaxwsRPC.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface JaxwsRPCInterface {

    @WebMethod String getHelloWorldAsString(String name);
}
