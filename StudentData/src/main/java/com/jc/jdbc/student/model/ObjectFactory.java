//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.20 at 12:12:52 AM IST 
//


package com.jc.jdbc.student.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jc.jdbc.student.model package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jc.jdbc.student.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StudentType }
     * 
     */
    public StudentType createStudentType() {
        return new StudentType();
    }

    /**
     * Create an instance of {@link StudentType.AttributeCollection }
     * 
     */
    public StudentType.AttributeCollection createStudentTypeAttributeCollection() {
        return new StudentType.AttributeCollection();
    }

    /**
     * Create an instance of {@link StudentCollection }
     * 
     */
    public StudentCollection createStudentCollection() {
        return new StudentCollection();
    }

    /**
     * Create an instance of {@link StudentType.AttributeCollection.Attribute }
     * 
     */
    public StudentType.AttributeCollection.Attribute createStudentTypeAttributeCollectionAttribute() {
        return new StudentType.AttributeCollection.Attribute();
    }

}
