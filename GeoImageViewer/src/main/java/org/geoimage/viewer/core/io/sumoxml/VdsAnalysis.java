//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.28 at 09:48:18 AM CEST 
//


package org.geoimage.viewer.core.io.sumoxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="run_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="run_version_num" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="detector_version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}algorithm"/>
 *         &lt;element name="parameters" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nr_detections" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="buffer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="land_mask_read" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "runVersionNum",
    "detectorVersion",
    "algorithm",
    "parameters",
    "nrDetections",
    "buffer",
    "landMaskRead"
})
@XmlRootElement(name = "vds_analysis")
public class VdsAnalysis {

    @XmlElement(name = "run_time", required = true)
    protected String runTime;
    @XmlElement(name = "run_version", required = true)
    protected String runVersion;
    @XmlElement(name = "run_version_num")
    protected Integer runVersionNum;
    @XmlElement(name = "detector_version", required = true)
    protected String detectorVersion;
    @XmlElement(required = true)
    protected String algorithm;
    @XmlElement(required = true)
    protected String parameters;
    @XmlElement(name = "nr_detections")
    protected int nrDetections;
    protected int buffer;
    @XmlElement(name = "land_mask_read", required = true)
    protected String landMaskRead;

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
     * Gets the value of the runVersionNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRunVersionNum() {
        return runVersionNum;
    }

    /**
     * Sets the value of the runVersionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRunVersionNum(Integer value) {
        this.runVersionNum = value;
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
     * Gets the value of the nrDetections property.
     * 
     */
    public int getNrDetections() {
        return nrDetections;
    }

    /**
     * Sets the value of the nrDetections property.
     * 
     */
    public void setNrDetections(int value) {
        this.nrDetections = value;
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
     * Gets the value of the landMaskRead property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandMaskRead() {
        return landMaskRead;
    }

    /**
     * Sets the value of the landMaskRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandMaskRead(String value) {
        this.landMaskRead = value;
    }

}
