//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.27 at 09:08:26 PM CEST 
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
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for getSubmissionDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSubmissionDataResponse"&gt;
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
@XmlType(name = "getSubmissionDataResponse", propOrder = {
    "submission"
})
public class GetSubmissionDataResponse
    extends BasicResponse
    implements HashCode2, ToString2
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

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            Submission theSubmission;
            theSubmission = this.getSubmission();
            strategy.appendField(locator, this, "submission", buffer, theSubmission, (this.submission!= null));
        }
        return buffer;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Submission theSubmission;
            theSubmission = this.getSubmission();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "submission", theSubmission), currentHashCode, theSubmission, (this.submission!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
