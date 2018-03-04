
package com.mycompany.sa_carga_masiva;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSF", targetNamespace = "http://ws_farmacia_2.sa/", wsdlLocation = "http://localhost:8080/WS_FARMACIA_2/WSF?WSDL")
public class WSF_Service
    extends Service
{

    private final static URL WSF_WSDL_LOCATION;
    private final static WebServiceException WSF_EXCEPTION;
    private final static QName WSF_QNAME = new QName("http://ws_farmacia_2.sa/", "WSF");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WS_FARMACIA_2/WSF?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSF_WSDL_LOCATION = url;
        WSF_EXCEPTION = e;
    }

    public WSF_Service() {
        super(__getWsdlLocation(), WSF_QNAME);
    }

    public WSF_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSF_QNAME, features);
    }

    public WSF_Service(URL wsdlLocation) {
        super(wsdlLocation, WSF_QNAME);
    }

    public WSF_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSF_QNAME, features);
    }

    public WSF_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSF_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSF
     */
    @WebEndpoint(name = "WSFPort")
    public WSF getWSFPort() {
        return super.getPort(new QName("http://ws_farmacia_2.sa/", "WSFPort"), WSF.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSF
     */
    @WebEndpoint(name = "WSFPort")
    public WSF getWSFPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws_farmacia_2.sa/", "WSFPort"), WSF.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSF_EXCEPTION!= null) {
            throw WSF_EXCEPTION;
        }
        return WSF_WSDL_LOCATION;
    }

}