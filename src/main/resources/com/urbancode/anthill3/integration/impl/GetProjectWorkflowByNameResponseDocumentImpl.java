/*
 * An XML document type.
 * Localname: getProjectWorkflowByNameResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getProjectWorkflowByNameResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetProjectWorkflowByNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument
{
    
    public GetProjectWorkflowByNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROJECTWORKFLOWBYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getProjectWorkflowByNameResponse");
    
    
    /**
     * Gets the "getProjectWorkflowByNameResponse" element
     */
    public com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.GetProjectWorkflowByNameResponse getGetProjectWorkflowByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.GetProjectWorkflowByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.GetProjectWorkflowByNameResponse)get_store().find_element_user(GETPROJECTWORKFLOWBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProjectWorkflowByNameResponse" element
     */
    public void setGetProjectWorkflowByNameResponse(com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.GetProjectWorkflowByNameResponse getProjectWorkflowByNameResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.GetProjectWorkflowByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.GetProjectWorkflowByNameResponse)get_store().find_element_user(GETPROJECTWORKFLOWBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.GetProjectWorkflowByNameResponse)get_store().add_element_user(GETPROJECTWORKFLOWBYNAMERESPONSE$0);
            }
            target.set(getProjectWorkflowByNameResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getProjectWorkflowByNameResponse" element
     */
    public com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.GetProjectWorkflowByNameResponse addNewGetProjectWorkflowByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.GetProjectWorkflowByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.GetProjectWorkflowByNameResponse)get_store().add_element_user(GETPROJECTWORKFLOWBYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getProjectWorkflowByNameResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetProjectWorkflowByNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.GetProjectWorkflowByNameResponse
    {
        
        public GetProjectWorkflowByNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPROJECTWORKFLOWBYNAMERETURN$0 = 
            new javax.xml.namespace.QName("", "getProjectWorkflowByNameReturn");
        
        
        /**
         * Gets the "getProjectWorkflowByNameReturn" element
         */
        public com.urbancode.anthill3.integration.WorkflowFacade getGetProjectWorkflowByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.WorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.WorkflowFacade)get_store().find_element_user(GETPROJECTWORKFLOWBYNAMERETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getProjectWorkflowByNameReturn" element
         */
        public void setGetProjectWorkflowByNameReturn(com.urbancode.anthill3.integration.WorkflowFacade getProjectWorkflowByNameReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.WorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.WorkflowFacade)get_store().find_element_user(GETPROJECTWORKFLOWBYNAMERETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.WorkflowFacade)get_store().add_element_user(GETPROJECTWORKFLOWBYNAMERETURN$0);
                }
                target.set(getProjectWorkflowByNameReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getProjectWorkflowByNameReturn" element
         */
        public com.urbancode.anthill3.integration.WorkflowFacade addNewGetProjectWorkflowByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.WorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.WorkflowFacade)get_store().add_element_user(GETPROJECTWORKFLOWBYNAMERETURN$0);
                return target;
            }
        }
    }
}
