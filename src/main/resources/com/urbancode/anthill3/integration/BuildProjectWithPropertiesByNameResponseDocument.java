/*
 * An XML document type.
 * Localname: buildProjectWithPropertiesByNameResponse
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration;


/**
 * A document containing one buildProjectWithPropertiesByNameResponse(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public interface BuildProjectWithPropertiesByNameResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuildProjectWithPropertiesByNameResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("buildprojectwithpropertiesbynameresponseeb09doctype");
    
    /**
     * Gets the "buildProjectWithPropertiesByNameResponse" element
     */
    com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse getBuildProjectWithPropertiesByNameResponse();
    
    /**
     * Sets the "buildProjectWithPropertiesByNameResponse" element
     */
    void setBuildProjectWithPropertiesByNameResponse(com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse buildProjectWithPropertiesByNameResponse);
    
    /**
     * Appends and returns a new empty "buildProjectWithPropertiesByNameResponse" element
     */
    com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse addNewBuildProjectWithPropertiesByNameResponse();
    
    /**
     * An XML buildProjectWithPropertiesByNameResponse(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public interface BuildProjectWithPropertiesByNameResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuildProjectWithPropertiesByNameResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("buildprojectwithpropertiesbynameresponseb9acelemtype");
        
        /**
         * Gets the "buildProjectWithPropertiesByNameReturn" element
         */
        com.urbancode.anthill3.integration.BuildRequestFacade getBuildProjectWithPropertiesByNameReturn();
        
        /**
         * Sets the "buildProjectWithPropertiesByNameReturn" element
         */
        void setBuildProjectWithPropertiesByNameReturn(com.urbancode.anthill3.integration.BuildRequestFacade buildProjectWithPropertiesByNameReturn);
        
        /**
         * Appends and returns a new empty "buildProjectWithPropertiesByNameReturn" element
         */
        com.urbancode.anthill3.integration.BuildRequestFacade addNewBuildProjectWithPropertiesByNameReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse newInstance() {
              return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.BuildProjectWithPropertiesByNameResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument newInstance() {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
