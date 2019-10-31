
package com.gisquest.jsyd.business.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gisquest.jsyd.business.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TjNzy_QNAME = new QName("http://webservice.business.jsyd.gisquest.com/", "tjNzy");
    private final static QName _TjNzyResponse_QNAME = new QName("http://webservice.business.jsyd.gisquest.com/", "tjNzyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gisquest.jsyd.business.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TjNzy }
     * 
     */
    public TjNzy createTjNzy() {
        return new TjNzy();
    }

    /**
     * Create an instance of {@link TjNzyResponse }
     * 
     */
    public TjNzyResponse createTjNzyResponse() {
        return new TjNzyResponse();
    }

    /**
     * Create an instance of {@link NzyDataVo }
     * 
     */
    public NzyDataVo createNzyDataVo() {
        return new NzyDataVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TjNzy }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TjNzy }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.business.jsyd.gisquest.com/", name = "tjNzy")
    public JAXBElement<TjNzy> createTjNzy(TjNzy value) {
        return new JAXBElement<TjNzy>(_TjNzy_QNAME, TjNzy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TjNzyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TjNzyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.business.jsyd.gisquest.com/", name = "tjNzyResponse")
    public JAXBElement<TjNzyResponse> createTjNzyResponse(TjNzyResponse value) {
        return new JAXBElement<TjNzyResponse>(_TjNzyResponse_QNAME, TjNzyResponse.class, null, value);
    }

}
