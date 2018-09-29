/*
 * XML Type:  WorkflowFacade
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.WorkflowFacade
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration;


/**
 * An XML WorkflowFacade(@integration.anthill3.urbancode.com).
 *
 * This is a complex type.
 */
public interface WorkflowFacade extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkflowFacade.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("workflowfacadeba87type");
    
    /**
     * Gets the "id" element
     */
    org.xmlsoap.schemas.soap.encoding.String getId();
    
    /**
     * Tests for nil "id" element
     */
    boolean isNilId();
    
    /**
     * Sets the "id" element
     */
    void setId(org.xmlsoap.schemas.soap.encoding.String id);
    
    /**
     * Appends and returns a new empty "id" element
     */
    org.xmlsoap.schemas.soap.encoding.String addNewId();
    
    /**
     * Nils the "id" element
     */
    void setNilId();
    
    /**
     * Gets the "name" element
     */
    org.xmlsoap.schemas.soap.encoding.String getName();
    
    /**
     * Tests for nil "name" element
     */
    boolean isNilName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.xmlsoap.schemas.soap.encoding.String name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.xmlsoap.schemas.soap.encoding.String addNewName();
    
    /**
     * Nils the "name" element
     */
    void setNilName();
    
    /**
     * Gets the "originating" element
     */
    boolean getOriginating();
    
    /**
     * Gets (as xml) the "originating" element
     */
    org.apache.xmlbeans.XmlBoolean xgetOriginating();
    
    /**
     * Sets the "originating" element
     */
    void setOriginating(boolean originating);
    
    /**
     * Sets (as xml) the "originating" element
     */
    void xsetOriginating(org.apache.xmlbeans.XmlBoolean originating);
    
    /**
     * Gets the "preflightCopy" element
     */
    boolean getPreflightCopy();
    
    /**
     * Gets (as xml) the "preflightCopy" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPreflightCopy();
    
    /**
     * Sets the "preflightCopy" element
     */
    void setPreflightCopy(boolean preflightCopy);
    
    /**
     * Sets (as xml) the "preflightCopy" element
     */
    void xsetPreflightCopy(org.apache.xmlbeans.XmlBoolean preflightCopy);
    
    /**
     * Gets the "preflightOriginal" element
     */
    boolean getPreflightOriginal();
    
    /**
     * Gets (as xml) the "preflightOriginal" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPreflightOriginal();
    
    /**
     * Sets the "preflightOriginal" element
     */
    void setPreflightOriginal(boolean preflightOriginal);
    
    /**
     * Sets (as xml) the "preflightOriginal" element
     */
    void xsetPreflightOriginal(org.apache.xmlbeans.XmlBoolean preflightOriginal);
    
    /**
     * Gets the "projectId" element
     */
    org.xmlsoap.schemas.soap.encoding.String getProjectId();
    
    /**
     * Tests for nil "projectId" element
     */
    boolean isNilProjectId();
    
    /**
     * Sets the "projectId" element
     */
    void setProjectId(org.xmlsoap.schemas.soap.encoding.String projectId);
    
    /**
     * Appends and returns a new empty "projectId" element
     */
    org.xmlsoap.schemas.soap.encoding.String addNewProjectId();
    
    /**
     * Nils the "projectId" element
     */
    void setNilProjectId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.urbancode.anthill3.integration.WorkflowFacade newInstance() {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.WorkflowFacade parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.WorkflowFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
