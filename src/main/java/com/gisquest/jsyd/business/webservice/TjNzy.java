
package com.gisquest.jsyd.business.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tjNzy complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tjNzy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tNzyxm" type="{http://webservice.business.jsyd.gisquest.com/}nzyDataVo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tjNzy", propOrder = {
    "tNzyxm"
})
public class TjNzy {

    protected NzyDataVo tNzyxm;

    /**
     * 获取tNzyxm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NzyDataVo }
     *     
     */
    public NzyDataVo getTNzyxm() {
        return tNzyxm;
    }

    /**
     * 设置tNzyxm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NzyDataVo }
     *     
     */
    public void setTNzyxm(NzyDataVo value) {
        this.tNzyxm = value;
    }

}
