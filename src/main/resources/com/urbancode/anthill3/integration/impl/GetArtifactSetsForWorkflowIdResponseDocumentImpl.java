/*
 * An XML document type.
 * Localname: getArtifactSetsForWorkflowIdResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getArtifactSetsForWorkflowIdResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetArtifactSetsForWorkflowIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument
{
    
    public GetArtifactSetsForWorkflowIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETARTIFACTSETSFORWORKFLOWIDRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getArtifactSetsForWorkflowIdResponse");
    
    
    /**
     * Gets the "getArtifactSetsForWorkflowIdResponse" element
     */
    public com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.GetArtifactSetsForWorkflowIdResponse getGetArtifactSetsForWorkflowIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.GetArtifactSetsForWorkflowIdResponse target = null;
            target = (com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.GetArtifactSetsForWorkflowIdResponse)get_store().find_element_user(GETARTIFACTSETSFORWORKFLOWIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getArtifactSetsForWorkflowIdResponse" element
     */
    public void setGetArtifactSetsForWorkflowIdResponse(com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.GetArtifactSetsForWorkflowIdResponse getArtifactSetsForWorkflowIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.GetArtifactSetsForWorkflowIdResponse target = null;
            target = (com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.GetArtifactSetsForWorkflowIdResponse)get_store().find_element_user(GETARTIFACTSETSFORWORKFLOWIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.GetArtifactSetsForWorkflowIdResponse)get_store().add_element_user(GETARTIFACTSETSFORWORKFLOWIDRESPONSE$0);
            }
            target.set(getArtifactSetsForWorkflowIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getArtifactSetsForWorkflowIdResponse" element
     */
    public com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.GetArtifactSetsForWorkflowIdResponse addNewGetArtifactSetsForWorkflowIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.GetArtifactSetsForWorkflowIdResponse target = null;
            target = (com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.GetArtifactSetsForWorkflowIdResponse)get_store().add_element_user(GETARTIFACTSETSFORWORKFLOWIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getArtifactSetsForWorkflowIdResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetArtifactSetsForWorkflowIdResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.GetArtifactSetsForWorkflowIdResponse
    {
        
        public GetArtifactSetsForWorkflowIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETARTIFACTSETSFORWORKFLOWIDRETURN$0 = 
            new javax.xml.namespace.QName("", "getArtifactSetsForWorkflowIdReturn");
        
        
        /**
         * Gets the "getArtifactSetsForWorkflowIdReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfArtifactSetFacade getGetArtifactSetsForWorkflowIdReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfArtifactSetFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfArtifactSetFacade)get_store().find_element_user(GETARTIFACTSETSFORWORKFLOWIDRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getArtifactSetsForWorkflowIdReturn" element
         */
        public void setGetArtifactSetsForWorkflowIdReturn(com.urbancode.anthill3.integration.ArrayOfArtifactSetFacade getArtifactSetsForWorkflowIdReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfArtifactSetFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfArtifactSetFacade)get_store().find_element_user(GETARTIFACTSETSFORWORKFLOWIDRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfArtifactSetFacade)get_store().add_element_user(GETARTIFACTSETSFORWORKFLOWIDRETURN$0);
                }
                target.set(getArtifactSetsForWorkflowIdReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getArtifactSetsForWorkflowIdReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfArtifactSetFacade addNewGetArtifactSetsForWorkflowIdReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfArtifactSetFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfArtifactSetFacade)get_store().add_element_user(GETARTIFACTSETSFORWORKFLOWIDRETURN$0);
                return target;
            }
        }
    }
}
