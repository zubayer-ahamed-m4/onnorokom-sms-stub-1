
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
 *         &lt;element name="OneToManyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "oneToManyResult"
})
@XmlRootElement(name = "OneToManyResponse")
public class OneToManyResponse {

    @XmlElement(name = "OneToManyResult")
    protected String oneToManyResult;

    /**
     * Gets the value of the oneToManyResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneToManyResult() {
        return oneToManyResult;
    }

    /**
     * Sets the value of the oneToManyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneToManyResult(String value) {
        this.oneToManyResult = value;
    }

}
