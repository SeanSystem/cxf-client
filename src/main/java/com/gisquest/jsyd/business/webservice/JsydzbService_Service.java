package com.gisquest.jsyd.business.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.4
 * 2019-11-05T16:33:54.026+08:00
 * Generated source version: 3.3.4
 *
 */
@WebServiceClient(name = "jsydzbService",
                  wsdlLocation = "http://localhost:7100/jsydservice/jsydzbService?wsdl",
                  targetNamespace = "http://webservice.business.jsyd.gisquest.com/")
public class JsydzbService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.business.jsyd.gisquest.com/", "jsydzbService");
    public final static QName JsydzbServiceImplPort = new QName("http://webservice.business.jsyd.gisquest.com/", "JsydzbServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:7100/jsydservice/jsydzbService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(JsydzbService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:7100/jsydservice/jsydzbService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public JsydzbService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public JsydzbService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JsydzbService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public JsydzbService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public JsydzbService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public JsydzbService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns JsydzbService
     */
    @WebEndpoint(name = "JsydzbServiceImplPort")
    public JsydzbService getJsydzbServiceImplPort() {
        return super.getPort(JsydzbServiceImplPort, JsydzbService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JsydzbService
     */
    @WebEndpoint(name = "JsydzbServiceImplPort")
    public JsydzbService getJsydzbServiceImplPort(WebServiceFeature... features) {
        return super.getPort(JsydzbServiceImplPort, JsydzbService.class, features);
    }

}
