/*
 * An XML document type.
 * Localname: buildProjectByNameResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one buildProjectByNameResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class BuildProjectByNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument
{
    
    public BuildProjectByNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDPROJECTBYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "buildProjectByNameResponse");
    
    
    /**
     * Gets the "buildProjectByNameResponse" element
     */
    public com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.BuildProjectByNameResponse getBuildProjectByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.BuildProjectByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.BuildProjectByNameResponse)get_store().find_element_user(BUILDPROJECTBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buildProjectByNameResponse" element
     */
    public void setBuildProjectByNameResponse(com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.BuildProjectByNameResponse buildProjectByNameResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.BuildProjectByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.BuildProjectByNameResponse)get_store().find_element_user(BUILDPROJECTBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.BuildProjectByNameResponse)get_store().add_element_user(BUILDPROJECTBYNAMERESPONSE$0);
            }
            target.set(buildProjectByNameResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "buildProjectByNameResponse" element
     */
    public com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.BuildProjectByNameResponse addNewBuildProjectByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.BuildProjectByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.BuildProjectByNameResponse)get_store().add_element_user(BUILDPROJECTBYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML buildProjectByNameResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class BuildProjectByNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.BuildProjectByNameResponse
    {
        
        public BuildProjectByNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BUILDPROJECTBYNAMERETURN$0 = 
            new javax.xml.namespace.QName("", "buildProjectByNameReturn");
        
        
        /**
         * Gets the "buildProjectByNameReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade getBuildProjectByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(BUILDPROJECTBYNAMERETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "buildProjectByNameReturn" element
         */
        public void setBuildProjectByNameReturn(com.urbancode.anthill3.integration.BuildRequestFacade buildProjectByNameReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(BUILDPROJECTBYNAMERETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(BUILDPROJECTBYNAMERETURN$0);
                }
                target.set(buildProjectByNameReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "buildProjectByNameReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade addNewBuildProjectByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(BUILDPROJECTBYNAMERETURN$0);
                return target;
            }
        }
    }
}
