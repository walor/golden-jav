/*
 * An XML document type.
 * Localname: buildProjectByName
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.BuildProjectByNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration;


/**
 * A document containing one buildProjectByName(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public interface BuildProjectByNameDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuildProjectByNameDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("buildprojectbynamed3a3doctype");
    
    /**
     * Gets the "buildProjectByName" element
     */
    com.urbancode.anthill3.integration.BuildProjectByNameDocument.BuildProjectByName getBuildProjectByName();
    
    /**
     * Sets the "buildProjectByName" element
     */
    void setBuildProjectByName(com.urbancode.anthill3.integration.BuildProjectByNameDocument.BuildProjectByName buildProjectByName);
    
    /**
     * Appends and returns a new empty "buildProjectByName" element
     */
    com.urbancode.anthill3.integration.BuildProjectByNameDocument.BuildProjectByName addNewBuildProjectByName();
    
    /**
     * An XML buildProjectByName(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public interface BuildProjectByName extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuildProjectByName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("buildprojectbyname7b6celemtype");
        
        /**
         * Gets the "in0" element
         */
        java.lang.String getIn0();
        
        /**
         * Gets (as xml) the "in0" element
         */
        org.apache.xmlbeans.XmlString xgetIn0();
        
        /**
         * Sets the "in0" element
         */
        void setIn0(java.lang.String in0);
        
        /**
         * Sets (as xml) the "in0" element
         */
        void xsetIn0(org.apache.xmlbeans.XmlString in0);
        
        /**
         * Gets the "in1" element
         */
        java.lang.String getIn1();
        
        /**
         * Gets (as xml) the "in1" element
         */
        org.apache.xmlbeans.XmlString xgetIn1();
        
        /**
         * Sets the "in1" element
         */
        void setIn1(java.lang.String in1);
        
        /**
         * Sets (as xml) the "in1" element
         */
        void xsetIn1(org.apache.xmlbeans.XmlString in1);
        
        /**
         * Gets the "in2" element
         */
        java.lang.String getIn2();
        
        /**
         * Gets (as xml) the "in2" element
         */
        org.apache.xmlbeans.XmlString xgetIn2();
        
        /**
         * Sets the "in2" element
         */
        void setIn2(java.lang.String in2);
        
        /**
         * Sets (as xml) the "in2" element
         */
        void xsetIn2(org.apache.xmlbeans.XmlString in2);
        
        /**
         * Gets the "in3" element
         */
        java.lang.String getIn3();
        
        /**
         * Gets (as xml) the "in3" element
         */
        org.apache.xmlbeans.XmlString xgetIn3();
        
        /**
         * Sets the "in3" element
         */
        void setIn3(java.lang.String in3);
        
        /**
         * Sets (as xml) the "in3" element
         */
        void xsetIn3(org.apache.xmlbeans.XmlString in3);
        
        /**
         * Gets the "in4" element
         */
        boolean getIn4();
        
        /**
         * Gets (as xml) the "in4" element
         */
        org.apache.xmlbeans.XmlBoolean xgetIn4();
        
        /**
         * Sets the "in4" element
         */
        void setIn4(boolean in4);
        
        /**
         * Sets (as xml) the "in4" element
         */
        void xsetIn4(org.apache.xmlbeans.XmlBoolean in4);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.urbancode.anthill3.integration.BuildProjectByNameDocument.BuildProjectByName newInstance() {
              return (com.urbancode.anthill3.integration.BuildProjectByNameDocument.BuildProjectByName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.urbancode.anthill3.integration.BuildProjectByNameDocument.BuildProjectByName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.urbancode.anthill3.integration.BuildProjectByNameDocument.BuildProjectByName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument newInstance() {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.BuildProjectByNameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.BuildProjectByNameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
