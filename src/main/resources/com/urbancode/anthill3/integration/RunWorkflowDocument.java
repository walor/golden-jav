/*
 * An XML document type.
 * Localname: runWorkflow
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.RunWorkflowDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration;


/**
 * A document containing one runWorkflow(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public interface RunWorkflowDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RunWorkflowDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("runworkflow76d8doctype");
    
    /**
     * Gets the "runWorkflow" element
     */
    com.urbancode.anthill3.integration.RunWorkflowDocument.RunWorkflow getRunWorkflow();
    
    /**
     * Sets the "runWorkflow" element
     */
    void setRunWorkflow(com.urbancode.anthill3.integration.RunWorkflowDocument.RunWorkflow runWorkflow);
    
    /**
     * Appends and returns a new empty "runWorkflow" element
     */
    com.urbancode.anthill3.integration.RunWorkflowDocument.RunWorkflow addNewRunWorkflow();
    
    /**
     * An XML runWorkflow(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public interface RunWorkflow extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RunWorkflow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("runworkflow51c2elemtype");
        
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
        java.lang.String getIn4();
        
        /**
         * Gets (as xml) the "in4" element
         */
        org.apache.xmlbeans.XmlString xgetIn4();
        
        /**
         * Sets the "in4" element
         */
        void setIn4(java.lang.String in4);
        
        /**
         * Sets (as xml) the "in4" element
         */
        void xsetIn4(org.apache.xmlbeans.XmlString in4);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.urbancode.anthill3.integration.RunWorkflowDocument.RunWorkflow newInstance() {
              return (com.urbancode.anthill3.integration.RunWorkflowDocument.RunWorkflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.urbancode.anthill3.integration.RunWorkflowDocument.RunWorkflow newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.urbancode.anthill3.integration.RunWorkflowDocument.RunWorkflow) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.urbancode.anthill3.integration.RunWorkflowDocument newInstance() {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.RunWorkflowDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.RunWorkflowDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
