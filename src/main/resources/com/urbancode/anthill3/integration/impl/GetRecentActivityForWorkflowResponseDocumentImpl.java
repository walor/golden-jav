/*
 * An XML document type.
 * Localname: getRecentActivityForWorkflowResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getRecentActivityForWorkflowResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetRecentActivityForWorkflowResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument
{
    
    public GetRecentActivityForWorkflowResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRECENTACTIVITYFORWORKFLOWRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getRecentActivityForWorkflowResponse");
    
    
    /**
     * Gets the "getRecentActivityForWorkflowResponse" element
     */
    public com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.GetRecentActivityForWorkflowResponse getGetRecentActivityForWorkflowResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.GetRecentActivityForWorkflowResponse target = null;
            target = (com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.GetRecentActivityForWorkflowResponse)get_store().find_element_user(GETRECENTACTIVITYFORWORKFLOWRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getRecentActivityForWorkflowResponse" element
     */
    public void setGetRecentActivityForWorkflowResponse(com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.GetRecentActivityForWorkflowResponse getRecentActivityForWorkflowResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.GetRecentActivityForWorkflowResponse target = null;
            target = (com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.GetRecentActivityForWorkflowResponse)get_store().find_element_user(GETRECENTACTIVITYFORWORKFLOWRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.GetRecentActivityForWorkflowResponse)get_store().add_element_user(GETRECENTACTIVITYFORWORKFLOWRESPONSE$0);
            }
            target.set(getRecentActivityForWorkflowResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getRecentActivityForWorkflowResponse" element
     */
    public com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.GetRecentActivityForWorkflowResponse addNewGetRecentActivityForWorkflowResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.GetRecentActivityForWorkflowResponse target = null;
            target = (com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.GetRecentActivityForWorkflowResponse)get_store().add_element_user(GETRECENTACTIVITYFORWORKFLOWRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getRecentActivityForWorkflowResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetRecentActivityForWorkflowResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.GetRecentActivityForWorkflowResponse
    {
        
        public GetRecentActivityForWorkflowResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETRECENTACTIVITYFORWORKFLOWRETURN$0 = 
            new javax.xml.namespace.QName("", "getRecentActivityForWorkflowReturn");
        
        
        /**
         * Gets the "getRecentActivityForWorkflowReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade getGetRecentActivityForWorkflowReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().find_element_user(GETRECENTACTIVITYFORWORKFLOWRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getRecentActivityForWorkflowReturn" element
         */
        public void setGetRecentActivityForWorkflowReturn(com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade getRecentActivityForWorkflowReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().find_element_user(GETRECENTACTIVITYFORWORKFLOWRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().add_element_user(GETRECENTACTIVITYFORWORKFLOWRETURN$0);
                }
                target.set(getRecentActivityForWorkflowReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getRecentActivityForWorkflowReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade addNewGetRecentActivityForWorkflowReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().add_element_user(GETRECENTACTIVITYFORWORKFLOWRETURN$0);
                return target;
            }
        }
    }
}
