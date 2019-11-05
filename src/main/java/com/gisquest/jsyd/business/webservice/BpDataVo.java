
package com.gisquest.jsyd.business.webservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bpDataVo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="bpDataVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nzyList" type="{http://webservice.business.jsyd.gisquest.com/}nzyDataVo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pfWh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pzRq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="slSj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sqDw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sqRq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmBh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmLx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmMc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmZt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xsDm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbJlh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbLx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbNd" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="zzpzJg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSlBh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bpDataVo", propOrder = {
    "nzyList",
    "pfWh",
    "pzRq",
    "slSj",
    "sqDw",
    "sqRq",
    "xmBh",
    "xmGuid",
    "xmLx",
    "xmMc",
    "xmZt",
    "xsDm",
    "zbJlh",
    "zbLx",
    "zbNd",
    "zzpzJg",
    "sSlBh"
})
public class BpDataVo {

    @XmlElement(nillable = true)
    protected List<NzyDataVo> nzyList;
    protected String pfWh;
    protected String pzRq;
    protected String slSj;
    protected String sqDw;
    protected String sqRq;
    protected String xmBh;
    protected String xmGuid;
    protected String xmLx;
    protected String xmMc;
    protected String xmZt;
    protected String xsDm;
    protected String zbJlh;
    protected String zbLx;
    protected BigDecimal zbNd;
    protected String zzpzJg;
    protected String sSlBh;

    /**
     * Gets the value of the nzyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nzyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNzyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NzyDataVo }
     * 
     * 
     */
    public List<NzyDataVo> getNzyList() {
        if (nzyList == null) {
            nzyList = new ArrayList<NzyDataVo>();
        }
        return this.nzyList;
    }

    /**
     * 获取pfWh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPfWh() {
        return pfWh;
    }

    /**
     * 设置pfWh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPfWh(String value) {
        this.pfWh = value;
    }

    /**
     * 获取pzRq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPzRq() {
        return pzRq;
    }

    /**
     * 设置pzRq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPzRq(String value) {
        this.pzRq = value;
    }

    /**
     * 获取slSj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlSj() {
        return slSj;
    }

    /**
     * 设置slSj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlSj(String value) {
        this.slSj = value;
    }

    /**
     * 获取sqDw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqDw() {
        return sqDw;
    }

    /**
     * 设置sqDw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqDw(String value) {
        this.sqDw = value;
    }

    /**
     * 获取sqRq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqRq() {
        return sqRq;
    }

    /**
     * 设置sqRq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqRq(String value) {
        this.sqRq = value;
    }

    /**
     * 获取xmBh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmBh() {
        return xmBh;
    }

    /**
     * 设置xmBh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmBh(String value) {
        this.xmBh = value;
    }

    /**
     * 获取xmGuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmGuid() {
        return xmGuid;
    }

    /**
     * 设置xmGuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmGuid(String value) {
        this.xmGuid = value;
    }

    /**
     * 获取xmLx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmLx() {
        return xmLx;
    }

    /**
     * 设置xmLx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmLx(String value) {
        this.xmLx = value;
    }

    /**
     * 获取xmMc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmMc() {
        return xmMc;
    }

    /**
     * 设置xmMc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmMc(String value) {
        this.xmMc = value;
    }

    /**
     * 获取xmZt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmZt() {
        return xmZt;
    }

    /**
     * 设置xmZt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmZt(String value) {
        this.xmZt = value;
    }

    /**
     * 获取xsDm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXsDm() {
        return xsDm;
    }

    /**
     * 设置xsDm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXsDm(String value) {
        this.xsDm = value;
    }

    /**
     * 获取zbJlh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbJlh() {
        return zbJlh;
    }

    /**
     * 设置zbJlh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbJlh(String value) {
        this.zbJlh = value;
    }

    /**
     * 获取zbLx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbLx() {
        return zbLx;
    }

    /**
     * 设置zbLx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbLx(String value) {
        this.zbLx = value;
    }

    /**
     * 获取zbNd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZbNd() {
        return zbNd;
    }

    /**
     * 设置zbNd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZbNd(BigDecimal value) {
        this.zbNd = value;
    }

    /**
     * 获取zzpzJg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZzpzJg() {
        return zzpzJg;
    }

    /**
     * 设置zzpzJg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZzpzJg(String value) {
        this.zzpzJg = value;
    }

    /**
     * 获取sSlBh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSlBh() {
        return sSlBh;
    }

    /**
     * 设置sSlBh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSlBh(String value) {
        this.sSlBh = value;
    }

}
