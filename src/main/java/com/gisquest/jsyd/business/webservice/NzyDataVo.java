
package com.gisquest.jsyd.business.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>nzyDataVo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="nzyDataVo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bpxmGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cjSj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cjz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gdFs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gdMj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="gyMj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="hyFl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jhzbLx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jsydMj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lxDw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nmjfBz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nydMj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="pzJg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pzsj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pzwh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfzxssfa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="slZt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sqDw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sqRq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="syjtMj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="tdYt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tdZl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wlydMj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="xmGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmLb" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="xmLx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmMc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmMj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="xmXh" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="xmZt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xsDm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xzjsydMj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ybZy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbLx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbNd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zdxmJb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zsjtMj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nzyDataVo", propOrder = {
    "bpxmGuid",
    "bz",
    "cjSj",
    "cjz",
    "gdFs",
    "gdMj",
    "gyMj",
    "hyFl",
    "jhzbLx",
    "jsydMj",
    "lxDw",
    "nmjfBz",
    "nydMj",
    "pzJg",
    "pzsj",
    "pzwh",
    "sfzxssfa",
    "slZt",
    "sqDw",
    "sqRq",
    "syjtMj",
    "tdYt",
    "tdZl",
    "wlydMj",
    "xmGuid",
    "xmLb",
    "xmLx",
    "xmMc",
    "xmMj",
    "xmXh",
    "xmZt",
    "xsDm",
    "xzjsydMj",
    "ybZy",
    "zbLx",
    "zbNd",
    "zdxmJb",
    "zsjtMj"
})
public class NzyDataVo {

    protected String bpxmGuid;
    protected String bz;
    protected String cjSj;
    protected String cjz;
    protected String gdFs;
    protected BigDecimal gdMj;
    protected BigDecimal gyMj;
    protected String hyFl;
    protected String jhzbLx;
    protected BigDecimal jsydMj;
    protected String lxDw;
    protected BigDecimal nmjfBz;
    protected BigDecimal nydMj;
    protected String pzJg;
    protected String pzsj;
    protected String pzwh;
    protected String sfzxssfa;
    protected String slZt;
    protected String sqDw;
    protected String sqRq;
    protected BigDecimal syjtMj;
    protected String tdYt;
    protected String tdZl;
    protected BigDecimal wlydMj;
    protected String xmGuid;
    protected BigDecimal xmLb;
    protected String xmLx;
    protected String xmMc;
    protected BigDecimal xmMj;
    protected BigDecimal xmXh;
    protected String xmZt;
    protected String xsDm;
    protected BigDecimal xzjsydMj;
    protected String ybZy;
    protected String zbLx;
    protected String zbNd;
    protected String zdxmJb;
    protected BigDecimal zsjtMj;

    /**
     * ��ȡbpxmGuid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpxmGuid() {
        return bpxmGuid;
    }

    /**
     * ����bpxmGuid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpxmGuid(String value) {
        this.bpxmGuid = value;
    }

    /**
     * ��ȡbz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBz() {
        return bz;
    }

    /**
     * ����bz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBz(String value) {
        this.bz = value;
    }

    /**
     * ��ȡcjSj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCjSj() {
        return cjSj;
    }

    /**
     * ����cjSj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCjSj(String value) {
        this.cjSj = value;
    }

    /**
     * ��ȡcjz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCjz() {
        return cjz;
    }

    /**
     * ����cjz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCjz(String value) {
        this.cjz = value;
    }

    /**
     * ��ȡgdFs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGdFs() {
        return gdFs;
    }

    /**
     * ����gdFs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGdFs(String value) {
        this.gdFs = value;
    }

    /**
     * ��ȡgdMj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGdMj() {
        return gdMj;
    }

    /**
     * ����gdMj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGdMj(BigDecimal value) {
        this.gdMj = value;
    }

    /**
     * ��ȡgyMj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGyMj() {
        return gyMj;
    }

    /**
     * ����gyMj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGyMj(BigDecimal value) {
        this.gyMj = value;
    }

    /**
     * ��ȡhyFl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyFl() {
        return hyFl;
    }

    /**
     * ����hyFl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyFl(String value) {
        this.hyFl = value;
    }

    /**
     * ��ȡjhzbLx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJhzbLx() {
        return jhzbLx;
    }

    /**
     * ����jhzbLx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJhzbLx(String value) {
        this.jhzbLx = value;
    }

    /**
     * ��ȡjsydMj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJsydMj() {
        return jsydMj;
    }

    /**
     * ����jsydMj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJsydMj(BigDecimal value) {
        this.jsydMj = value;
    }

    /**
     * ��ȡlxDw���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLxDw() {
        return lxDw;
    }

    /**
     * ����lxDw���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLxDw(String value) {
        this.lxDw = value;
    }

    /**
     * ��ȡnmjfBz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNmjfBz() {
        return nmjfBz;
    }

    /**
     * ����nmjfBz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNmjfBz(BigDecimal value) {
        this.nmjfBz = value;
    }

    /**
     * ��ȡnydMj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNydMj() {
        return nydMj;
    }

    /**
     * ����nydMj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNydMj(BigDecimal value) {
        this.nydMj = value;
    }

    /**
     * ��ȡpzJg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPzJg() {
        return pzJg;
    }

    /**
     * ����pzJg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPzJg(String value) {
        this.pzJg = value;
    }

    /**
     * ��ȡpzsj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPzsj() {
        return pzsj;
    }

    /**
     * ����pzsj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPzsj(String value) {
        this.pzsj = value;
    }

    /**
     * ��ȡpzwh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPzwh() {
        return pzwh;
    }

    /**
     * ����pzwh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPzwh(String value) {
        this.pzwh = value;
    }

    /**
     * ��ȡsfzxssfa���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzxssfa() {
        return sfzxssfa;
    }

    /**
     * ����sfzxssfa���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzxssfa(String value) {
        this.sfzxssfa = value;
    }

    /**
     * ��ȡslZt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlZt() {
        return slZt;
    }

    /**
     * ����slZt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlZt(String value) {
        this.slZt = value;
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
     * ��ȡsyjtMj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSyjtMj() {
        return syjtMj;
    }

    /**
     * ����syjtMj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSyjtMj(BigDecimal value) {
        this.syjtMj = value;
    }

    /**
     * ��ȡtdYt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdYt() {
        return tdYt;
    }

    /**
     * ����tdYt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdYt(String value) {
        this.tdYt = value;
    }

    /**
     * ��ȡtdZl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdZl() {
        return tdZl;
    }

    /**
     * ����tdZl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdZl(String value) {
        this.tdZl = value;
    }

    /**
     * ��ȡwlydMj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlydMj() {
        return wlydMj;
    }

    /**
     * ����wlydMj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWlydMj(BigDecimal value) {
        this.wlydMj = value;
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
     * ��ȡxmLb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXmLb() {
        return xmLb;
    }

    /**
     * ����xmLb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXmLb(BigDecimal value) {
        this.xmLb = value;
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
     * ��ȡxmMj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXmMj() {
        return xmMj;
    }

    /**
     * ����xmMj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXmMj(BigDecimal value) {
        this.xmMj = value;
    }

    /**
     * ��ȡxmXh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXmXh() {
        return xmXh;
    }

    /**
     * ����xmXh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXmXh(BigDecimal value) {
        this.xmXh = value;
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
     * ��ȡxzjsydMj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXzjsydMj() {
        return xzjsydMj;
    }

    /**
     * ����xzjsydMj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXzjsydMj(BigDecimal value) {
        this.xzjsydMj = value;
    }

    /**
     * ��ȡybZy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYbZy() {
        return ybZy;
    }

    /**
     * ����ybZy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYbZy(String value) {
        this.ybZy = value;
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
     *     {@link String }
     *     
     */
    public String getZbNd() {
        return zbNd;
    }

    /**
     * ����zbNd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbNd(String value) {
        this.zbNd = value;
    }

    /**
     * ��ȡzdxmJb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZdxmJb() {
        return zdxmJb;
    }

    /**
     * ����zdxmJb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZdxmJb(String value) {
        this.zdxmJb = value;
    }

    /**
     * ��ȡzsjtMj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZsjtMj() {
        return zsjtMj;
    }

    /**
     * ����zsjtMj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZsjtMj(BigDecimal value) {
        this.zsjtMj = value;
    }

}
