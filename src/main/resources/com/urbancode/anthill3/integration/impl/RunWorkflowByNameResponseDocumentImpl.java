/*
 * An XML document type.
 * Localname: runWorkflowByNameResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one runWorkflowByNameResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class RunWorkflowByNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument
{
    
    public RunWorkflowByNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNWORKFLOWBYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "runWorkflowByNameResponse");
    
    
    /**
     * Gets the "runWorkflowByNameResponse" element
     */
    public com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.RunWorkflowByNameResponse getRunWorkflowByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.RunWorkflowByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.RunWorkflowByNameResponse)get_store().find_element_user(RUNWORKFLOWBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "runWorkflowByNameResponse" element
     */
    public void setRunWorkflowByNameResponse(com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.RunWorkflowByNameResponse runWorkflowByNameResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.RunWorkflowByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.RunWorkflowByNameResponse)get_store().find_element_user(RUNWORKFLOWBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.RunWorkflowByNameResponse)get_store().add_element_user(RUNWORKFLOWBYNAMERESPONSE$0);
            }
            target.set(runWorkflowByNameResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "runWorkflowByNameResponse" element
     */
    public com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.RunWorkflowByNameResponse addNewRunWorkflowByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.RunWorkflowByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.RunWorkflowByNameResponse)get_store().add_element_user(RUNWORKFLOWBYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML runWorkflowByNameResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class RunWorkflowByNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.RunWorkflowByNameResponse
    {
        
        public RunWorkflowByNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RUNWORKFLOWBYNAMERETURN$0 = 
            new javax.xml.namespace.QName("", "runWorkflowByNameReturn");
        
        
        /**
         * Gets the "runWorkflowByNameReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade getRunWorkflowByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(RUNWORKFLOWBYNAMERETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "runWorkflowByNameReturn" element
         */
        public void setRunWorkflowByNameReturn(com.urbancode.anthill3.integration.BuildRequestFacade runWorkflowByNameReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(RUNWORKFLOWBYNAMERETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(RUNWORKFLOWBYNAMERETURN$0);
                }
                target.set(runWorkflowByNameReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "runWorkflowByNameReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade addNewRunWorkflowByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(RUNWORKFLOWBYNAMERETURN$0);
                return target;
            }
        }
    }
}
