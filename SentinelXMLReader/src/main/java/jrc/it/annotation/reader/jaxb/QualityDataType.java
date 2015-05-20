//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.05 at 04:36:39 PM CET 
//


package jrc.it.annotation.reader.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Annotation record for quality information.
 * 
 * <p>Java class for qualityDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qualityDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="azimuthTime" type="{}timeType"/>
 *         &lt;element name="downlinkQuality" type="{}downlinkQualityType"/>
 *         &lt;element name="rawDataAnalysisQuality" type="{}rawDataAnalysisQualityType"/>
 *         &lt;element name="dopplerCentroidQuality" type="{}dopplerCentroidQualityType"/>
 *         &lt;element name="imageQuality" type="{}imageQualityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qualityDataType", propOrder = {
    "azimuthTime",
    "downlinkQuality",
    "rawDataAnalysisQuality",
    "dopplerCentroidQuality",
    "imageQuality"
})
public class QualityDataType {

    @XmlElement(required = true)
    protected XMLGregorianCalendar azimuthTime;
    @XmlElement(required = true)
    protected DownlinkQualityType downlinkQuality;
    @XmlElement(required = true)
    protected RawDataAnalysisQualityType rawDataAnalysisQuality;
    @XmlElement(required = true)
    protected DopplerCentroidQualityType dopplerCentroidQuality;
    @XmlElement(required = true)
    protected ImageQualityType imageQuality;

    /**
     * Gets the value of the azimuthTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAzimuthTime() {
        return azimuthTime;
    }

    /**
     * Sets the value of the azimuthTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAzimuthTime(XMLGregorianCalendar value) {
        this.azimuthTime = value;
    }

    /**
     * Gets the value of the downlinkQuality property.
     * 
     * @return
     *     possible object is
     *     {@link DownlinkQualityType }
     *     
     */
    public DownlinkQualityType getDownlinkQuality() {
        return downlinkQuality;
    }

    /**
     * Sets the value of the downlinkQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownlinkQualityType }
     *     
     */
    public void setDownlinkQuality(DownlinkQualityType value) {
        this.downlinkQuality = value;
    }

    /**
     * Gets the value of the rawDataAnalysisQuality property.
     * 
     * @return
     *     possible object is
     *     {@link RawDataAnalysisQualityType }
     *     
     */
    public RawDataAnalysisQualityType getRawDataAnalysisQuality() {
        return rawDataAnalysisQuality;
    }

    /**
     * Sets the value of the rawDataAnalysisQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link RawDataAnalysisQualityType }
     *     
     */
    public void setRawDataAnalysisQuality(RawDataAnalysisQualityType value) {
        this.rawDataAnalysisQuality = value;
    }

    /**
     * Gets the value of the dopplerCentroidQuality property.
     * 
     * @return
     *     possible object is
     *     {@link DopplerCentroidQualityType }
     *     
     */
    public DopplerCentroidQualityType getDopplerCentroidQuality() {
        return dopplerCentroidQuality;
    }

    /**
     * Sets the value of the dopplerCentroidQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link DopplerCentroidQualityType }
     *     
     */
    public void setDopplerCentroidQuality(DopplerCentroidQualityType value) {
        this.dopplerCentroidQuality = value;
    }

    /**
     * Gets the value of the imageQuality property.
     * 
     * @return
     *     possible object is
     *     {@link ImageQualityType }
     *     
     */
    public ImageQualityType getImageQuality() {
        return imageQuality;
    }

    /**
     * Sets the value of the imageQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageQualityType }
     *     
     */
    public void setImageQuality(ImageQualityType value) {
        this.imageQuality = value;
    }

}