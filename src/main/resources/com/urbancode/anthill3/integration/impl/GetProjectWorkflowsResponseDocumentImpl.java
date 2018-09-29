/*
 * An XML document type.
 * Localname: getProjectWorkflowsResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getProjectWorkflowsResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetProjectWorkflowsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument
{
    
    public GetProjectWorkflowsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROJECTWORKFLOWSRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getProjectWorkflowsResponse");
    
    
    /**
     * Gets the "getProjectWorkflowsResponse" element
     */
    public com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.GetProjectWorkflowsResponse getGetProjectWorkflowsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.GetProjectWorkflowsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.GetProjectWorkflowsResponse)get_store().find_element_user(GETPROJECTWORKFLOWSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProjectWorkflowsResponse" element
     */
    public void setGetProjectWorkflowsResponse(com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.GetProjectWorkflowsResponse getProjectWorkflowsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.GetProjectWorkflowsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.GetProjectWorkflowsResponse)get_store().find_element_user(GETPROJECTWORKFLOWSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.GetProjectWorkflowsResponse)get_store().add_element_user(GETPROJECTWORKFLOWSRESPONSE$0);
            }
            target.set(getProjectWorkflowsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getProjectWorkflowsResponse" element
     */
    public com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.GetProjectWorkflowsResponse addNewGetProjectWorkflowsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.GetProjectWorkflowsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.GetProjectWorkflowsResponse)get_store().add_element_user(GETPROJECTWORKFLOWSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getProjectWorkflowsResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetProjectWorkflowsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.GetProjectWorkflowsResponse
    {
        
        public GetProjectWorkflowsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPROJECTWORKFLOWSRETURN$0 = 
            new javax.xml.namespace.QName("", "getProjectWorkflowsReturn");
        
        
        /**
         * Gets the "getProjectWorkflowsReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowFacade getGetProjectWorkflowsReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowFacade)get_store().find_element_user(GETPROJECTWORKFLOWSRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getProjectWorkflowsReturn" element
         */
        public void setGetProjectWorkflowsReturn(com.urbancode.anthill3.integration.ArrayOfWorkflowFacade getProjectWorkflowsReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowFacade)get_store().find_element_user(GETPROJECTWORKFLOWSRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfWorkflowFacade)get_store().add_element_user(GETPROJECTWORKFLOWSRETURN$0);
                }
                target.set(getProjectWorkflowsReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getProjectWorkflowsReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfWorkflowFacade addNewGetProjectWorkflowsReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfWorkflowFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfWorkflowFacade)get_store().add_element_user(GETPROJECTWORKFLOWSRETURN$0);
                return target;
            }
        }
    }
}
