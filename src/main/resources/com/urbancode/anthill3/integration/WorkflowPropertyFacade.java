/*
 * XML Type:  WorkflowPropertyFacade
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.WorkflowPropertyFacade
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration;


/**
 * An XML WorkflowPropertyFacade(@integration.anthill3.urbancode.com).
 *
 * This is a complex type.
 */
public interface WorkflowPropertyFacade extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkflowPropertyFacade.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s72BF111FE1975B57ED9ED53273C81092").resolveHandle("workflowpropertyfacade3832type");
    
    /**
     * Gets the "description" element
     */
    org.xmlsoap.schemas.soap.encoding.String getDescription();
    
    /**
     * Tests for nil "description" element
     */
    boolean isNilDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(org.xmlsoap.schemas.soap.encoding.String description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    org.xmlsoap.schemas.soap.encoding.String addNewDescription();
    
    /**
     * Nils the "description" element
     */
    void setNilDescription();
    
    /**
     * Gets the "label" element
     */
    org.xmlsoap.schemas.soap.encoding.String getLabel();
    
    /**
     * Tests for nil "label" element
     */
    boolean isNilLabel();
    
    /**
     * Sets the "label" element
     */
    void setLabel(org.xmlsoap.schemas.soap.encoding.String label);
    
    /**
     * Appends and returns a new empty "label" element
     */
    org.xmlsoap.schemas.soap.encoding.String addNewLabel();
    
    /**
     * Nils the "label" element
     */
    void setNilLabel();
    
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
     * Gets the "required" element
     */
    boolean getRequired();
    
    /**
     * Gets (as xml) the "required" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRequired();
    
    /**
     * Sets the "required" element
     */
    void setRequired(boolean required);
    
    /**
     * Sets (as xml) the "required" element
     */
    void xsetRequired(org.apache.xmlbeans.XmlBoolean required);
    
    /**
     * Gets the "userOverride" element
     */
    boolean getUserOverride();
    
    /**
     * Gets (as xml) the "userOverride" element
     */
    org.apache.xmlbeans.XmlBoolean xgetUserOverride();
    
    /**
     * Sets the "userOverride" element
     */
    void setUserOverride(boolean userOverride);
    
    /**
     * Sets (as xml) the "userOverride" element
     */
    void xsetUserOverride(org.apache.xmlbeans.XmlBoolean userOverride);
    
    /**
     * Gets the "value" element
     */
    org.xmlsoap.schemas.soap.encoding.String getValue();
    
    /**
     * Tests for nil "value" element
     */
    boolean isNilValue();
    
    /**
     * Sets the "value" element
     */
    void setValue(org.xmlsoap.schemas.soap.encoding.String value);
    
    /**
     * Appends and returns a new empty "value" element
     */
    org.xmlsoap.schemas.soap.encoding.String addNewValue();
    
    /**
     * Nils the "value" element
     */
    void setNilValue();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade newInstance() {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.urbancode.anthill3.integration.WorkflowPropertyFacade parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.urbancode.anthill3.integration.WorkflowPropertyFacade) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
