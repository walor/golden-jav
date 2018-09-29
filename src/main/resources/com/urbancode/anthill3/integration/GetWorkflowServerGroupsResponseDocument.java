/*
 * An XML document type.
 * Localname: getWorkflowServerGroupsResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration;


/**
 * A document containing one getWorkflowServerGroupsResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public interface GetWorkflowServerGroupsResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWorkflowServerGroupsResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("getworkflowservergroupsresponse07b5doctype");
    
    /**
     * Gets the "getWorkflowServerGroupsResponse" element
     */
    com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse getGetWorkflowServerGroupsResponse();
    
    /**
     * Sets the "getWorkflowServerGroupsResponse" element
     */
    void setGetWorkflowServerGroupsResponse(com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse getWorkflowServerGroupsResponse);
    
    /**
     * Appends and returns a new empty "getWorkflowServerGroupsResponse" element
     */
    com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse addNewGetWorkflowServerGroupsResponse();
    
    /**
     * An XML getWorkflowServerGroupsResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public interface GetWorkflowServerGroupsResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetWorkflowServerGroupsResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("getworkflowservergroupsresponse1dbcelemtype");
        
        /**
         * Gets the "getWorkflowServerGroupsReturn" element
         */
        com.urbancode.anthill3.integration.ArrayOfServerGroupFacade getGetWorkflowServerGroupsReturn();
        
        /**
         * Sets the "getWorkflowServerGroupsReturn" element
         */
        void setGetWorkflowServerGroupsReturn(com.urbancode.anthill3.integration.ArrayOfServerGroupFacade getWorkflowServerGroupsReturn);
        
        /**
         * Appends and returns a new empty "getWorkflowServerGroupsReturn" element
         */
        com.urbancode.anthill3.integration.ArrayOfServerGroupFacade addNewGetWorkflowServerGroupsReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse newInstance() {
              return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.GetWorkflowServerGroupsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument newInstance() {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
