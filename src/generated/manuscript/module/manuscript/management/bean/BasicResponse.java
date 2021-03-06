//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.14 at 10:56:21 PM CEST 
//


package manuscript.module.manuscript.management.bean;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import manuscript.module.manuscript.management.response.AuthorPreloadResponse;
import manuscript.module.manuscript.management.response.EditorPreloadResponse;
import manuscript.module.manuscript.management.response.FileUploadResponse;
import manuscript.module.manuscript.management.response.GetSubmissionDataResponse;
import manuscript.module.manuscript.management.response.RemoveSubmissionResponse;
import manuscript.module.manuscript.management.response.ReviewerPreloadResponse;
import manuscript.module.manuscript.management.response.SaveSubmissionDataResponse;
import manuscript.module.manuscript.management.response.SearchAuthorResponse;
import manuscript.module.manuscript.management.response.SubmitSubmissionResponse;


/**
 * <p>Java class for basicResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basicResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SuccessMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basicResponse", propOrder = {
    "exceptionMessage",
    "successMessage"
})
@XmlSeeAlso({
    AuthorPreloadResponse.class,
    ReviewerPreloadResponse.class,
    EditorPreloadResponse.class,
    FileUploadResponse.class,
    GetSubmissionDataResponse.class,
    SaveSubmissionDataResponse.class,
    SearchAuthorResponse.class,
    RemoveSubmissionResponse.class,
    SubmitSubmissionResponse.class
})
public class BasicResponse {

    @XmlElement(name = "ExceptionMessage", required = true)
    @NotNull
    protected String exceptionMessage;
    @XmlElement(name = "SuccessMessage", required = true)
    @NotNull
    protected String successMessage;

    /**
     * Gets the value of the exceptionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Sets the value of the exceptionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessage(String value) {
        this.exceptionMessage = value;
    }

    /**
     * Gets the value of the successMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessMessage() {
        return successMessage;
    }

    /**
     * Sets the value of the successMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessMessage(String value) {
        this.successMessage = value;
    }

}
