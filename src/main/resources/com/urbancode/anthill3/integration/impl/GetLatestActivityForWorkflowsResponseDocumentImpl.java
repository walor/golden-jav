/*
 * An XML document type.
 * Localname: getLatestActivityForWorkflowsResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getLatestActivityForWorkflowsResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetLatestActivityForWorkflowsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument
{
    
    public GetLatestActivityForWorkflowsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLATESTACTIVITYFORWORKFLOWSRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getLatestActivityForWorkflowsResponse");
    
    
    /**
     * Gets the "getLatestActivityForWorkflowsResponse" element
     */
    public com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.GetLatestActivityForWorkflowsResponse getGetLatestActivityForWorkflowsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.GetLatestActivityForWorkflowsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.GetLatestActivityForWorkflowsResponse)get_store().find_element_user(GETLATESTACTIVITYFORWORKFLOWSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getLatestActivityForWorkflowsResponse" element
     */
    public void setGetLatestActivityForWorkflowsResponse(com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.GetLatestActivityForWorkflowsResponse getLatestActivityForWorkflowsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.GetLatestActivityForWorkflowsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.GetLatestActivityForWorkflowsResponse)get_store().find_element_user(GETLATESTACTIVITYFORWORKFLOWSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.GetLatestActivityForWorkflowsResponse)get_store().add_element_user(GETLATESTACTIVITYFORWORKFLOWSRESPONSE$0);
            }
            target.set(getLatestActivityForWorkflowsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getLatestActivityForWorkflowsResponse" element
     */
    public com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.GetLatestActivityForWorkflowsResponse addNewGetLatestActivityForWorkflowsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.GetLatestActivityForWorkflowsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.GetLatestActivityForWorkflowsResponse)get_store().add_element_user(GETLATESTACTIVITYFORWORKFLOWSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getLatestActivityForWorkflowsResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetLatestActivityForWorkflowsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.GetLatestActivityForWorkflowsResponse
    {
        
        public GetLatestActivityForWorkflowsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETLATESTACTIVITYFORWORKFLOWSRETURN$0 = 
            new javax.xml.namespace.QName("", "getLatestActivityForWorkflowsReturn");
        
        
        /**
         * Gets the "getLatestActivityForWorkflowsReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade getGetLatestActivityForWorkflowsReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().find_element_user(GETLATESTACTIVITYFORWORKFLOWSRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getLatestActivityForWorkflowsReturn" element
         */
        public void setGetLatestActivityForWorkflowsReturn(com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade getLatestActivityForWorkflowsReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().find_element_user(GETLATESTACTIVITYFORWORKFLOWSRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().add_element_user(GETLATESTACTIVITYFORWORKFLOWSRETURN$0);
                }
                target.set(getLatestActivityForWorkflowsReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getLatestActivityForWorkflowsReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade addNewGetLatestActivityForWorkflowsReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().add_element_user(GETLATESTACTIVITYFORWORKFLOWSRETURN$0);
                return target;
            }
        }
    }
}
