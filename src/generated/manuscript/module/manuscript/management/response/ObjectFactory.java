//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.27 at 09:08:26 PM CEST 
//


package manuscript.module.manuscript.management.response;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the manuscript.module.manuscript.management.response package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: manuscript.module.manuscript.management.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthorPreloadResponse }
     * 
     */
    public AuthorPreloadResponse createAuthorPreloadResponse() {
        return new AuthorPreloadResponse();
    }

    /**
     * Create an instance of {@link ReviewerPreloadResponse }
     * 
     */
    public ReviewerPreloadResponse createReviewerPreloadResponse() {
        return new ReviewerPreloadResponse();
    }

    /**
     * Create an instance of {@link EditorPreloadResponse }
     * 
     */
    public EditorPreloadResponse createEditorPreloadResponse() {
        return new EditorPreloadResponse();
    }

    /**
     * Create an instance of {@link FileUploadResponse }
     * 
     */
    public FileUploadResponse createFileUploadResponse() {
        return new FileUploadResponse();
    }

    /**
     * Create an instance of {@link GetSubmissionDataResponse }
     * 
     */
    public GetSubmissionDataResponse createGetSubmissionDataResponse() {
        return new GetSubmissionDataResponse();
    }

}
