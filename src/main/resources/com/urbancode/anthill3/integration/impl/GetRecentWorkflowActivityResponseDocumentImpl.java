/*
 * An XML document type.
 * Localname: getRecentWorkflowActivityResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getRecentWorkflowActivityResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetRecentWorkflowActivityResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument
{
    
    public GetRecentWorkflowActivityResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRECENTWORKFLOWACTIVITYRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getRecentWorkflowActivityResponse");
    
    
    /**
     * Gets the "getRecentWorkflowActivityResponse" element
     */
    public com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse getGetRecentWorkflowActivityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse target = null;
            target = (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse)get_store().find_element_user(GETRECENTWORKFLOWACTIVITYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getRecentWorkflowActivityResponse" element
     */
    public void setGetRecentWorkflowActivityResponse(com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse getRecentWorkflowActivityResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse target = null;
            target = (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse)get_store().find_element_user(GETRECENTWORKFLOWACTIVITYRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse)get_store().add_element_user(GETRECENTWORKFLOWACTIVITYRESPONSE$0);
            }
            target.set(getRecentWorkflowActivityResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getRecentWorkflowActivityResponse" element
     */
    public com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse addNewGetRecentWorkflowActivityResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse target = null;
            target = (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse)get_store().add_element_user(GETRECENTWORKFLOWACTIVITYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getRecentWorkflowActivityResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetRecentWorkflowActivityResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse
    {
        
        public GetRecentWorkflowActivityResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETRECENTWORKFLOWACTIVITYRETURN$0 = 
            new javax.xml.namespace.QName("", "getRecentWorkflowActivityReturn");
        
        
        /**
         * Gets the "getRecentWorkflowActivityReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade getGetRecentWorkflowActivityReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().find_element_user(GETRECENTWORKFLOWACTIVITYRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getRecentWorkflowActivityReturn" element
         */
        public void setGetRecentWorkflowActivityReturn(com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade getRecentWorkflowActivityReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().find_element_user(GETRECENTWORKFLOWACTIVITYRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().add_element_user(GETRECENTWORKFLOWACTIVITYRETURN$0);
                }
                target.set(getRecentWorkflowActivityReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getRecentWorkflowActivityReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade addNewGetRecentWorkflowActivityReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade)get_store().add_element_user(GETRECENTWORKFLOWACTIVITYRETURN$0);
                return target;
            }
        }
    }
}
