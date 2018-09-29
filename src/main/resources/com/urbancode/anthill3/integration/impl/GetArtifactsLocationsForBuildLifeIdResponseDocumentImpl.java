/*
 * An XML document type.
 * Localname: getArtifactsLocationsForBuildLifeIdResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getArtifactsLocationsForBuildLifeIdResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetArtifactsLocationsForBuildLifeIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument
{
    
    public GetArtifactsLocationsForBuildLifeIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETARTIFACTSLOCATIONSFORBUILDLIFEIDRESPONSE$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getArtifactsLocationsForBuildLifeIdResponse");
    
    
    /**
     * Gets the "getArtifactsLocationsForBuildLifeIdResponse" element
     */
    public com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.GetArtifactsLocationsForBuildLifeIdResponse getGetArtifactsLocationsForBuildLifeIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.GetArtifactsLocationsForBuildLifeIdResponse target = null;
            target = (com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.GetArtifactsLocationsForBuildLifeIdResponse)get_store().find_element_user(GETARTIFACTSLOCATIONSFORBUILDLIFEIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getArtifactsLocationsForBuildLifeIdResponse" element
     */
    public void setGetArtifactsLocationsForBuildLifeIdResponse(com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.GetArtifactsLocationsForBuildLifeIdResponse getArtifactsLocationsForBuildLifeIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.GetArtifactsLocationsForBuildLifeIdResponse target = null;
            target = (com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.GetArtifactsLocationsForBuildLifeIdResponse)get_store().find_element_user(GETARTIFACTSLOCATIONSFORBUILDLIFEIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.GetArtifactsLocationsForBuildLifeIdResponse)get_store().add_element_user(GETARTIFACTSLOCATIONSFORBUILDLIFEIDRESPONSE$0);
            }
            target.set(getArtifactsLocationsForBuildLifeIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getArtifactsLocationsForBuildLifeIdResponse" element
     */
    public com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.GetArtifactsLocationsForBuildLifeIdResponse addNewGetArtifactsLocationsForBuildLifeIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.GetArtifactsLocationsForBuildLifeIdResponse target = null;
            target = (com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.GetArtifactsLocationsForBuildLifeIdResponse)get_store().add_element_user(GETARTIFACTSLOCATIONSFORBUILDLIFEIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getArtifactsLocationsForBuildLifeIdResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetArtifactsLocationsForBuildLifeIdResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.GetArtifactsLocationsForBuildLifeIdResponse
    {
        
        public GetArtifactsLocationsForBuildLifeIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GETARTIFACTSLOCATIONSFORBUILDLIFEIDRETURN$0 = 
            new javax.xml.namespace.QName("", "getArtifactsLocationsForBuildLifeIdReturn");
        
        
        /**
         * Gets the "getArtifactsLocationsForBuildLifeIdReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfString getGetArtifactsLocationsForBuildLifeIdReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfString target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfString)get_store().find_element_user(GETARTIFACTSLOCATIONSFORBUILDLIFEIDRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "getArtifactsLocationsForBuildLifeIdReturn" element
         */
        public void setGetArtifactsLocationsForBuildLifeIdReturn(com.urbancode.anthill3.integration.ArrayOfString getArtifactsLocationsForBuildLifeIdReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfString target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfString)get_store().find_element_user(GETARTIFACTSLOCATIONSFORBUILDLIFEIDRETURN$0, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfString)get_store().add_element_user(GETARTIFACTSLOCATIONSFORBUILDLIFEIDRETURN$0);
                }
                target.set(getArtifactsLocationsForBuildLifeIdReturn);
            }
        }
        
        /**
         * Appends and returns a new empty "getArtifactsLocationsForBuildLifeIdReturn" element
         */
        public com.urbancode.anthill3.integration.ArrayOfString addNewGetArtifactsLocationsForBuildLifeIdReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfString target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfString)get_store().add_element_user(GETARTIFACTSLOCATIONSFORBUILDLIFEIDRETURN$0);
                return target;
            }
        }
    }
}
