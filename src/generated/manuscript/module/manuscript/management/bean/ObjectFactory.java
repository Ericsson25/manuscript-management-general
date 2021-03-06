//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.14 at 10:56:21 PM CEST 
//


package manuscript.module.manuscript.management.bean;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the manuscript.module.manuscript.management.bean package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: manuscript.module.manuscript.management.bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BasicResponse }
     * 
     */
    public BasicResponse createBasicResponse() {
        return new BasicResponse();
    }

    /**
     * Create an instance of {@link Submission }
     * 
     */
    public Submission createSubmission() {
        return new Submission();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Submitter }
     * 
     */
    public Submitter createSubmitter() {
        return new Submitter();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link CheckSubmissionExistence }
     * 
     */
    public CheckSubmissionExistence createCheckSubmissionExistence() {
        return new CheckSubmissionExistence();
    }

    /**
     * Create an instance of {@link FilteredUser }
     * 
     */
    public FilteredUser createFilteredUser() {
        return new FilteredUser();
    }

    /**
     * Create an instance of {@link ManuscriptLifecycleRequest }
     * 
     */
    public ManuscriptLifecycleRequest createManuscriptLifecycleRequest() {
        return new ManuscriptLifecycleRequest();
    }

    /**
     * Create an instance of {@link SubmitLifecycle }
     * 
     */
    public SubmitLifecycle createSubmitLifecycle() {
        return new SubmitLifecycle();
    }

}
