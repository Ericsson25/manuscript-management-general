//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.14 at 10:56:21 PM CEST 
//


package manuscript.module.manuscript.management.request;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the manuscript.module.manuscript.management.request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: manuscript.module.manuscript.management.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveSubmissionRequest }
     * 
     */
    public SaveSubmissionRequest createSaveSubmissionRequest() {
        return new SaveSubmissionRequest();
    }

    /**
     * Create an instance of {@link SaveSubmissionDataRequest }
     * 
     */
    public SaveSubmissionDataRequest createSaveSubmissionDataRequest() {
        return new SaveSubmissionDataRequest();
    }

    /**
     * Create an instance of {@link SearchAuthorRequest }
     * 
     */
    public SearchAuthorRequest createSearchAuthorRequest() {
        return new SearchAuthorRequest();
    }

    /**
     * Create an instance of {@link RemoveSubmissionRequest }
     * 
     */
    public RemoveSubmissionRequest createRemoveSubmissionRequest() {
        return new RemoveSubmissionRequest();
    }

    /**
     * Create an instance of {@link SubmitSubmissionRequest }
     * 
     */
    public SubmitSubmissionRequest createSubmitSubmissionRequest() {
        return new SubmitSubmissionRequest();
    }

}
