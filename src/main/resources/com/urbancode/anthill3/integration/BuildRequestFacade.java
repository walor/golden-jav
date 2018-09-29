/*
 * XML Type:  BuildRequestFacade
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.BuildRequestFacade
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration;


/**
 * An XML BuildRequestFacade(@integration.anthill3.urbancode.com).
 *
 * This is a complex type.
 */
public interface BuildRequestFacade extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuildRequestFacade.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("buildrequestfacade9cc5type");
    
    /**
     * Gets the "buildLifeId" element
     */
    org.xmlsoap.schemas.soap.encoding.String getBuildLifeId();
    
    /**
     * Tests for nil "buildLifeId" element
     */
    boolean isNilBuildLifeId();
    
    /**
     * Sets the "buildLifeId" element
     */
    void setBuildLifeId(org.xmlsoap.schemas.soap.encoding.String buildLifeId);
    
    /**
     * Appends and returns a new empty "buildLifeId" element
     */
    org.xmlsoap.schemas.soap.encoding.String addNewBuildLifeId();
    
    /**
     * Nils the "buildLifeId" element
     */
    void setNilBuildLifeId();
    
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
     * Gets the "status" element
     */
    org.xmlsoap.schemas.soap.encoding.String getStatus();
    
    /**
     * Tests for nil "status" element
     */
    boolean isNilStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.xmlsoap.schemas.soap.encoding.String status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.xmlsoap.schemas.soap.encoding.String addNewStatus();
    
    /**
     * Nils the "status" element
     */
    void setNilStatus();
    
    /**
     * Gets the "workflowId" element
     */
    org.xmlsoap.schemas.soap.encoding.String getWorkflowId();
    
    /**
     * Tests for nil "workflowId" element
     */
    boolean isNilWorkflowId();
    
    /**
     * Sets the "workflowId" element
     */
    void setWorkflowId(org.xmlsoap.schemas.soap.encoding.String workflowId);
    
    /**
     * Appends and returns a new empty "workflowId" element
     */
    org.xmlsoap.schemas.soap.encoding.String addNewWorkflowId();
    
    /**
     * Nils the "workflowId" element
     */
    void setNilWorkflowId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.urbancode.anthill3.integration.BuildRequestFacade newInstance() {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.BuildRequestFacade parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.BuildRequestFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
