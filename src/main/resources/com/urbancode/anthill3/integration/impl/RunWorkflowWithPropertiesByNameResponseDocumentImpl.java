/*
 * An XML document type.
 * Localname: runWorkflowWithPropertiesByNameResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one runWorkflowWithPropertiesByNameResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class RunWorkflowWithPropertiesByNameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument
{
    
    public RunWorkflowWithPropertiesByNameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNWORKFLOWWITHPROPERTIESBYNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "runWorkflowWithPropertiesByNameResponse");
    
    
    /**
     * Gets the "runWorkflowWithPropertiesByNameResponse" element
     */
    public com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.RunWorkflowWithPropertiesByNameResponse getRunWorkflowWithPropertiesByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.RunWorkflowWithPropertiesByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.RunWorkflowWithPropertiesByNameResponse)get_store().find_element_user(RUNWORKFLOWWITHPROPERTIESBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "runWorkflowWithPropertiesByNameResponse" element
     */
    public void setRunWorkflowWithPropertiesByNameResponse(com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.RunWorkflowWithPropertiesByNameResponse runWorkflowWithPropertiesByNameResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.RunWorkflowWithPropertiesByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.RunWorkflowWithPropertiesByNameResponse)get_store().find_element_user(RUNWORKFLOWWITHPROPERTIESBYNAMERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.RunWorkflowWithPropertiesByNameResponse)get_store().add_element_user(RUNWORKFLOWWITHPROPERTIESBYNAMERESPONSE$0);
            }
            target.set(runWorkflowWithPropertiesByNameResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "runWorkflowWithPropertiesByNameResponse" element
     */
    public com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.RunWorkflowWithPropertiesByNameResponse addNewRunWorkflowWithPropertiesByNameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.RunWorkflowWithPropertiesByNameResponse target = null;
            target = (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.RunWorkflowWithPropertiesByNameResponse)get_store().add_element_user(RUNWORKFLOWWITHPROPERTIESBYNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML runWorkflowWithPropertiesByNameResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class RunWorkflowWithPropertiesByNameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.RunWorkflowWithPropertiesByNameResponse
    {
        
        public RunWorkflowWithPropertiesByNameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RUNWORKFLOWWITHPROPERTIESBYNAMERETURN$0 = 
            new javax.xml.namespace.QName("", "runWorkflowWithPropertiesByNameReturn");
        
        
        /**
         * Gets the "runWorkflowWithPropertiesByNameReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade getRunWorkflowWithPropertiesByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(RUNWORKFLOWWITHPROPERTIESBYNAMERETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "runWorkflowWithPropertiesByNameReturn" element
         */
        public void setRunWorkflowWithPropertiesByNameReturn(com.urbancode.anthill3.integration.BuildRequestFacade runWorkflowWithPropertiesByNameReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(RUNWORKFLOWWITHPROPERTIESBYNAMERETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(RUNWORKFLOWWITHPROPERTIESBYNAMERETURN$0);
                }
                target.set(runWorkflowWithPropertiesByNameReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "runWorkflowWithPropertiesByNameReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade addNewRunWorkflowWithPropertiesByNameReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(RUNWORKFLOWWITHPROPERTIESBYNAMERETURN$0);
                return target;
            }
        }
    }
}
