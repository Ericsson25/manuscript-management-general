//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.23 at 08:28:19 AM CEST 
//


package manuscript.module.manuscript.management.response;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import manuscript.module.manuscript.management.bean.BasicResponse;
import manuscript.module.manuscript.management.bean.Submission;


/**
 * <p>Java class for reviewerPreloadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reviewerPreloadResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://manuscript/module/manuscript/management/bean}basicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Submissions" type="{http://manuscript/module/manuscript/management/bean}submission" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reviewerPreloadResponse", propOrder = {
    "submissions"
})
public class ReviewerPreloadResponse
    extends BasicResponse
{

    @XmlElement(name = "Submissions")
    @Valid
    protected List<Submission> submissions;

    /**
     * Gets the value of the submissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Submission }
     * 
     * 
     */
    public List<Submission> getSubmissions() {
        if (submissions == null) {
            submissions = new ArrayList<Submission>();
        }
        return this.submissions;
    }

    public void setSubmissions(List<Submission> value) {
        this.submissions = null;
        if (value!= null) {
            List<Submission> draftl = this.getSubmissions();
            draftl.addAll(value);
        }
    }

}
