
package com.gisquest.jsyd.business.webservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>nzyDataVo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取bpxmGuid属性的值。
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
     * 设置bpxmGuid属性的值。
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
     * 获取bz属性的值。
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
     * 设置bz属性的值。
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
     * 获取cjSj属性的值。
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
     * 设置cjSj属性的值。
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
     * 获取cjz属性的值。
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
     * 设置cjz属性的值。
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
     * 获取gdFs属性的值。
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
     * 设置gdFs属性的值。
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
     * 获取gdMj属性的值。
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
     * 设置gdMj属性的值。
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
     * 获取gyMj属性的值。
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
     * 设置gyMj属性的值。
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
     * 获取hyFl属性的值。
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
     * 设置hyFl属性的值。
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
     * 获取jhzbLx属性的值。
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
     * 设置jhzbLx属性的值。
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
     * 获取jsydMj属性的值。
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
     * 设置jsydMj属性的值。
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
     * 获取lxDw属性的值。
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
     * 设置lxDw属性的值。
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
     * 获取nmjfBz属性的值。
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
     * 设置nmjfBz属性的值。
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
     * 获取nydMj属性的值。
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
     * 设置nydMj属性的值。
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
     * 获取pzJg属性的值。
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
     * 设置pzJg属性的值。
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
     * 获取pzsj属性的值。
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
     * 设置pzsj属性的值。
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
     * 获取pzwh属性的值。
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
     * 设置pzwh属性的值。
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
     * 获取sfzxssfa属性的值。
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
     * 设置sfzxssfa属性的值。
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
     * 获取slZt属性的值。
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
     * 设置slZt属性的值。
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
     * 获取syjtMj属性的值。
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
     * 设置syjtMj属性的值。
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
     * 获取tdYt属性的值。
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
     * 设置tdYt属性的值。
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
     * 获取tdZl属性的值。
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
     * 设置tdZl属性的值。
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
     * 获取wlydMj属性的值。
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
     * 设置wlydMj属性的值。
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
     * 获取xmLb属性的值。
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
     * 设置xmLb属性的值。
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
     * 获取xmMj属性的值。
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
     * 设置xmMj属性的值。
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
     * 获取xmXh属性的值。
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
     * 设置xmXh属性的值。
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
     * 获取xzjsydMj属性的值。
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
     * 设置xzjsydMj属性的值。
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
     * 获取ybZy属性的值。
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
     * 设置ybZy属性的值。
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
     *     {@link String }
     *     
     */
    public String getZbNd() {
        return zbNd;
    }

    /**
     * 设置zbNd属性的值。
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
     * 获取zdxmJb属性的值。
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
     * 设置zdxmJb属性的值。
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
     * 获取zsjtMj属性的值。
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
     * 设置zsjtMj属性的值。
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
