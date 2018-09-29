/*
 * An XML document type.
 * Localname: getBuildSummaryLinkResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getBuildSummaryLinkResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetBuildSummaryLinkResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument
{
    
    public GetBuildSummaryLinkResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBUILDSUMMARYLINKRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getBuildSummaryLinkResponse");
    
    
    /**
     * Gets the "getBuildSummaryLinkResponse" element
     */
    public com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.GetBuildSummaryLinkResponse getGetBuildSummaryLinkResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.GetBuildSummaryLinkResponse target = null;
            target = (com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.GetBuildSummaryLinkResponse)get_store().find_element_user(GETBUILDSUMMARYLINKRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getBuildSummaryLinkResponse" element
     */
    public void setGetBuildSummaryLinkResponse(com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.GetBuildSummaryLinkResponse getBuildSummaryLinkResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.GetBuildSummaryLinkResponse target = null;
            target = (com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.GetBuildSummaryLinkResponse)get_store().find_element_user(GETBUILDSUMMARYLINKRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.GetBuildSummaryLinkResponse)get_store().add_element_user(GETBUILDSUMMARYLINKRESPONSE$0);
            }
            target.set(getBuildSummaryLinkResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getBuildSummaryLinkResponse" element
     */
    public com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.GetBuildSummaryLinkResponse addNewGetBuildSummaryLinkResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.GetBuildSummaryLinkResponse target = null;
            target = (com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.GetBuildSummaryLinkResponse)get_store().add_element_user(GETBUILDSUMMARYLINKRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getBuildSummaryLinkResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetBuildSummaryLinkResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.GetBuildSummaryLinkResponse
    {
        
        public GetBuildSummaryLinkResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETBUILDSUMMARYLINKRETURN$0 = 
            new javax.xml.namespace.QName("", "getBuildSummaryLinkReturn");
        
        
        /**
         * Gets the "getBuildSummaryLinkReturn" element
         */
        public java.lang.String getGetBuildSummaryLinkReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETBUILDSUMMARYLINKRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "getBuildSummaryLinkReturn" element
         */
        public org.apache.xmlbeans.XmlString xgetGetBuildSummaryLinkReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETBUILDSUMMARYLINKRETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "getBuildSummaryLinkReturn" element
         */
        public void setGetBuildSummaryLinkReturn(java.lang.String getBuildSummaryLinkReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETBUILDSUMMARYLINKRETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETBUILDSUMMARYLINKRETURN$0);
                }
                target.setStringValue(getBuildSummaryLinkReturn);
            }
        }
        
        /**
         * Sets (as xml) the "getBuildSummaryLinkReturn" element
         */
        public void xsetGetBuildSummaryLinkReturn(org.apache.xmlbeans.XmlString getBuildSummaryLinkReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETBUILDSUMMARYLINKRETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GETBUILDSUMMARYLINKRETURN$0);
                }
                target.set(getBuildSummaryLinkReturn);
            }
        }
    }
}
