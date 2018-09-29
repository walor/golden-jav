/*
 * An XML document type.
 * Localname: getWorkflowPropertiesResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getWorkflowPropertiesResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetWorkflowPropertiesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument
{
    
    public GetWorkflowPropertiesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWORKFLOWPROPERTIESRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getWorkflowPropertiesResponse");
    
    
    /**
     * Gets the "getWorkflowPropertiesResponse" element
     */
    public com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.GetWorkflowPropertiesResponse getGetWorkflowPropertiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.GetWorkflowPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.GetWorkflowPropertiesResponse)get_store().find_element_user(GETWORKFLOWPROPERTIESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getWorkflowPropertiesResponse" element
     */
    public void setGetWorkflowPropertiesResponse(com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.GetWorkflowPropertiesResponse getWorkflowPropertiesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.GetWorkflowPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.GetWorkflowPropertiesResponse)get_store().find_element_user(GETWORKFLOWPROPERTIESRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.GetWorkflowPropertiesResponse)get_store().add_element_user(GETWORKFLOWPROPERTIESRESPONSE$0);
            }
            target.set(getWorkflowPropertiesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getWorkflowPropertiesResponse" element
     */
    public com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.GetWorkflowPropertiesResponse addNewGetWorkflowPropertiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.GetWorkflowPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.GetWorkflowPropertiesResponse)get_store().add_element_user(GETWORKFLOWPROPERTIESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getWorkflowPropertiesResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetWorkflowPropertiesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.GetWorkflowPropertiesResponse
    {
        
        public GetWorkflowPropertiesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETWORKFLOWPROPERTIESRETURN$0 = 
            new javax.xml.namespace.QName("", "getWorkflowPropertiesReturn");
        
        
        /**
         * Gets the "getWorkflowPropertiesReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowPropertyFacade getGetWorkflowPropertiesReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowPropertyFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowPropertyFacade)get_store().find_element_user(GETWORKFLOWPROPERTIESRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getWorkflowPropertiesReturn" element
         */
        public void setGetWorkflowPropertiesReturn(com.urbancode.anthill3.integration.ArrayOfWorkflowPropertyFacade getWorkflowPropertiesReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowPropertyFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowPropertyFacade)get_store().find_element_user(GETWORKFLOWPROPERTIESRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfWorkflowPropertyFacade)get_store().add_element_user(GETWORKFLOWPROPERTIESRETURN$0);
                }
                target.set(getWorkflowPropertiesReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getWorkflowPropertiesReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowPropertyFacade addNewGetWorkflowPropertiesReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowPropertyFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowPropertyFacade)get_store().add_element_user(GETWORKFLOWPROPERTIESRETURN$0);
                return target;
            }
        }
    }
}
