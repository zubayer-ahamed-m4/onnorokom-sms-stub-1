
package com.onnorokom.sms.v1;

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
 *         &lt;element name="OneToOneBulkResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "oneToOneBulkResult"
})
@XmlRootElement(name = "OneToOneBulkResponse")
public class OneToOneBulkResponse {

    @XmlElement(name = "OneToOneBulkResult")
    protected String oneToOneBulkResult;

    /**
     * Gets the value of the oneToOneBulkResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneToOneBulkResult() {
        return oneToOneBulkResult;
    }

    /**
     * Sets the value of the oneToOneBulkResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneToOneBulkResult(String value) {
        this.oneToOneBulkResult = value;
    }

}
