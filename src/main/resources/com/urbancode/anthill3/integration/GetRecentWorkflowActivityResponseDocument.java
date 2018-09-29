/*
 * An XML document type.
 * Localname: getRecentWorkflowActivityResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration;


/**
 * A document containing one getRecentWorkflowActivityResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public interface GetRecentWorkflowActivityResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetRecentWorkflowActivityResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("getrecentworkflowactivityresponse2d02doctype");
    
    /**
     * Gets the "getRecentWorkflowActivityResponse" element
     */
    com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse getGetRecentWorkflowActivityResponse();
    
    /**
     * Sets the "getRecentWorkflowActivityResponse" element
     */
    void setGetRecentWorkflowActivityResponse(com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse getRecentWorkflowActivityResponse);
    
    /**
     * Appends and returns a new empty "getRecentWorkflowActivityResponse" element
     */
    com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse addNewGetRecentWorkflowActivityResponse();
    
    /**
     * An XML getRecentWorkflowActivityResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public interface GetRecentWorkflowActivityResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetRecentWorkflowActivityResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("getrecentworkflowactivityresponse6456elemtype");
        
        /**
         * Gets the "getRecentWorkflowActivityReturn" element
         */
        com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade getGetRecentWorkflowActivityReturn();
        
        /**
         * Sets the "getRecentWorkflowActivityReturn" element
         */
        void setGetRecentWorkflowActivityReturn(com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade getRecentWorkflowActivityReturn);
        
        /**
         * Appends and returns a new empty "getRecentWorkflowActivityReturn" element
         */
        com.urbancode.anthill3.integration.ArrayOfWorkflowActivityFacade addNewGetRecentWorkflowActivityReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse newInstance() {
              return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.GetRecentWorkflowActivityResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument newInstance() {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
