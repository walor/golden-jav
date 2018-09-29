/*
 * An XML document type.
 * Localname: getBuildRequestResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetBuildRequestResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getBuildRequestResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetBuildRequestResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetBuildRequestResponseDocument
{
    
    public GetBuildRequestResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBUILDREQUESTRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getBuildRequestResponse");
    
    
    /**
     * Gets the "getBuildRequestResponse" element
     */
    public com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.GetBuildRequestResponse getGetBuildRequestResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.GetBuildRequestResponse target = null;
            target = (com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.GetBuildRequestResponse)get_store().find_element_user(GETBUILDREQUESTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getBuildRequestResponse" element
     */
    public void setGetBuildRequestResponse(com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.GetBuildRequestResponse getBuildRequestResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.GetBuildRequestResponse target = null;
            target = (com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.GetBuildRequestResponse)get_store().find_element_user(GETBUILDREQUESTRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.GetBuildRequestResponse)get_store().add_element_user(GETBUILDREQUESTRESPONSE$0);
            }
            target.set(getBuildRequestResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getBuildRequestResponse" element
     */
    public com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.GetBuildRequestResponse addNewGetBuildRequestResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.GetBuildRequestResponse target = null;
            target = (com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.GetBuildRequestResponse)get_store().add_element_user(GETBUILDREQUESTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getBuildRequestResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetBuildRequestResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.GetBuildRequestResponse
    {
        
        public GetBuildRequestResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETBUILDREQUESTRETURN$0 = 
            new javax.xml.namespace.QName("", "getBuildRequestReturn");
        
        
        /**
         * Gets the "getBuildRequestReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade getGetBuildRequestReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(GETBUILDREQUESTRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getBuildRequestReturn" element
         */
        public void setGetBuildRequestReturn(com.urbancode.anthill3.integration.BuildRequestFacade getBuildRequestReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().find_element_user(GETBUILDREQUESTRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(GETBUILDREQUESTRETURN$0);
                }
                target.set(getBuildRequestReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getBuildRequestReturn" element
         */
        public com.urbancode.anthill3.integration.BuildRequestFacade addNewGetBuildRequestReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.BuildRequestFacade target = null;
                target = (com.urbancode.anthill3.integration.BuildRequestFacade)get_store().add_element_user(GETBUILDREQUESTRETURN$0);
                return target;
            }
        }
    }
}
