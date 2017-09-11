//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.14 at 10:56:21 PM CEST 
//


package manuscript.module.user.management.bean;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passwordDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passwordDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PasswordId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BCryptedPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passwordDetails", propOrder = {
    "passwordId",
    "userId",
    "bCryptedPassword"
})
public class PasswordDetails {

    @XmlElement(name = "PasswordId", required = true)
    @NotNull
    protected String passwordId;
    @XmlElement(name = "UserId", required = true)
    @NotNull
    protected String userId;
    @XmlElement(name = "BCryptedPassword", required = true)
    @NotNull
    protected String bCryptedPassword;

    /**
     * Gets the value of the passwordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordId() {
        return passwordId;
    }

    /**
     * Sets the value of the passwordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordId(String value) {
        this.passwordId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the bCryptedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBCryptedPassword() {
        return bCryptedPassword;
    }

    /**
     * Sets the value of the bCryptedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBCryptedPassword(String value) {
        this.bCryptedPassword = value;
    }

}
