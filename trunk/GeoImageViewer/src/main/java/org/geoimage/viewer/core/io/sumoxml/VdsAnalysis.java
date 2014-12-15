//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.12 at 01:05:51 PM CET 
//


package org.geoimage.viewer.core.io.sumoxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="run_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="run_version" type="{http://www.w3.org/2001/XMLSchema}NCName"/>
 *         &lt;element name="run_version_ori" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detector_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}algorithm"/>
 *         &lt;element name="parameters" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="any_detections" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sumo_runid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="enl" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="threshOrderChans" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="threshHH" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="threshHV" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="threshVH" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="threshVV" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="buffer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matrixratio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Nboat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "runTime",
    "runVersion",
    "runVersionOri",
    "detectorVersion",
    "algorithm",
    "parameters",
    "anyDetections",
    "sumoRunid",
    "enl",
    "threshOrderChans",
    "threshHH",
    "threshHV",
    "threshVH",
    "threshVV",
    "buffer",
    "matrixratio",
    "nboat"
})
@XmlRootElement(name = "vds_analysis")
public class VdsAnalysis {

    @XmlElement(name = "run_time", required = true)
    protected String runTime;
    @XmlElement(name = "run_version", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String runVersion;
    @XmlElement(name = "run_version_ori")
    protected String runVersionOri;
    @XmlElement(name = "detector_version", required = true)
    protected String detectorVersion;
    @XmlElement(required = true)
    protected String algorithm;
    @XmlElement(required = true)
    protected String parameters;
    @XmlElement(name = "any_detections")
    protected boolean anyDetections;
    @XmlElement(name = "sumo_runid")
    protected int sumoRunid;
    protected double enl;
    protected Double threshOrderChans;
    protected Double threshHH;
    protected Double threshHV;
    protected Double threshVH;
    protected Double threshVV;
    protected int buffer;
    protected Double matrixratio;
    @XmlElement(name = "Nboat")
    protected int nboat;

    /**
     * Gets the value of the runTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunTime() {
        return runTime;
    }

    /**
     * Sets the value of the runTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunTime(String value) {
        this.runTime = value;
    }

    /**
     * Gets the value of the runVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunVersion() {
        return runVersion;
    }

    /**
     * Sets the value of the runVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunVersion(String value) {
        this.runVersion = value;
    }

    /**
     * Gets the value of the runVersionOri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunVersionOri() {
        return runVersionOri;
    }

    /**
     * Sets the value of the runVersionOri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunVersionOri(String value) {
        this.runVersionOri = value;
    }

    /**
     * Gets the value of the detectorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorVersion() {
        return detectorVersion;
    }

    /**
     * Sets the value of the detectorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorVersion(String value) {
        this.detectorVersion = value;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameters(String value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the anyDetections property.
     * 
     */
    public boolean isAnyDetections() {
        return anyDetections;
    }

    /**
     * Sets the value of the anyDetections property.
     * 
     */
    public void setAnyDetections(boolean value) {
        this.anyDetections = value;
    }

    /**
     * Gets the value of the sumoRunid property.
     * 
     */
    public int getSumoRunid() {
        return sumoRunid;
    }

    /**
     * Sets the value of the sumoRunid property.
     * 
     */
    public void setSumoRunid(int value) {
        this.sumoRunid = value;
    }

    /**
     * Gets the value of the enl property.
     * 
     */
    public double getEnl() {
        return enl;
    }

    /**
     * Sets the value of the enl property.
     * 
     */
    public void setEnl(double value) {
        this.enl = value;
    }

    /**
     * Gets the value of the threshOrderChans property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreshOrderChans() {
        return threshOrderChans;
    }

    /**
     * Sets the value of the threshOrderChans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreshOrderChans(Double value) {
        this.threshOrderChans = value;
    }

    /**
     * Gets the value of the threshHH property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreshHH() {
        return threshHH;
    }

    /**
     * Sets the value of the threshHH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreshHH(Double value) {
        this.threshHH = value;
    }

    /**
     * Gets the value of the threshHV property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreshHV() {
        return threshHV;
    }

    /**
     * Sets the value of the threshHV property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreshHV(Double value) {
        this.threshHV = value;
    }

    /**
     * Gets the value of the threshVH property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreshVH() {
        return threshVH;
    }

    /**
     * Sets the value of the threshVH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreshVH(Double value) {
        this.threshVH = value;
    }

    /**
     * Gets the value of the threshVV property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getThreshVV() {
        return threshVV;
    }

    /**
     * Sets the value of the threshVV property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setThreshVV(Double value) {
        this.threshVV = value;
    }

    /**
     * Gets the value of the buffer property.
     * 
     */
    public int getBuffer() {
        return buffer;
    }

    /**
     * Sets the value of the buffer property.
     * 
     */
    public void setBuffer(int value) {
        this.buffer = value;
    }

    /**
     * Gets the value of the matrixratio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMatrixratio() {
        return matrixratio;
    }

    /**
     * Sets the value of the matrixratio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMatrixratio(Double value) {
        this.matrixratio = value;
    }

    /**
     * Gets the value of the nboat property.
     * 
     */
    public int getNboat() {
        return nboat;
    }

    /**
     * Sets the value of the nboat property.
     * 
     */
    public void setNboat(int value) {
        this.nboat = value;
    }

}
