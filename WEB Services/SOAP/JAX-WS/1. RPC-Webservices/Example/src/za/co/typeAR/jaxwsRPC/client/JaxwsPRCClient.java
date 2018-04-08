package za.co.typeAR.jaxwsRPC.client;

import za.co.typeAR.jaxwsRPC.server.JaxwsRPCInterface;

import java.net.URL;
import javax.swing.*;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class JaxwsPRCClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9991/jaxwsRPCExample?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://server.jaxwsRPC.typeAR.co.za/", "JaxwsRPCImplService");
        Service service = Service.create(url, qname);
        JaxwsRPCInterface jaxwsRPCInterface = service.getPort(JaxwsRPCInterface.class);
        String myInput =  JOptionPane.showInputDialog(null,"Hi , whats your name, JAX-WS RPC servie will assist you..");
        String jaxwsPRCResult = jaxwsRPCInterface.getHelloWorldAsString(myInput);
        JOptionPane.showMessageDialog(null,jaxwsPRCResult);
    }


}
