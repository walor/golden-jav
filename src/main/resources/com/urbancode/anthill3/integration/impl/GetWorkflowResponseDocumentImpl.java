/*
 * An XML document type.
 * Localname: getWorkflowResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetWorkflowResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getWorkflowResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetWorkflowResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetWorkflowResponseDocument
{
    
    public GetWorkflowResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWORKFLOWRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getWorkflowResponse");
    
    
    /**
     * Gets the "getWorkflowResponse" element
     */
    public com.urbancode.anthill3.integration.GetWorkflowResponseDocument.GetWorkflowResponse getGetWorkflowResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowResponseDocument.GetWorkflowResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowResponseDocument.GetWorkflowResponse)get_store().find_element_user(GETWORKFLOWRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getWorkflowResponse" element
     */
    public void setGetWorkflowResponse(com.urbancode.anthill3.integration.GetWorkflowResponseDocument.GetWorkflowResponse getWorkflowResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowResponseDocument.GetWorkflowResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowResponseDocument.GetWorkflowResponse)get_store().find_element_user(GETWORKFLOWRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetWorkflowResponseDocument.GetWorkflowResponse)get_store().add_element_user(GETWORKFLOWRESPONSE$0);
            }
            target.set(getWorkflowResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getWorkflowResponse" element
     */
    public com.urbancode.anthill3.integration.GetWorkflowResponseDocument.GetWorkflowResponse addNewGetWorkflowResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowResponseDocument.GetWorkflowResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowResponseDocument.GetWorkflowResponse)get_store().add_element_user(GETWORKFLOWRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getWorkflowResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetWorkflowResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetWorkflowResponseDocument.GetWorkflowResponse
    {
        
        public GetWorkflowResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETWORKFLOWRETURN$0 = 
            new javax.xml.namespace.QName("", "getWorkflowReturn");
        
        
        /**
         * Gets the "getWorkflowReturn" element
         */
        public com.urbancode.anthill3.integration.WorkflowFacade getGetWorkflowReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.WorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.WorkflowFacade)get_store().find_element_user(GETWORKFLOWRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getWorkflowReturn" element
         */
        public void setGetWorkflowReturn(com.urbancode.anthill3.integration.WorkflowFacade getWorkflowReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.WorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.WorkflowFacade)get_store().find_element_user(GETWORKFLOWRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.WorkflowFacade)get_store().add_element_user(GETWORKFLOWRETURN$0);
                }
                target.set(getWorkflowReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getWorkflowReturn" element
         */
        public com.urbancode.anthill3.integration.WorkflowFacade addNewGetWorkflowReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.WorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.WorkflowFacade)get_store().add_element_user(GETWORKFLOWRETURN$0);
                return target;
            }
        }
    }
}
