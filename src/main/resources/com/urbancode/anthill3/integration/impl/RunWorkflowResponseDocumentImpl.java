/*
 * An XML document type.
 * Localname: runWorkflowResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.RunWorkflowResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one runWorkflowResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class RunWorkflowResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.RunWorkflowResponseDocument
{
    
    public RunWorkflowResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNWORKFLOWRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "runWorkflowResponse");
    
    
    /**
     * Gets the "runWorkflowResponse" element
     */
    public com.urbancode.anthill3.integration.RunWorkflowResponseDocument.RunWorkflowResponse getRunWorkflowResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowResponseDocument.RunWorkflowResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowResponseDocument.RunWorkflowResponse)get_store().find_element_user(RUNWORKFLOWRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "runWorkflowResponse" element
     */
    public void setRunWorkflowResponse(com.urbancode.anthill3.integration.RunWorkflowResponseDocument.RunWorkflowResponse runWorkflowResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowResponseDocument.RunWorkflowResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowResponseDocument.RunWorkflowResponse)get_store().find_element_user(RUNWORKFLOWRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.RunWorkflowResponseDocument.RunWorkflowResponse)get_store().add_element_user(RUNWORKFLOWRESPONSE$0);
            }
            target.set(runWorkflowResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "runWorkflowResponse" element
     */
    public com.urbancode.anthill3.integration.RunWorkflowResponseDocument.RunWorkflowResponse addNewRunWorkflowResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowResponseDocument.RunWorkflowResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowResponseDocument.RunWorkflowResponse)get_store().add_element_user(RUNWORKFLOWRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML runWorkflowResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class RunWorkflowResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.RunWorkflowResponseDocument.RunWorkflowResponse
    {
        
        public RunWorkflowResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RUNWORKFLOWRETURN$0 = 
            new javax.xml.namespace.QName("", "runWorkflowReturn");
        
        
        /**
         * Gets the "runWorkflowReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade getRunWorkflowReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(RUNWORKFLOWRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "runWorkflowReturn" element
         */
        public void setRunWorkflowReturn(com.urbancode.anthill3.integration.BuildRequestFacade runWorkflowReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(RUNWORKFLOWRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(RUNWORKFLOWRETURN$0);
                }
                target.set(runWorkflowReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "runWorkflowReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade addNewRunWorkflowReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(RUNWORKFLOWRETURN$0);
                return target;
            }
        }
    }
}
