/*
 * An XML document type.
 * Localname: getWorkflowServerGroupByNameResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getWorkflowServerGroupByNameResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetWorkflowServerGroupByNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument
{
    
    public GetWorkflowServerGroupByNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETWORKFLOWSERVERGROUPBYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getWorkflowServerGroupByNameResponse");
    
    
    /**
     * Gets the "getWorkflowServerGroupByNameResponse" element
     */
    public com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.GetWorkflowServerGroupByNameResponse getGetWorkflowServerGroupByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.GetWorkflowServerGroupByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.GetWorkflowServerGroupByNameResponse)get_store().find_element_user(GETWORKFLOWSERVERGROUPBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getWorkflowServerGroupByNameResponse" element
     */
    public void setGetWorkflowServerGroupByNameResponse(com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.GetWorkflowServerGroupByNameResponse getWorkflowServerGroupByNameResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.GetWorkflowServerGroupByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.GetWorkflowServerGroupByNameResponse)get_store().find_element_user(GETWORKFLOWSERVERGROUPBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.GetWorkflowServerGroupByNameResponse)get_store().add_element_user(GETWORKFLOWSERVERGROUPBYNAMERESPONSE$0);
            }
            target.set(getWorkflowServerGroupByNameResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getWorkflowServerGroupByNameResponse" element
     */
    public com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.GetWorkflowServerGroupByNameResponse addNewGetWorkflowServerGroupByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.GetWorkflowServerGroupByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.GetWorkflowServerGroupByNameResponse)get_store().add_element_user(GETWORKFLOWSERVERGROUPBYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getWorkflowServerGroupByNameResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetWorkflowServerGroupByNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.GetWorkflowServerGroupByNameResponse
    {
        
        public GetWorkflowServerGroupByNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETWORKFLOWSERVERGROUPBYNAMERETURN$0 = 
            new javax.xml.namespace.QName("", "getWorkflowServerGroupByNameReturn");
        
        
        /**
         * Gets the "getWorkflowServerGroupByNameReturn" element
         */
        public com.urbancode.anthill3.integration.ServerGroupFacade getGetWorkflowServerGroupByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ServerGroupFacade target = null;
                target = (com.urbancode.anthill3.integration.ServerGroupFacade)get_store().find_element_user(GETWORKFLOWSERVERGROUPBYNAMERETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getWorkflowServerGroupByNameReturn" element
         */
        public void setGetWorkflowServerGroupByNameReturn(com.urbancode.anthill3.integration.ServerGroupFacade getWorkflowServerGroupByNameReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ServerGroupFacade target = null;
                target = (com.urbancode.anthill3.integration.ServerGroupFacade)get_store().find_element_user(GETWORKFLOWSERVERGROUPBYNAMERETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ServerGroupFacade)get_store().add_element_user(GETWORKFLOWSERVERGROUPBYNAMERETURN$0);
                }
                target.set(getWorkflowServerGroupByNameReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getWorkflowServerGroupByNameReturn" element
         */
        public com.urbancode.anthill3.integration.ServerGroupFacade addNewGetWorkflowServerGroupByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ServerGroupFacade target = null;
                target = (com.urbancode.anthill3.integration.ServerGroupFacade)get_store().add_element_user(GETWORKFLOWSERVERGROUPBYNAMERETURN$0);
                return target;
            }
        }
    }
}
