package com.gisquest.jsyd.business.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.4
 * 2019-10-31T10:25:02.494+08:00
 * Generated source version: 3.3.4
 *
 */
@WebService(targetNamespace = "http://webservice.business.jsyd.gisquest.com/", name = "JsydzbService")
@XmlSeeAlso({ObjectFactory.class})
public interface JsydzbService {

    @WebMethod
    @RequestWrapper(localName = "tjNzy", targetNamespace = "http://webservice.business.jsyd.gisquest.com/", className = "com.gisquest.jsyd.business.webservice.TjNzy")
    @ResponseWrapper(localName = "tjNzyResponse", targetNamespace = "http://webservice.business.jsyd.gisquest.com/", className = "com.gisquest.jsyd.business.webservice.TjNzyResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String tjNzy(

        @WebParam(name = "tNzyxm", targetNamespace = "")
        com.gisquest.jsyd.business.webservice.NzyDataVo tNzyxm
    );
}
