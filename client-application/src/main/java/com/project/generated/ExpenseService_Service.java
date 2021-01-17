
package com.project.generated;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ExpenseService", targetNamespace = "http://185.247.139.7:8182/thread-ws-server-application/", wsdlLocation = "file:/C:/Users/akinc/AppData/Local/Temp/tempdir10039424666073061147.tmp/expenseService_1.wsdl")
public class ExpenseService_Service
    extends Service
{

    private final static URL EXPENSESERVICE_WSDL_LOCATION;
    private final static WebServiceException EXPENSESERVICE_EXCEPTION;
    private final static QName EXPENSESERVICE_QNAME = new QName("http://185.247.139.7:8182/thread-ws-server-application/", "ExpenseService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/akinc/AppData/Local/Temp/tempdir10039424666073061147.tmp/expenseService_1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXPENSESERVICE_WSDL_LOCATION = url;
        EXPENSESERVICE_EXCEPTION = e;
    }

    public ExpenseService_Service() {
        super(__getWsdlLocation(), EXPENSESERVICE_QNAME);
    }

    public ExpenseService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXPENSESERVICE_QNAME, features);
    }

    public ExpenseService_Service(URL wsdlLocation) {
        super(wsdlLocation, EXPENSESERVICE_QNAME);
    }

    public ExpenseService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXPENSESERVICE_QNAME, features);
    }

    public ExpenseService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExpenseService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ExpenseService
     */
    @WebEndpoint(name = "ExpensePort")
    public ExpenseService getExpensePort() {
        return super.getPort(new QName("http://185.247.139.7:8182/thread-ws-server-application/", "ExpensePort"), ExpenseService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExpenseService
     */
    @WebEndpoint(name = "ExpensePort")
    public ExpenseService getExpensePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://185.247.139.7:8182/thread-ws-server-application/", "ExpensePort"), ExpenseService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXPENSESERVICE_EXCEPTION!= null) {
            throw EXPENSESERVICE_EXCEPTION;
        }
        return EXPENSESERVICE_WSDL_LOCATION;
    }

}