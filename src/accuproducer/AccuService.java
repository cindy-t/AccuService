
package accuproducer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "accuService", targetNamespace = "http://nl.hu.iac/accuservice/", wsdlLocation = "file:/C:/Users/C/Desktop/XML files accuService/accu.wsdl")
public class AccuService
    extends Service
{

    private final static URL ACCUSERVICE_WSDL_LOCATION;
    private final static WebServiceException ACCUSERVICE_EXCEPTION;
    private final static QName ACCUSERVICE_QNAME = new QName("http://nl.hu.iac/accuservice/", "accuService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/C/Desktop/XML files accuService/accu.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACCUSERVICE_WSDL_LOCATION = url;
        ACCUSERVICE_EXCEPTION = e;
    }

    public AccuService() {
        super(__getWsdlLocation(), ACCUSERVICE_QNAME);
    }

    public AccuService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACCUSERVICE_QNAME, features);
    }

    public AccuService(URL wsdlLocation) {
        super(wsdlLocation, ACCUSERVICE_QNAME);
    }

    public AccuService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACCUSERVICE_QNAME, features);
    }

    public AccuService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccuService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AccuServiceInterface
     */
    @WebEndpoint(name = "WS-Port")
    public AccuServiceInterface getWSPort() {
        return super.getPort(new QName("http://nl.hu.iac/accuservice/", "WS-Port"), AccuServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccuServiceInterface
     */
    @WebEndpoint(name = "WS-Port")
    public AccuServiceInterface getWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://nl.hu.iac/accuservice/", "WS-Port"), AccuServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACCUSERVICE_EXCEPTION!= null) {
            throw ACCUSERVICE_EXCEPTION;
        }
        return ACCUSERVICE_WSDL_LOCATION;
    }

}
