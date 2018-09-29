/*
 * An XML document type.
 * Localname: getWorkflowServerGroupsResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getWorkflowServerGroupsResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetWorkflowServerGroupsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument
{
    
    public GetWorkflowServerGroupsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWORKFLOWSERVERGROUPSRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getWorkflowServerGroupsResponse");
    
    
    /**
     * Gets the "getWorkflowServerGroupsResponse" element
     */
    public com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse getGetWorkflowServerGroupsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse)get_store().find_element_user(GETWORKFLOWSERVERGROUPSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getWorkflowServerGroupsResponse" element
     */
    public void setGetWorkflowServerGroupsResponse(com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse getWorkflowServerGroupsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse)get_store().find_element_user(GETWORKFLOWSERVERGROUPSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse)get_store().add_element_user(GETWORKFLOWSERVERGROUPSRESPONSE$0);
            }
            target.set(getWorkflowServerGroupsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getWorkflowServerGroupsResponse" element
     */
    public com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse addNewGetWorkflowServerGroupsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse)get_store().add_element_user(GETWORKFLOWSERVERGROUPSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getWorkflowServerGroupsResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetWorkflowServerGroupsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse
    {
        
        public GetWorkflowServerGroupsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETWORKFLOWSERVERGROUPSRETURN$0 = 
            new javax.xml.namespace.QName("", "getWorkflowServerGroupsReturn");
        
        
        /**
         * Gets the "getWorkflowServerGroupsReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfServerGroupFacade getGetWorkflowServerGroupsReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfServerGroupFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfServerGroupFacade)get_store().find_element_user(GETWORKFLOWSERVERGROUPSRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getWorkflowServerGroupsReturn" element
         */
        public void setGetWorkflowServerGroupsReturn(com.urbancode.anthill3.integration.ArrayOfServerGroupFacade getWorkflowServerGroupsReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfServerGroupFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfServerGroupFacade)get_store().find_element_user(GETWORKFLOWSERVERGROUPSRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfServerGroupFacade)get_store().add_element_user(GETWORKFLOWSERVERGROUPSRETURN$0);
                }
                target.set(getWorkflowServerGroupsReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getWorkflowServerGroupsReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfServerGroupFacade addNewGetWorkflowServerGroupsReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfServerGroupFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfServerGroupFacade)get_store().add_element_user(GETWORKFLOWSERVERGROUPSRETURN$0);
                return target;
            }
        }
    }
}
