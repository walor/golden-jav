/*
 * An XML document type.
 * Localname: runWorkflowWithPropertiesResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one runWorkflowWithPropertiesResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class RunWorkflowWithPropertiesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument
{
    
    public RunWorkflowWithPropertiesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNWORKFLOWWITHPROPERTIESRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "runWorkflowWithPropertiesResponse");
    
    
    /**
     * Gets the "runWorkflowWithPropertiesResponse" element
     */
    public com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.RunWorkflowWithPropertiesResponse getRunWorkflowWithPropertiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.RunWorkflowWithPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.RunWorkflowWithPropertiesResponse)get_store().find_element_user(RUNWORKFLOWWITHPROPERTIESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "runWorkflowWithPropertiesResponse" element
     */
    public void setRunWorkflowWithPropertiesResponse(com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.RunWorkflowWithPropertiesResponse runWorkflowWithPropertiesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.RunWorkflowWithPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.RunWorkflowWithPropertiesResponse)get_store().find_element_user(RUNWORKFLOWWITHPROPERTIESRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.RunWorkflowWithPropertiesResponse)get_store().add_element_user(RUNWORKFLOWWITHPROPERTIESRESPONSE$0);
            }
            target.set(runWorkflowWithPropertiesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "runWorkflowWithPropertiesResponse" element
     */
    public com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.RunWorkflowWithPropertiesResponse addNewRunWorkflowWithPropertiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.RunWorkflowWithPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.RunWorkflowWithPropertiesResponse)get_store().add_element_user(RUNWORKFLOWWITHPROPERTIESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML runWorkflowWithPropertiesResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class RunWorkflowWithPropertiesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.RunWorkflowWithPropertiesResponse
    {
        
        public RunWorkflowWithPropertiesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RUNWORKFLOWWITHPROPERTIESRETURN$0 = 
            new javax.xml.namespace.QName("", "runWorkflowWithPropertiesReturn");
        
        
        /**
         * Gets the "runWorkflowWithPropertiesReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade getRunWorkflowWithPropertiesReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(RUNWORKFLOWWITHPROPERTIESRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "runWorkflowWithPropertiesReturn" element
         */
        public void setRunWorkflowWithPropertiesReturn(com.urbancode.anthill3.integration.BuildRequestFacade runWorkflowWithPropertiesReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(RUNWORKFLOWWITHPROPERTIESRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(RUNWORKFLOWWITHPROPERTIESRETURN$0);
                }
                target.set(runWorkflowWithPropertiesReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "runWorkflowWithPropertiesReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade addNewRunWorkflowWithPropertiesReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(RUNWORKFLOWWITHPROPERTIESRETURN$0);
                return target;
            }
        }
    }
}
