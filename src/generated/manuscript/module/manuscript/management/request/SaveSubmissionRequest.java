//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.27 at 09:08:26 PM CEST 
//


package manuscript.module.manuscript.management.request;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import manuscript.module.manuscript.management.bean.SubmissionStatus;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for saveSubmissionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveSubmissionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="submissionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="submissionStatus" type="{http://manuscript/module/manuscript/management/bean}SubmissionStatus"/&gt;
 *         &lt;element name="authorId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveSubmissionRequest", propOrder = {
    "submissionId",
    "submissionStatus",
    "authorId",
    "filePath",
    "version"
})
public class SaveSubmissionRequest implements HashCode2, ToString2
{

    @XmlElement(required = true)
    @NotNull
    protected String submissionId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @NotNull
    protected SubmissionStatus submissionStatus;
    @XmlElement(required = true)
    @NotNull
    protected String authorId;
    @XmlElement(required = true)
    @NotNull
    protected String filePath;
    @NotNull
    protected int version;

    /**
     * Gets the value of the submissionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionId() {
        return submissionId;
    }

    /**
     * Sets the value of the submissionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionId(String value) {
        this.submissionId = value;
    }

    /**
     * Gets the value of the submissionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionStatus }
     *     
     */
    public SubmissionStatus getSubmissionStatus() {
        return submissionStatus;
    }

    /**
     * Sets the value of the submissionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionStatus }
     *     
     */
    public void setSubmissionStatus(SubmissionStatus value) {
        this.submissionStatus = value;
    }

    /**
     * Gets the value of the authorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorId() {
        return authorId;
    }

    /**
     * Sets the value of the authorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorId(String value) {
        this.authorId = value;
    }

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
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
        {
            String theSubmissionId;
            theSubmissionId = this.getSubmissionId();
            strategy.appendField(locator, this, "submissionId", buffer, theSubmissionId, (this.submissionId!= null));
        }
        {
            SubmissionStatus theSubmissionStatus;
            theSubmissionStatus = this.getSubmissionStatus();
            strategy.appendField(locator, this, "submissionStatus", buffer, theSubmissionStatus, (this.submissionStatus!= null));
        }
        {
            String theAuthorId;
            theAuthorId = this.getAuthorId();
            strategy.appendField(locator, this, "authorId", buffer, theAuthorId, (this.authorId!= null));
        }
        {
            String theFilePath;
            theFilePath = this.getFilePath();
            strategy.appendField(locator, this, "filePath", buffer, theFilePath, (this.filePath!= null));
        }
        {
            int theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion, true);
        }
        return buffer;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theSubmissionId;
            theSubmissionId = this.getSubmissionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "submissionId", theSubmissionId), currentHashCode, theSubmissionId, (this.submissionId!= null));
        }
        {
            SubmissionStatus theSubmissionStatus;
            theSubmissionStatus = this.getSubmissionStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "submissionStatus", theSubmissionStatus), currentHashCode, theSubmissionStatus, (this.submissionStatus!= null));
        }
        {
            String theAuthorId;
            theAuthorId = this.getAuthorId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authorId", theAuthorId), currentHashCode, theAuthorId, (this.authorId!= null));
        }
        {
            String theFilePath;
            theFilePath = this.getFilePath();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filePath", theFilePath), currentHashCode, theFilePath, (this.filePath!= null));
        }
        {
            int theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion, true);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}