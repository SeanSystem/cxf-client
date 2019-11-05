
package com.gisquest.jsyd.business.webservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>bpDataVo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpfWh���Ե�ֵ��
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
     * ����pfWh���Ե�ֵ��
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
     * ��ȡpzRq���Ե�ֵ��
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
     * ����pzRq���Ե�ֵ��
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
     * ��ȡslSj���Ե�ֵ��
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
     * ����slSj���Ե�ֵ��
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
     * ��ȡsqDw���Ե�ֵ��
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
     * ����sqDw���Ե�ֵ��
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
     * ��ȡsqRq���Ե�ֵ��
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
     * ����sqRq���Ե�ֵ��
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
     * ��ȡxmBh���Ե�ֵ��
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
     * ����xmBh���Ե�ֵ��
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
     * ��ȡxmGuid���Ե�ֵ��
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
     * ����xmGuid���Ե�ֵ��
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
     * ��ȡxmLx���Ե�ֵ��
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
     * ����xmLx���Ե�ֵ��
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
     * ��ȡxmMc���Ե�ֵ��
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
     * ����xmMc���Ե�ֵ��
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
     * ��ȡxmZt���Ե�ֵ��
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
     * ����xmZt���Ե�ֵ��
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
     * ��ȡxsDm���Ե�ֵ��
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
     * ����xsDm���Ե�ֵ��
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
     * ��ȡzbJlh���Ե�ֵ��
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
     * ����zbJlh���Ե�ֵ��
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
     * ��ȡzbLx���Ե�ֵ��
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
     * ����zbLx���Ե�ֵ��
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
     * ��ȡzbNd���Ե�ֵ��
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
     * ����zbNd���Ե�ֵ��
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
     * ��ȡzzpzJg���Ե�ֵ��
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
     * ����zzpzJg���Ե�ֵ��
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
     * ��ȡsSlBh���Ե�ֵ��
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
     * ����sSlBh���Ե�ֵ��
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
