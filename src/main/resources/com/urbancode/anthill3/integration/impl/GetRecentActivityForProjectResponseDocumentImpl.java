/*
 * An XML document type.
 * Localname: getRecentActivityForProjectResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getRecentActivityForProjectResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetRecentActivityForProjectResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument
{
    
    public GetRecentActivityForProjectResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRECENTACTIVITYFORPROJECTRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getRecentActivityForProjectResponse");
    
    
    /**
     * Gets the "getRecentActivityForProjectResponse" element
     */
    public com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.GetRecentActivityForProjectResponse getGetRecentActivityForProjectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.GetRecentActivityForProjectResponse target = null;
            target = (com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.GetRecentActivityForProjectResponse)get_store().find_element_user(GETRECENTACTIVITYFORPROJECTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getRecentActivityForProjectResponse" element
     */
    public void setGetRecentActivityForProjectResponse(com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.GetRecentActivityForProjectResponse getRecentActivityForProjectResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.GetRecentActivityForProjectResponse target = null;
            target = (com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.GetRecentActivityForProjectResponse)get_store().find_element_user(GETRECENTACTIVITYFORPROJECTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.GetRecentActivityForProjectResponse)get_store().add_element_user(GETRECENTACTIVITYFORPROJECTRESPONSE$0);
            }
            target.set(getRecentActivityForProjectResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getRecentActivityForProjectResponse" element
     */
    public com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.GetRecentActivityForProjectResponse addNewGetRecentActivityForProjectResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.GetRecentActivityForProjectResponse target = null;
            target = (com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.GetRecentActivityForProjectResponse)get_store().add_element_user(GETRECENTACTIVITYFORPROJECTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getRecentActivityForProjectResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetRecentActivityForProjectResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.GetRecentActivityForProjectResponse
    {
        
        public GetRecentActivityForProjectResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETRECENTACTIVITYFORPROJECTRETURN$0 = 
            new javax.xml.namespace.QName("", "getRecentActivityForProjectReturn");
        
        
        /**
         * Gets the "getRecentActivityForProjectReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade getGetRecentActivityForProjectReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().find_element_user(GETRECENTACTIVITYFORPROJECTRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getRecentActivityForProjectReturn" element
         */
        public void setGetRecentActivityForProjectReturn(com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade getRecentActivityForProjectReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().find_element_user(GETRECENTACTIVITYFORPROJECTRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().add_element_user(GETRECENTACTIVITYFORPROJECTRETURN$0);
                }
                target.set(getRecentActivityForProjectReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getRecentActivityForProjectReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade addNewGetRecentActivityForProjectReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().add_element_user(GETRECENTACTIVITYFORPROJECTRETURN$0);
                return target;
            }
        }
    }
}
