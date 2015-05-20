//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.24 at 04:43:09 PM CEST 
//


package safe.annotation;

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
 *         &lt;element ref="{}imageInformation"/>
 *         &lt;element ref="{}processingInformation"/>
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
    "imageInformation",
    "processingInformation"
})
@XmlRootElement(name = "imageAnnotation")
public class ImageAnnotation {

    @XmlElement(required = true)
    protected ImageInformation imageInformation;
    @XmlElement(required = true)
    protected ProcessingInformation processingInformation;

    /**
     * Gets the value of the imageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ImageInformation }
     *     
     */
    public ImageInformation getImageInformation() {
        return imageInformation;
    }

    /**
     * Sets the value of the imageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageInformation }
     *     
     */
    public void setImageInformation(ImageInformation value) {
        this.imageInformation = value;
    }

    /**
     * Gets the value of the processingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingInformation }
     *     
     */
    public ProcessingInformation getProcessingInformation() {
        return processingInformation;
    }

    /**
     * Sets the value of the processingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingInformation }
     *     
     */
    public void setProcessingInformation(ProcessingInformation value) {
        this.processingInformation = value;
    }

}