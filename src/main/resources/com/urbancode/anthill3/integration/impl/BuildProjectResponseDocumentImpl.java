/*
 * An XML document type.
 * Localname: buildProjectResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.BuildProjectResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one buildProjectResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class BuildProjectResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.BuildProjectResponseDocument
{
    
    public BuildProjectResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDPROJECTRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "buildProjectResponse");
    
    
    /**
     * Gets the "buildProjectResponse" element
     */
    public com.urbancode.anthill3.integration.BuildProjectResponseDocument.BuildProjectResponse getBuildProjectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectResponseDocument.BuildProjectResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectResponseDocument.BuildProjectResponse)get_store().find_element_user(BUILDPROJECTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buildProjectResponse" element
     */
    public void setBuildProjectResponse(com.urbancode.anthill3.integration.BuildProjectResponseDocument.BuildProjectResponse buildProjectResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectResponseDocument.BuildProjectResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectResponseDocument.BuildProjectResponse)get_store().find_element_user(BUILDPROJECTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.BuildProjectResponseDocument.BuildProjectResponse)get_store().add_element_user(BUILDPROJECTRESPONSE$0);
            }
            target.set(buildProjectResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buildProjectResponse" element
     */
    public com.urbancode.anthill3.integration.BuildProjectResponseDocument.BuildProjectResponse addNewBuildProjectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectResponseDocument.BuildProjectResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectResponseDocument.BuildProjectResponse)get_store().add_element_user(BUILDPROJECTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML buildProjectResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class BuildProjectResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.BuildProjectResponseDocument.BuildProjectResponse
    {
        
        public BuildProjectResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUILDPROJECTRETURN$0 = 
            new javax.xml.namespace.QName("", "buildProjectReturn");
        
        
        /**
         * Gets the "buildProjectReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade getBuildProjectReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(BUILDPROJECTRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "buildProjectReturn" element
         */
        public void setBuildProjectReturn(com.urbancode.anthill3.integration.BuildRequestFacade buildProjectReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(BUILDPROJECTRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(BUILDPROJECTRETURN$0);
                }
                target.set(buildProjectReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "buildProjectReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade addNewBuildProjectReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(BUILDPROJECTRETURN$0);
                return target;
            }
        }
    }
}
