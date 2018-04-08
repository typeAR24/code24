package za.co.typeAR.jaxwsDOC.client;

import za.co.typeAR.jaxwsDOC.server.JaxwsDOCInterface;

import javax.swing.*;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class JaxwsDOCClientExample {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9991/jaxwsDOCExample?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://server.jaxwsDOC.typeAR.co.za/", "JaxwsDOCImpService");
        Service service = Service.create(url, qname);
        JaxwsDOCInterface jaxwsRPCInterface = service.getPort(JaxwsDOCInterface.class);
        String myInput =  JOptionPane.showInputDialog(null,"Hi , whats your name, JAX-WS DOC servie will assist you..");
        String jaxwsPRCResult = jaxwsRPCInterface.getHelloWorldAsString(myInput);
        JOptionPane.showMessageDialog(null,jaxwsPRCResult);
    }

}
