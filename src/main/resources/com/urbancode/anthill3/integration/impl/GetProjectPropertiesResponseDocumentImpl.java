/*
 * An XML document type.
 * Localname: getProjectPropertiesResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getProjectPropertiesResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetProjectPropertiesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument
{
    
    public GetProjectPropertiesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROJECTPROPERTIESRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getProjectPropertiesResponse");
    
    
    /**
     * Gets the "getProjectPropertiesResponse" element
     */
    public com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.GetProjectPropertiesResponse getGetProjectPropertiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.GetProjectPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.GetProjectPropertiesResponse)get_store().find_element_user(GETPROJECTPROPERTIESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProjectPropertiesResponse" element
     */
    public void setGetProjectPropertiesResponse(com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.GetProjectPropertiesResponse getProjectPropertiesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.GetProjectPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.GetProjectPropertiesResponse)get_store().find_element_user(GETPROJECTPROPERTIESRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.GetProjectPropertiesResponse)get_store().add_element_user(GETPROJECTPROPERTIESRESPONSE$0);
            }
            target.set(getProjectPropertiesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getProjectPropertiesResponse" element
     */
    public com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.GetProjectPropertiesResponse addNewGetProjectPropertiesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.GetProjectPropertiesResponse target = null;
            target = (com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.GetProjectPropertiesResponse)get_store().add_element_user(GETPROJECTPROPERTIESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getProjectPropertiesResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetProjectPropertiesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.GetProjectPropertiesResponse
    {
        
        public GetProjectPropertiesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETPROJECTPROPERTIESRETURN$0 = 
            new javax.xml.namespace.QName("", "getProjectPropertiesReturn");
        
        
        /**
         * Gets the "getProjectPropertiesReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfProjectPropertyFacade getGetProjectPropertiesReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfProjectPropertyFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfProjectPropertyFacade)get_store().find_element_user(GETPROJECTPROPERTIESRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getProjectPropertiesReturn" element
         */
        public void setGetProjectPropertiesReturn(com.urbancode.anthill3.integration.ArrayOfProjectPropertyFacade getProjectPropertiesReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfProjectPropertyFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfProjectPropertyFacade)get_store().find_element_user(GETPROJECTPROPERTIESRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfProjectPropertyFacade)get_store().add_element_user(GETPROJECTPROPERTIESRETURN$0);
                }
                target.set(getProjectPropertiesReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getProjectPropertiesReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfProjectPropertyFacade addNewGetProjectPropertiesReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfProjectPropertyFacade target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfProjectPropertyFacade)get_store().add_element_user(GETPROJECTPROPERTIESRETURN$0);
                return target;
            }
        }
    }
}
