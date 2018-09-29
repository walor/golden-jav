/*
 * An XML document type.
 * Localname: buildProjectWithPropertiesByNameResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one buildProjectWithPropertiesByNameResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class BuildProjectWithPropertiesByNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument
{
    
    public BuildProjectWithPropertiesByNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDPROJECTWITHPROPERTIESBYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "buildProjectWithPropertiesByNameResponse");
    
    
    /**
     * Gets the "buildProjectWithPropertiesByNameResponse" element
     */
    public com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse getBuildProjectWithPropertiesByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse)get_store().find_element_user(BUILDPROJECTWITHPROPERTIESBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buildProjectWithPropertiesByNameResponse" element
     */
    public void setBuildProjectWithPropertiesByNameResponse(com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse buildProjectWithPropertiesByNameResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse)get_store().find_element_user(BUILDPROJECTWITHPROPERTIESBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse)get_store().add_element_user(BUILDPROJECTWITHPROPERTIESBYNAMERESPONSE$0);
            }
            target.set(buildProjectWithPropertiesByNameResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buildProjectWithPropertiesByNameResponse" element
     */
    public com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse addNewBuildProjectWithPropertiesByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse)get_store().add_element_user(BUILDPROJECTWITHPROPERTIESBYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML buildProjectWithPropertiesByNameResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class BuildProjectWithPropertiesByNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse
    {
        
        public BuildProjectWithPropertiesByNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUILDPROJECTWITHPROPERTIESBYNAMERETURN$0 = 
            new javax.xml.namespace.QName("", "buildProjectWithPropertiesByNameReturn");
        
        
        /**
         * Gets the "buildProjectWithPropertiesByNameReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade getBuildProjectWithPropertiesByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(BUILDPROJECTWITHPROPERTIESBYNAMERETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "buildProjectWithPropertiesByNameReturn" element
         */
        public void setBuildProjectWithPropertiesByNameReturn(com.urbancode.anthill3.integration.BuildRequestFacade buildProjectWithPropertiesByNameReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(BUILDPROJECTWITHPROPERTIESBYNAMERETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(BUILDPROJECTWITHPROPERTIESBYNAMERETURN$0);
                }
                target.set(buildProjectWithPropertiesByNameReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "buildProjectWithPropertiesByNameReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade addNewBuildProjectWithPropertiesByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(BUILDPROJECTWITHPROPERTIESBYNAMERETURN$0);
                return target;
            }
        }
    }
}
