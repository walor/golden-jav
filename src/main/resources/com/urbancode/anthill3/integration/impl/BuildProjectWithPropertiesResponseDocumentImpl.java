/*
 * An XML document type.
 * Localname: buildProjectWithPropertiesResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one buildProjectWithPropertiesResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class BuildProjectWithPropertiesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument
{
    
    public BuildProjectWithPropertiesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDPROJECTWITHPROPERTIESRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "buildProjectWithPropertiesResponse");
    
    
    /**
     * Gets the "buildProjectWithPropertiesResponse" element
     */
    public com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.BuildProjectWithPropertiesResponse getBuildProjectWithPropertiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.BuildProjectWithPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.BuildProjectWithPropertiesResponse)get_store().find_element_user(BUILDPROJECTWITHPROPERTIESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buildProjectWithPropertiesResponse" element
     */
    public void setBuildProjectWithPropertiesResponse(com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.BuildProjectWithPropertiesResponse buildProjectWithPropertiesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.BuildProjectWithPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.BuildProjectWithPropertiesResponse)get_store().find_element_user(BUILDPROJECTWITHPROPERTIESRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.BuildProjectWithPropertiesResponse)get_store().add_element_user(BUILDPROJECTWITHPROPERTIESRESPONSE$0);
            }
            target.set(buildProjectWithPropertiesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buildProjectWithPropertiesResponse" element
     */
    public com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.BuildProjectWithPropertiesResponse addNewBuildProjectWithPropertiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.BuildProjectWithPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.BuildProjectWithPropertiesResponse)get_store().add_element_user(BUILDPROJECTWITHPROPERTIESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML buildProjectWithPropertiesResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class BuildProjectWithPropertiesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.BuildProjectWithPropertiesResponse
    {
        
        public BuildProjectWithPropertiesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUILDPROJECTWITHPROPERTIESRETURN$0 = 
            new javax.xml.namespace.QName("", "buildProjectWithPropertiesReturn");
        
        
        /**
         * Gets the "buildProjectWithPropertiesReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade getBuildProjectWithPropertiesReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(BUILDPROJECTWITHPROPERTIESRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "buildProjectWithPropertiesReturn" element
         */
        public void setBuildProjectWithPropertiesReturn(com.urbancode.anthill3.integration.BuildRequestFacade buildProjectWithPropertiesReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(BUILDPROJECTWITHPROPERTIESRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(BUILDPROJECTWITHPROPERTIESRETURN$0);
                }
                target.set(buildProjectWithPropertiesReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "buildProjectWithPropertiesReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade addNewBuildProjectWithPropertiesReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(BUILDPROJECTWITHPROPERTIESRETURN$0);
                return target;
            }
        }
    }
}
