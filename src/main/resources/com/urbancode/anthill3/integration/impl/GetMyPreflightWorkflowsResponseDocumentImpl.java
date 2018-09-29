/*
 * An XML document type.
 * Localname: getMyPreflightWorkflowsResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getMyPreflightWorkflowsResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetMyPreflightWorkflowsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument
{
    
    public GetMyPreflightWorkflowsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMYPREFLIGHTWORKFLOWSRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getMyPreflightWorkflowsResponse");
    
    
    /**
     * Gets the "getMyPreflightWorkflowsResponse" element
     */
    public com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.GetMyPreflightWorkflowsResponse getGetMyPreflightWorkflowsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.GetMyPreflightWorkflowsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.GetMyPreflightWorkflowsResponse)get_store().find_element_user(GETMYPREFLIGHTWORKFLOWSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMyPreflightWorkflowsResponse" element
     */
    public void setGetMyPreflightWorkflowsResponse(com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.GetMyPreflightWorkflowsResponse getMyPreflightWorkflowsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.GetMyPreflightWorkflowsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.GetMyPreflightWorkflowsResponse)get_store().find_element_user(GETMYPREFLIGHTWORKFLOWSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.GetMyPreflightWorkflowsResponse)get_store().add_element_user(GETMYPREFLIGHTWORKFLOWSRESPONSE$0);
            }
            target.set(getMyPreflightWorkflowsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getMyPreflightWorkflowsResponse" element
     */
    public com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.GetMyPreflightWorkflowsResponse addNewGetMyPreflightWorkflowsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.GetMyPreflightWorkflowsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.GetMyPreflightWorkflowsResponse)get_store().add_element_user(GETMYPREFLIGHTWORKFLOWSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getMyPreflightWorkflowsResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetMyPreflightWorkflowsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.GetMyPreflightWorkflowsResponse
    {
        
        public GetMyPreflightWorkflowsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETMYPREFLIGHTWORKFLOWSRETURN$0 = 
            new javax.xml.namespace.QName("", "getMyPreflightWorkflowsReturn");
        
        
        /**
         * Gets the "getMyPreflightWorkflowsReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowFacade getGetMyPreflightWorkflowsReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowFacade)get_store().find_element_user(GETMYPREFLIGHTWORKFLOWSRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getMyPreflightWorkflowsReturn" element
         */
        public void setGetMyPreflightWorkflowsReturn(com.urbancode.anthill3.integration.ArrayOfWorkflowFacade getMyPreflightWorkflowsReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowFacade)get_store().find_element_user(GETMYPREFLIGHTWORKFLOWSRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfWorkflowFacade)get_store().add_element_user(GETMYPREFLIGHTWORKFLOWSRETURN$0);
                }
                target.set(getMyPreflightWorkflowsReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getMyPreflightWorkflowsReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowFacade addNewGetMyPreflightWorkflowsReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowFacade)get_store().add_element_user(GETMYPREFLIGHTWORKFLOWSRETURN$0);
                return target;
            }
        }
    }
}
