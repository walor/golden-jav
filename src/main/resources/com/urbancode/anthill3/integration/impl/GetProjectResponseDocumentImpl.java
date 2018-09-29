/*
 * An XML document type.
 * Localname: getProjectResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetProjectResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getProjectResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetProjectResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectResponseDocument
{
    
    public GetProjectResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROJECTRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getProjectResponse");
    
    
    /**
     * Gets the "getProjectResponse" element
     */
    public com.urbancode.anthill3.integration.GetProjectResponseDocument.GetProjectResponse getGetProjectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectResponseDocument.GetProjectResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectResponseDocument.GetProjectResponse)get_store().find_element_user(GETPROJECTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProjectResponse" element
     */
    public void setGetProjectResponse(com.urbancode.anthill3.integration.GetProjectResponseDocument.GetProjectResponse getProjectResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectResponseDocument.GetProjectResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectResponseDocument.GetProjectResponse)get_store().find_element_user(GETPROJECTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetProjectResponseDocument.GetProjectResponse)get_store().add_element_user(GETPROJECTRESPONSE$0);
            }
            target.set(getProjectResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getProjectResponse" element
     */
    public com.urbancode.anthill3.integration.GetProjectResponseDocument.GetProjectResponse addNewGetProjectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectResponseDocument.GetProjectResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectResponseDocument.GetProjectResponse)get_store().add_element_user(GETPROJECTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getProjectResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetProjectResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectResponseDocument.GetProjectResponse
    {
        
        public GetProjectResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPROJECTRETURN$0 = 
            new javax.xml.namespace.QName("", "getProjectReturn");
        
        
        /**
         * Gets the "getProjectReturn" element
         */
        public com.urbancode.anthill3.integration.ProjectFacade getGetProjectReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ProjectFacade target = null;
                target = (com.urbancode.anthill3.integration.ProjectFacade)get_store().find_element_user(GETPROJECTRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getProjectReturn" element
         */
        public void setGetProjectReturn(com.urbancode.anthill3.integration.ProjectFacade getProjectReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ProjectFacade target = null;
                target = (com.urbancode.anthill3.integration.ProjectFacade)get_store().find_element_user(GETPROJECTRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ProjectFacade)get_store().add_element_user(GETPROJECTRETURN$0);
                }
                target.set(getProjectReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getProjectReturn" element
         */
        public com.urbancode.anthill3.integration.ProjectFacade addNewGetProjectReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ProjectFacade target = null;
                target = (com.urbancode.anthill3.integration.ProjectFacade)get_store().add_element_user(GETPROJECTRETURN$0);
                return target;
            }
        }
    }
}
