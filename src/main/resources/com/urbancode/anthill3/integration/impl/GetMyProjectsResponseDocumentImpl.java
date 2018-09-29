/*
 * An XML document type.
 * Localname: getMyProjectsResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetMyProjectsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getMyProjectsResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetMyProjectsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetMyProjectsResponseDocument
{
    
    public GetMyProjectsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMYPROJECTSRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getMyProjectsResponse");
    
    
    /**
     * Gets the "getMyProjectsResponse" element
     */
    public com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.GetMyProjectsResponse getGetMyProjectsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.GetMyProjectsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.GetMyProjectsResponse)get_store().find_element_user(GETMYPROJECTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMyProjectsResponse" element
     */
    public void setGetMyProjectsResponse(com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.GetMyProjectsResponse getMyProjectsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.GetMyProjectsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.GetMyProjectsResponse)get_store().find_element_user(GETMYPROJECTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.GetMyProjectsResponse)get_store().add_element_user(GETMYPROJECTSRESPONSE$0);
            }
            target.set(getMyProjectsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getMyProjectsResponse" element
     */
    public com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.GetMyProjectsResponse addNewGetMyProjectsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.GetMyProjectsResponse target = null;
            target = (com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.GetMyProjectsResponse)get_store().add_element_user(GETMYPROJECTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getMyProjectsResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetMyProjectsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.GetMyProjectsResponse
    {
        
        public GetMyProjectsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETMYPROJECTSRETURN$0 = 
            new javax.xml.namespace.QName("", "getMyProjectsReturn");
        
        
        /**
         * Gets the "getMyProjectsReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfProjectFacade getGetMyProjectsReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfProjectFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfProjectFacade)get_store().find_element_user(GETMYPROJECTSRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getMyProjectsReturn" element
         */
        public void setGetMyProjectsReturn(com.urbancode.anthill3.integration.ArrayOfProjectFacade getMyProjectsReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfProjectFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfProjectFacade)get_store().find_element_user(GETMYPROJECTSRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfProjectFacade)get_store().add_element_user(GETMYPROJECTSRETURN$0);
                }
                target.set(getMyProjectsReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getMyProjectsReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfProjectFacade addNewGetMyProjectsReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfProjectFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfProjectFacade)get_store().add_element_user(GETMYPROJECTSRETURN$0);
                return target;
            }
        }
    }
}
