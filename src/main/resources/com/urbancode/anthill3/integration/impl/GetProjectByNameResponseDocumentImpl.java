/*
 * An XML document type.
 * Localname: getProjectByNameResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetProjectByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getProjectByNameResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetProjectByNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectByNameResponseDocument
{
    
    public GetProjectByNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROJECTBYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getProjectByNameResponse");
    
    
    /**
     * Gets the "getProjectByNameResponse" element
     */
    public com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.GetProjectByNameResponse getGetProjectByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.GetProjectByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.GetProjectByNameResponse)get_store().find_element_user(GETPROJECTBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProjectByNameResponse" element
     */
    public void setGetProjectByNameResponse(com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.GetProjectByNameResponse getProjectByNameResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.GetProjectByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.GetProjectByNameResponse)get_store().find_element_user(GETPROJECTBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.GetProjectByNameResponse)get_store().add_element_user(GETPROJECTBYNAMERESPONSE$0);
            }
            target.set(getProjectByNameResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getProjectByNameResponse" element
     */
    public com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.GetProjectByNameResponse addNewGetProjectByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.GetProjectByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.GetProjectByNameResponse)get_store().add_element_user(GETPROJECTBYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getProjectByNameResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetProjectByNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.GetProjectByNameResponse
    {
        
        public GetProjectByNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPROJECTBYNAMERETURN$0 = 
            new javax.xml.namespace.QName("", "getProjectByNameReturn");
        
        
        /**
         * Gets the "getProjectByNameReturn" element
         */
        public com.urbancode.anthill3.integration.ProjectFacade getGetProjectByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ProjectFacade target = null;
                target = (com.urbancode.anthill3.integration.ProjectFacade)get_store().find_element_user(GETPROJECTBYNAMERETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getProjectByNameReturn" element
         */
        public void setGetProjectByNameReturn(com.urbancode.anthill3.integration.ProjectFacade getProjectByNameReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ProjectFacade target = null;
                target = (com.urbancode.anthill3.integration.ProjectFacade)get_store().find_element_user(GETPROJECTBYNAMERETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ProjectFacade)get_store().add_element_user(GETPROJECTBYNAMERETURN$0);
                }
                target.set(getProjectByNameReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getProjectByNameReturn" element
         */
        public com.urbancode.anthill3.integration.ProjectFacade addNewGetProjectByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ProjectFacade target = null;
                target = (com.urbancode.anthill3.integration.ProjectFacade)get_store().add_element_user(GETPROJECTBYNAMERETURN$0);
                return target;
            }
        }
    }
}
