//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.23 at 08:28:19 AM CEST 
//


package manuscript.module.manuscript.management.response;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import manuscript.module.manuscript.management.bean.BasicResponse;
import manuscript.module.manuscript.management.bean.Submission;


/**
 * <p>Java class for saveSubmissionDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveSubmissionDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://manuscript/module/manuscript/management/bean}basicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Submission" type="{http://manuscript/module/manuscript/management/bean}submission"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveSubmissionDataResponse", propOrder = {
    "submission"
})
public class SaveSubmissionDataResponse
    extends BasicResponse
{

    @XmlElement(name = "Submission", required = true)
    @NotNull
    @Valid
    protected Submission submission;

    /**
     * Gets the value of the submission property.
     * 
     * @return
     *     possible object is
     *     {@link Submission }
     *     
     */
    public Submission getSubmission() {
        return submission;
    }

    /**
     * Sets the value of the submission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Submission }
     *     
     */
    public void setSubmission(Submission value) {
        this.submission = value;
    }

}
