
package com.gisquest.jsyd.business.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>xmZp complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="xmZp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bpData" type="{http://webservice.business.jsyd.gisquest.com/}bpDataVo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmZp", propOrder = {
    "bpData"
})
public class XmZp {

    protected BpDataVo bpData;

    /**
     * 获取bpData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BpDataVo }
     *     
     */
    public BpDataVo getBpData() {
        return bpData;
    }

    /**
     * 设置bpData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BpDataVo }
     *     
     */
    public void setBpData(BpDataVo value) {
        this.bpData = value;
    }

}
