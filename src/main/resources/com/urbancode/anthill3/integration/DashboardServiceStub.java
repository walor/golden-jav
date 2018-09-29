/**
 * DashboardServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */
        package com.urbancode.anthill3.integration;

        

        /*
        *  DashboardServiceStub java implementation
        */

        
        public class DashboardServiceStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("DashboardService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[27];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getLatestActivityForWorkflows"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getRecentWorkflowActivity"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getBuildSummaryLink"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getMyPreflightWorkflows"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getWorkflowServerGroupByName"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getWorkflowServerGroups"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "runWorkflowWithPropertiesByName"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getProjectProperties"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getWorkflowProperties"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getBuildRequest"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "buildProjectWithProperties"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "buildProject"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "runWorkflow"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getProject"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "buildProjectWithPropertiesByName"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getMyProjects"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "runWorkflowByName"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[16]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getRecentActivityForWorkflow"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[17]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getRecentActivityForProject"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[18]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getArtifactsLocationsForBuildLifeId"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[19]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getProjectWorkflowByName"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[20]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "buildProjectByName"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[21]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getWorkflow"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[22]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "runWorkflowWithProperties"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[23]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getArtifactSetsForWorkflowId"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[24]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getProjectByName"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[25]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getProjectWorkflows"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[26]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

    /**
      *Constructor that takes in a configContext
      */

    public DashboardServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public DashboardServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        configurationContext = _serviceClient.getServiceContext().getConfigurationContext();

        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public DashboardServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://10.88.11.73:8443/services/Dashboard" );
                
    }

    /**
     * Default Constructor
     */
    public DashboardServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://10.88.11.73:8443/services/Dashboard" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public DashboardServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getLatestActivityForWorkflows
                     * @param getLatestActivityForWorkflows0
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument getLatestActivityForWorkflows(

                            com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument getLatestActivityForWorkflows0)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getLatestActivityForWorkflows0,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getLatestActivityForWorkflows")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetLatestActivityForWorkflows
                    * @param getLatestActivityForWorkflows0
                
                */
                public  void startgetLatestActivityForWorkflows(

                 com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument getLatestActivityForWorkflows0,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getLatestActivityForWorkflows0,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getLatestActivityForWorkflows")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetLatestActivityForWorkflows(
                                        (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetLatestActivityForWorkflows(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetLatestActivityForWorkflows(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetLatestActivityForWorkflows(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetLatestActivityForWorkflows(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetLatestActivityForWorkflows(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetLatestActivityForWorkflows(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetLatestActivityForWorkflows(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetLatestActivityForWorkflows(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetLatestActivityForWorkflows(f);
                                            }
									    } else {
										    callback.receiveErrorgetLatestActivityForWorkflows(f);
									    }
									} else {
									    callback.receiveErrorgetLatestActivityForWorkflows(f);
									}
								} else {
								    callback.receiveErrorgetLatestActivityForWorkflows(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetLatestActivityForWorkflows(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getRecentWorkflowActivity
                     * @param getRecentWorkflowActivity2
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument getRecentWorkflowActivity(

                            com.urbancode.anthill3.integration.GetRecentWorkflowActivityDocument getRecentWorkflowActivity2)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRecentWorkflowActivity2,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getRecentWorkflowActivity")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetRecentWorkflowActivity
                    * @param getRecentWorkflowActivity2
                
                */
                public  void startgetRecentWorkflowActivity(

                 com.urbancode.anthill3.integration.GetRecentWorkflowActivityDocument getRecentWorkflowActivity2,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRecentWorkflowActivity2,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getRecentWorkflowActivity")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetRecentWorkflowActivity(
                                        (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetRecentWorkflowActivity(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetRecentWorkflowActivity(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentWorkflowActivity(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentWorkflowActivity(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentWorkflowActivity(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentWorkflowActivity(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentWorkflowActivity(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentWorkflowActivity(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentWorkflowActivity(f);
                                            }
									    } else {
										    callback.receiveErrorgetRecentWorkflowActivity(f);
									    }
									} else {
									    callback.receiveErrorgetRecentWorkflowActivity(f);
									}
								} else {
								    callback.receiveErrorgetRecentWorkflowActivity(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetRecentWorkflowActivity(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getBuildSummaryLink
                     * @param getBuildSummaryLink4
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument getBuildSummaryLink(

                            com.urbancode.anthill3.integration.GetBuildSummaryLinkDocument getBuildSummaryLink4)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getBuildSummaryLink4,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getBuildSummaryLink")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetBuildSummaryLink
                    * @param getBuildSummaryLink4
                
                */
                public  void startgetBuildSummaryLink(

                 com.urbancode.anthill3.integration.GetBuildSummaryLinkDocument getBuildSummaryLink4,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getBuildSummaryLink4,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getBuildSummaryLink")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetBuildSummaryLink(
                                        (com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetBuildSummaryLink(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetBuildSummaryLink(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildSummaryLink(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildSummaryLink(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildSummaryLink(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildSummaryLink(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildSummaryLink(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildSummaryLink(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildSummaryLink(f);
                                            }
									    } else {
										    callback.receiveErrorgetBuildSummaryLink(f);
									    }
									} else {
									    callback.receiveErrorgetBuildSummaryLink(f);
									}
								} else {
								    callback.receiveErrorgetBuildSummaryLink(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetBuildSummaryLink(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getMyPreflightWorkflows
                     * @param getMyPreflightWorkflows6
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument getMyPreflightWorkflows(

                            com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument getMyPreflightWorkflows6)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getMyPreflightWorkflows6,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getMyPreflightWorkflows")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetMyPreflightWorkflows
                    * @param getMyPreflightWorkflows6
                
                */
                public  void startgetMyPreflightWorkflows(

                 com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument getMyPreflightWorkflows6,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getMyPreflightWorkflows6,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getMyPreflightWorkflows")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMyPreflightWorkflows(
                                        (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMyPreflightWorkflows(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetMyPreflightWorkflows(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyPreflightWorkflows(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyPreflightWorkflows(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyPreflightWorkflows(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyPreflightWorkflows(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyPreflightWorkflows(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyPreflightWorkflows(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyPreflightWorkflows(f);
                                            }
									    } else {
										    callback.receiveErrorgetMyPreflightWorkflows(f);
									    }
									} else {
									    callback.receiveErrorgetMyPreflightWorkflows(f);
									}
								} else {
								    callback.receiveErrorgetMyPreflightWorkflows(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetMyPreflightWorkflows(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getWorkflowServerGroupByName
                     * @param getWorkflowServerGroupByName8
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument getWorkflowServerGroupByName(

                            com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameDocument getWorkflowServerGroupByName8)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWorkflowServerGroupByName8,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getWorkflowServerGroupByName")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetWorkflowServerGroupByName
                    * @param getWorkflowServerGroupByName8
                
                */
                public  void startgetWorkflowServerGroupByName(

                 com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameDocument getWorkflowServerGroupByName8,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWorkflowServerGroupByName8,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getWorkflowServerGroupByName")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetWorkflowServerGroupByName(
                                        (com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetWorkflowServerGroupByName(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetWorkflowServerGroupByName(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroupByName(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroupByName(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroupByName(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroupByName(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroupByName(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroupByName(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroupByName(f);
                                            }
									    } else {
										    callback.receiveErrorgetWorkflowServerGroupByName(f);
									    }
									} else {
									    callback.receiveErrorgetWorkflowServerGroupByName(f);
									}
								} else {
								    callback.receiveErrorgetWorkflowServerGroupByName(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetWorkflowServerGroupByName(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getWorkflowServerGroups
                     * @param getWorkflowServerGroups10
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument getWorkflowServerGroups(

                            com.urbancode.anthill3.integration.GetWorkflowServerGroupsDocument getWorkflowServerGroups10)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWorkflowServerGroups10,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getWorkflowServerGroups")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetWorkflowServerGroups
                    * @param getWorkflowServerGroups10
                
                */
                public  void startgetWorkflowServerGroups(

                 com.urbancode.anthill3.integration.GetWorkflowServerGroupsDocument getWorkflowServerGroups10,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWorkflowServerGroups10,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getWorkflowServerGroups")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetWorkflowServerGroups(
                                        (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetWorkflowServerGroups(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetWorkflowServerGroups(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroups(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroups(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroups(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroups(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroups(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroups(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowServerGroups(f);
                                            }
									    } else {
										    callback.receiveErrorgetWorkflowServerGroups(f);
									    }
									} else {
									    callback.receiveErrorgetWorkflowServerGroups(f);
									}
								} else {
								    callback.receiveErrorgetWorkflowServerGroups(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetWorkflowServerGroups(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#runWorkflowWithPropertiesByName
                     * @param runWorkflowWithPropertiesByName12
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument runWorkflowWithPropertiesByName(

                            com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameDocument runWorkflowWithPropertiesByName12)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    runWorkflowWithPropertiesByName12,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "runWorkflowWithPropertiesByName")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startrunWorkflowWithPropertiesByName
                    * @param runWorkflowWithPropertiesByName12
                
                */
                public  void startrunWorkflowWithPropertiesByName(

                 com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameDocument runWorkflowWithPropertiesByName12,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    runWorkflowWithPropertiesByName12,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "runWorkflowWithPropertiesByName")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultrunWorkflowWithPropertiesByName(
                                        (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorrunWorkflowWithPropertiesByName(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorrunWorkflowWithPropertiesByName(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithPropertiesByName(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithPropertiesByName(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithPropertiesByName(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithPropertiesByName(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithPropertiesByName(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithPropertiesByName(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithPropertiesByName(f);
                                            }
									    } else {
										    callback.receiveErrorrunWorkflowWithPropertiesByName(f);
									    }
									} else {
									    callback.receiveErrorrunWorkflowWithPropertiesByName(f);
									}
								} else {
								    callback.receiveErrorrunWorkflowWithPropertiesByName(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorrunWorkflowWithPropertiesByName(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getProjectProperties
                     * @param getProjectProperties14
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument getProjectProperties(

                            com.urbancode.anthill3.integration.GetProjectPropertiesDocument getProjectProperties14)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectProperties14,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getProjectProperties")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetProjectProperties
                    * @param getProjectProperties14
                
                */
                public  void startgetProjectProperties(

                 com.urbancode.anthill3.integration.GetProjectPropertiesDocument getProjectProperties14,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectProperties14,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getProjectProperties")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectProperties(
                                        (com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectProperties(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetProjectProperties(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectProperties(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectProperties(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectProperties(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectProperties(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectProperties(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectProperties(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectProperties(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectProperties(f);
									    }
									} else {
									    callback.receiveErrorgetProjectProperties(f);
									}
								} else {
								    callback.receiveErrorgetProjectProperties(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetProjectProperties(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getWorkflowProperties
                     * @param getWorkflowProperties16
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument getWorkflowProperties(

                            com.urbancode.anthill3.integration.GetWorkflowPropertiesDocument getWorkflowProperties16)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWorkflowProperties16,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getWorkflowProperties")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetWorkflowProperties
                    * @param getWorkflowProperties16
                
                */
                public  void startgetWorkflowProperties(

                 com.urbancode.anthill3.integration.GetWorkflowPropertiesDocument getWorkflowProperties16,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWorkflowProperties16,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getWorkflowProperties")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetWorkflowProperties(
                                        (com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetWorkflowProperties(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetWorkflowProperties(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowProperties(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowProperties(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowProperties(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowProperties(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowProperties(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowProperties(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflowProperties(f);
                                            }
									    } else {
										    callback.receiveErrorgetWorkflowProperties(f);
									    }
									} else {
									    callback.receiveErrorgetWorkflowProperties(f);
									}
								} else {
								    callback.receiveErrorgetWorkflowProperties(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetWorkflowProperties(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[8].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getBuildRequest
                     * @param getBuildRequest18
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetBuildRequestResponseDocument getBuildRequest(

                            com.urbancode.anthill3.integration.GetBuildRequestDocument getBuildRequest18)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getBuildRequest18,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getBuildRequest")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetBuildRequestResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetBuildRequest
                    * @param getBuildRequest18
                
                */
                public  void startgetBuildRequest(

                 com.urbancode.anthill3.integration.GetBuildRequestDocument getBuildRequest18,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getBuildRequest18,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getBuildRequest")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetBuildRequest(
                                        (com.urbancode.anthill3.integration.GetBuildRequestResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetBuildRequest(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetBuildRequest(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildRequest(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildRequest(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildRequest(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildRequest(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildRequest(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildRequest(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetBuildRequest(f);
                                            }
									    } else {
										    callback.receiveErrorgetBuildRequest(f);
									    }
									} else {
									    callback.receiveErrorgetBuildRequest(f);
									}
								} else {
								    callback.receiveErrorgetBuildRequest(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetBuildRequest(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[9].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[9].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#buildProjectWithProperties
                     * @param buildProjectWithProperties20
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument buildProjectWithProperties(

                            com.urbancode.anthill3.integration.BuildProjectWithPropertiesDocument buildProjectWithProperties20)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buildProjectWithProperties20,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "buildProjectWithProperties")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startbuildProjectWithProperties
                    * @param buildProjectWithProperties20
                
                */
                public  void startbuildProjectWithProperties(

                 com.urbancode.anthill3.integration.BuildProjectWithPropertiesDocument buildProjectWithProperties20,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buildProjectWithProperties20,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "buildProjectWithProperties")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultbuildProjectWithProperties(
                                        (com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorbuildProjectWithProperties(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorbuildProjectWithProperties(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithProperties(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithProperties(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithProperties(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithProperties(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithProperties(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithProperties(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithProperties(f);
                                            }
									    } else {
										    callback.receiveErrorbuildProjectWithProperties(f);
									    }
									} else {
									    callback.receiveErrorbuildProjectWithProperties(f);
									}
								} else {
								    callback.receiveErrorbuildProjectWithProperties(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorbuildProjectWithProperties(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[10].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[10].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#buildProject
                     * @param buildProject22
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.BuildProjectResponseDocument buildProject(

                            com.urbancode.anthill3.integration.BuildProjectDocument buildProject22)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buildProject22,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "buildProject")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.BuildProjectResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.BuildProjectResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startbuildProject
                    * @param buildProject22
                
                */
                public  void startbuildProject(

                 com.urbancode.anthill3.integration.BuildProjectDocument buildProject22,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buildProject22,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "buildProject")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.BuildProjectResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultbuildProject(
                                        (com.urbancode.anthill3.integration.BuildProjectResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorbuildProject(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorbuildProject(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProject(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProject(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProject(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProject(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProject(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProject(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProject(f);
                                            }
									    } else {
										    callback.receiveErrorbuildProject(f);
									    }
									} else {
									    callback.receiveErrorbuildProject(f);
									}
								} else {
								    callback.receiveErrorbuildProject(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorbuildProject(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[11].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[11].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#runWorkflow
                     * @param runWorkflow24
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.RunWorkflowResponseDocument runWorkflow(

                            com.urbancode.anthill3.integration.RunWorkflowDocument runWorkflow24)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    runWorkflow24,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "runWorkflow")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.RunWorkflowResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.RunWorkflowResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startrunWorkflow
                    * @param runWorkflow24
                
                */
                public  void startrunWorkflow(

                 com.urbancode.anthill3.integration.RunWorkflowDocument runWorkflow24,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    runWorkflow24,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "runWorkflow")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.RunWorkflowResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultrunWorkflow(
                                        (com.urbancode.anthill3.integration.RunWorkflowResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorrunWorkflow(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorrunWorkflow(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflow(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflow(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflow(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflow(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflow(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflow(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflow(f);
                                            }
									    } else {
										    callback.receiveErrorrunWorkflow(f);
									    }
									} else {
									    callback.receiveErrorrunWorkflow(f);
									}
								} else {
								    callback.receiveErrorrunWorkflow(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorrunWorkflow(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[12].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[12].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getProject
                     * @param getProject26
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetProjectResponseDocument getProject(

                            com.urbancode.anthill3.integration.GetProjectDocument getProject26)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProject26,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getProject")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetProjectResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetProjectResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetProject
                    * @param getProject26
                
                */
                public  void startgetProject(

                 com.urbancode.anthill3.integration.GetProjectDocument getProject26,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProject26,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getProject")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetProjectResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProject(
                                        (com.urbancode.anthill3.integration.GetProjectResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProject(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetProject(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProject(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProject(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProject(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProject(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProject(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProject(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProject(f);
                                            }
									    } else {
										    callback.receiveErrorgetProject(f);
									    }
									} else {
									    callback.receiveErrorgetProject(f);
									}
								} else {
								    callback.receiveErrorgetProject(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetProject(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[13].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[13].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#buildProjectWithPropertiesByName
                     * @param buildProjectWithPropertiesByName28
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument buildProjectWithPropertiesByName(

                            com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument buildProjectWithPropertiesByName28)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buildProjectWithPropertiesByName28,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "buildProjectWithPropertiesByName")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startbuildProjectWithPropertiesByName
                    * @param buildProjectWithPropertiesByName28
                
                */
                public  void startbuildProjectWithPropertiesByName(

                 com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument buildProjectWithPropertiesByName28,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buildProjectWithPropertiesByName28,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "buildProjectWithPropertiesByName")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultbuildProjectWithPropertiesByName(
                                        (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorbuildProjectWithPropertiesByName(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorbuildProjectWithPropertiesByName(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithPropertiesByName(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithPropertiesByName(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithPropertiesByName(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithPropertiesByName(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithPropertiesByName(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithPropertiesByName(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectWithPropertiesByName(f);
                                            }
									    } else {
										    callback.receiveErrorbuildProjectWithPropertiesByName(f);
									    }
									} else {
									    callback.receiveErrorbuildProjectWithPropertiesByName(f);
									}
								} else {
								    callback.receiveErrorbuildProjectWithPropertiesByName(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorbuildProjectWithPropertiesByName(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[14].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[14].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getMyProjects
                     * @param getMyProjects30
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetMyProjectsResponseDocument getMyProjects(

                            com.urbancode.anthill3.integration.GetMyProjectsDocument getMyProjects30)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getMyProjects30,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getMyProjects")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetMyProjectsResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetMyProjects
                    * @param getMyProjects30
                
                */
                public  void startgetMyProjects(

                 com.urbancode.anthill3.integration.GetMyProjectsDocument getMyProjects30,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getMyProjects30,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getMyProjects")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetMyProjects(
                                        (com.urbancode.anthill3.integration.GetMyProjectsResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetMyProjects(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetMyProjects(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyProjects(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyProjects(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyProjects(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyProjects(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyProjects(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyProjects(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetMyProjects(f);
                                            }
									    } else {
										    callback.receiveErrorgetMyProjects(f);
									    }
									} else {
									    callback.receiveErrorgetMyProjects(f);
									}
								} else {
								    callback.receiveErrorgetMyProjects(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetMyProjects(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[15].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[15].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#runWorkflowByName
                     * @param runWorkflowByName32
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument runWorkflowByName(

                            com.urbancode.anthill3.integration.RunWorkflowByNameDocument runWorkflowByName32)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    runWorkflowByName32,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "runWorkflowByName")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startrunWorkflowByName
                    * @param runWorkflowByName32
                
                */
                public  void startrunWorkflowByName(

                 com.urbancode.anthill3.integration.RunWorkflowByNameDocument runWorkflowByName32,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    runWorkflowByName32,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "runWorkflowByName")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultrunWorkflowByName(
                                        (com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorrunWorkflowByName(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorrunWorkflowByName(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowByName(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowByName(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowByName(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowByName(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowByName(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowByName(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowByName(f);
                                            }
									    } else {
										    callback.receiveErrorrunWorkflowByName(f);
									    }
									} else {
									    callback.receiveErrorrunWorkflowByName(f);
									}
								} else {
								    callback.receiveErrorrunWorkflowByName(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorrunWorkflowByName(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[16].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[16].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getRecentActivityForWorkflow
                     * @param getRecentActivityForWorkflow34
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument getRecentActivityForWorkflow(

                            com.urbancode.anthill3.integration.GetRecentActivityForWorkflowDocument getRecentActivityForWorkflow34)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRecentActivityForWorkflow34,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getRecentActivityForWorkflow")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetRecentActivityForWorkflow
                    * @param getRecentActivityForWorkflow34
                
                */
                public  void startgetRecentActivityForWorkflow(

                 com.urbancode.anthill3.integration.GetRecentActivityForWorkflowDocument getRecentActivityForWorkflow34,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRecentActivityForWorkflow34,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getRecentActivityForWorkflow")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetRecentActivityForWorkflow(
                                        (com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetRecentActivityForWorkflow(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetRecentActivityForWorkflow(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForWorkflow(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForWorkflow(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForWorkflow(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForWorkflow(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForWorkflow(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForWorkflow(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForWorkflow(f);
                                            }
									    } else {
										    callback.receiveErrorgetRecentActivityForWorkflow(f);
									    }
									} else {
									    callback.receiveErrorgetRecentActivityForWorkflow(f);
									}
								} else {
								    callback.receiveErrorgetRecentActivityForWorkflow(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetRecentActivityForWorkflow(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[17].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[17].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getRecentActivityForProject
                     * @param getRecentActivityForProject36
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument getRecentActivityForProject(

                            com.urbancode.anthill3.integration.GetRecentActivityForProjectDocument getRecentActivityForProject36)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRecentActivityForProject36,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getRecentActivityForProject")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetRecentActivityForProject
                    * @param getRecentActivityForProject36
                
                */
                public  void startgetRecentActivityForProject(

                 com.urbancode.anthill3.integration.GetRecentActivityForProjectDocument getRecentActivityForProject36,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRecentActivityForProject36,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getRecentActivityForProject")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetRecentActivityForProject(
                                        (com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetRecentActivityForProject(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetRecentActivityForProject(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForProject(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForProject(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForProject(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForProject(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForProject(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForProject(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetRecentActivityForProject(f);
                                            }
									    } else {
										    callback.receiveErrorgetRecentActivityForProject(f);
									    }
									} else {
									    callback.receiveErrorgetRecentActivityForProject(f);
									}
								} else {
								    callback.receiveErrorgetRecentActivityForProject(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetRecentActivityForProject(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[18].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[18].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getArtifactsLocationsForBuildLifeId
                     * @param getArtifactsLocationsForBuildLifeId38
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument getArtifactsLocationsForBuildLifeId(

                            com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdDocument getArtifactsLocationsForBuildLifeId38)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getArtifactsLocationsForBuildLifeId38,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getArtifactsLocationsForBuildLifeId")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetArtifactsLocationsForBuildLifeId
                    * @param getArtifactsLocationsForBuildLifeId38
                
                */
                public  void startgetArtifactsLocationsForBuildLifeId(

                 com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdDocument getArtifactsLocationsForBuildLifeId38,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getArtifactsLocationsForBuildLifeId38,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getArtifactsLocationsForBuildLifeId")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetArtifactsLocationsForBuildLifeId(
                                        (com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetArtifactsLocationsForBuildLifeId(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetArtifactsLocationsForBuildLifeId(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactsLocationsForBuildLifeId(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactsLocationsForBuildLifeId(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactsLocationsForBuildLifeId(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactsLocationsForBuildLifeId(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactsLocationsForBuildLifeId(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactsLocationsForBuildLifeId(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactsLocationsForBuildLifeId(f);
                                            }
									    } else {
										    callback.receiveErrorgetArtifactsLocationsForBuildLifeId(f);
									    }
									} else {
									    callback.receiveErrorgetArtifactsLocationsForBuildLifeId(f);
									}
								} else {
								    callback.receiveErrorgetArtifactsLocationsForBuildLifeId(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetArtifactsLocationsForBuildLifeId(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[19].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[19].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getProjectWorkflowByName
                     * @param getProjectWorkflowByName40
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument getProjectWorkflowByName(

                            com.urbancode.anthill3.integration.GetProjectWorkflowByNameDocument getProjectWorkflowByName40)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectWorkflowByName40,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getProjectWorkflowByName")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetProjectWorkflowByName
                    * @param getProjectWorkflowByName40
                
                */
                public  void startgetProjectWorkflowByName(

                 com.urbancode.anthill3.integration.GetProjectWorkflowByNameDocument getProjectWorkflowByName40,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectWorkflowByName40,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getProjectWorkflowByName")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectWorkflowByName(
                                        (com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectWorkflowByName(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetProjectWorkflowByName(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflowByName(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflowByName(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflowByName(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflowByName(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflowByName(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflowByName(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflowByName(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectWorkflowByName(f);
									    }
									} else {
									    callback.receiveErrorgetProjectWorkflowByName(f);
									}
								} else {
								    callback.receiveErrorgetProjectWorkflowByName(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetProjectWorkflowByName(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[20].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[20].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#buildProjectByName
                     * @param buildProjectByName42
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument buildProjectByName(

                            com.urbancode.anthill3.integration.BuildProjectByNameDocument buildProjectByName42)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buildProjectByName42,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "buildProjectByName")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startbuildProjectByName
                    * @param buildProjectByName42
                
                */
                public  void startbuildProjectByName(

                 com.urbancode.anthill3.integration.BuildProjectByNameDocument buildProjectByName42,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    buildProjectByName42,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "buildProjectByName")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultbuildProjectByName(
                                        (com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorbuildProjectByName(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorbuildProjectByName(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectByName(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectByName(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectByName(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectByName(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectByName(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectByName(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorbuildProjectByName(f);
                                            }
									    } else {
										    callback.receiveErrorbuildProjectByName(f);
									    }
									} else {
									    callback.receiveErrorbuildProjectByName(f);
									}
								} else {
								    callback.receiveErrorbuildProjectByName(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorbuildProjectByName(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[21].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[21].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getWorkflow
                     * @param getWorkflow44
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetWorkflowResponseDocument getWorkflow(

                            com.urbancode.anthill3.integration.GetWorkflowDocument getWorkflow44)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWorkflow44,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getWorkflow")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetWorkflowResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetWorkflowResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetWorkflow
                    * @param getWorkflow44
                
                */
                public  void startgetWorkflow(

                 com.urbancode.anthill3.integration.GetWorkflowDocument getWorkflow44,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getWorkflow44,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getWorkflow")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetWorkflowResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetWorkflow(
                                        (com.urbancode.anthill3.integration.GetWorkflowResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetWorkflow(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetWorkflow(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflow(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflow(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflow(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflow(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflow(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflow(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetWorkflow(f);
                                            }
									    } else {
										    callback.receiveErrorgetWorkflow(f);
									    }
									} else {
									    callback.receiveErrorgetWorkflow(f);
									}
								} else {
								    callback.receiveErrorgetWorkflow(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetWorkflow(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[22].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[22].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#runWorkflowWithProperties
                     * @param runWorkflowWithProperties46
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument runWorkflowWithProperties(

                            com.urbancode.anthill3.integration.RunWorkflowWithPropertiesDocument runWorkflowWithProperties46)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    runWorkflowWithProperties46,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "runWorkflowWithProperties")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startrunWorkflowWithProperties
                    * @param runWorkflowWithProperties46
                
                */
                public  void startrunWorkflowWithProperties(

                 com.urbancode.anthill3.integration.RunWorkflowWithPropertiesDocument runWorkflowWithProperties46,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    runWorkflowWithProperties46,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "runWorkflowWithProperties")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultrunWorkflowWithProperties(
                                        (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorrunWorkflowWithProperties(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorrunWorkflowWithProperties(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithProperties(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithProperties(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithProperties(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithProperties(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithProperties(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithProperties(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorrunWorkflowWithProperties(f);
                                            }
									    } else {
										    callback.receiveErrorrunWorkflowWithProperties(f);
									    }
									} else {
									    callback.receiveErrorrunWorkflowWithProperties(f);
									}
								} else {
								    callback.receiveErrorrunWorkflowWithProperties(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorrunWorkflowWithProperties(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[23].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[23].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getArtifactSetsForWorkflowId
                     * @param getArtifactSetsForWorkflowId48
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument getArtifactSetsForWorkflowId(

                            com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdDocument getArtifactSetsForWorkflowId48)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getArtifactSetsForWorkflowId48,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getArtifactSetsForWorkflowId")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetArtifactSetsForWorkflowId
                    * @param getArtifactSetsForWorkflowId48
                
                */
                public  void startgetArtifactSetsForWorkflowId(

                 com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdDocument getArtifactSetsForWorkflowId48,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getArtifactSetsForWorkflowId48,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getArtifactSetsForWorkflowId")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetArtifactSetsForWorkflowId(
                                        (com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetArtifactSetsForWorkflowId(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetArtifactSetsForWorkflowId(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactSetsForWorkflowId(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactSetsForWorkflowId(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactSetsForWorkflowId(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactSetsForWorkflowId(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactSetsForWorkflowId(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactSetsForWorkflowId(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetArtifactSetsForWorkflowId(f);
                                            }
									    } else {
										    callback.receiveErrorgetArtifactSetsForWorkflowId(f);
									    }
									} else {
									    callback.receiveErrorgetArtifactSetsForWorkflowId(f);
									}
								} else {
								    callback.receiveErrorgetArtifactSetsForWorkflowId(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetArtifactSetsForWorkflowId(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[24].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[24].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getProjectByName
                     * @param getProjectByName50
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetProjectByNameResponseDocument getProjectByName(

                            com.urbancode.anthill3.integration.GetProjectByNameDocument getProjectByName50)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectByName50,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getProjectByName")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetProjectByNameResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetProjectByName
                    * @param getProjectByName50
                
                */
                public  void startgetProjectByName(

                 com.urbancode.anthill3.integration.GetProjectByNameDocument getProjectByName50,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectByName50,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getProjectByName")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectByName(
                                        (com.urbancode.anthill3.integration.GetProjectByNameResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectByName(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetProjectByName(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectByName(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectByName(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectByName(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectByName(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectByName(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectByName(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectByName(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectByName(f);
									    }
									} else {
									    callback.receiveErrorgetProjectByName(f);
									}
								} else {
								    callback.receiveErrorgetProjectByName(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetProjectByName(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[25].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[25].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see com.urbancode.anthill3.integration.DashboardService#getProjectWorkflows
                     * @param getProjectWorkflows52
                    
                     */

                    

                            public  com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument getProjectWorkflows(

                            com.urbancode.anthill3.integration.GetProjectWorkflowsDocument getProjectWorkflows52)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
              _operationClient.getOptions().setAction("\"\"");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectWorkflows52,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getProjectWorkflows")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see com.urbancode.anthill3.integration.DashboardService#startgetProjectWorkflows
                    * @param getProjectWorkflows52
                
                */
                public  void startgetProjectWorkflows(

                 com.urbancode.anthill3.integration.GetProjectWorkflowsDocument getProjectWorkflows52,

                  final com.urbancode.anthill3.integration.DashboardServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
             _operationClient.getOptions().setAction("\"\"");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getProjectWorkflows52,
                                                    optimizeContent(new javax.xml.namespace.QName("integration.anthill3.urbancode.com",
                                                    "getProjectWorkflows")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetProjectWorkflows(
                                        (com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetProjectWorkflows(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorgetProjectWorkflows(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflows(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflows(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflows(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflows(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflows(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflows(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetProjectWorkflows(f);
                                            }
									    } else {
										    callback.receiveErrorgetProjectWorkflows(f);
									    }
									} else {
									    callback.receiveErrorgetProjectWorkflows(f);
									}
								} else {
								    callback.receiveErrorgetProjectWorkflows(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetProjectWorkflows(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[26].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[26].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://10.88.11.73:8443/services/Dashboard

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetRecentWorkflowActivityDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetRecentWorkflowActivityDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetBuildSummaryLinkDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetBuildSummaryLinkDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetWorkflowServerGroupsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetWorkflowServerGroupsDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetProjectPropertiesDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetProjectPropertiesDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetWorkflowPropertiesDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetWorkflowPropertiesDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetBuildRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetBuildRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetBuildRequestResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetBuildRequestResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.BuildProjectWithPropertiesDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.BuildProjectWithPropertiesDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.BuildProjectDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.BuildProjectDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.BuildProjectResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.BuildProjectResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.RunWorkflowDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.RunWorkflowDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.RunWorkflowResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.RunWorkflowResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetProjectDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetProjectDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetProjectResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetProjectResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetMyProjectsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetMyProjectsDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetMyProjectsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetMyProjectsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.RunWorkflowByNameDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.RunWorkflowByNameDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetRecentActivityForWorkflowDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetRecentActivityForWorkflowDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetRecentActivityForProjectDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetRecentActivityForProjectDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetProjectWorkflowByNameDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetProjectWorkflowByNameDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.BuildProjectByNameDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.BuildProjectByNameDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetWorkflowDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetWorkflowDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetWorkflowResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetWorkflowResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.RunWorkflowWithPropertiesDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.RunWorkflowWithPropertiesDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetProjectByNameDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetProjectByNameDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetProjectByNameResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetProjectByNameResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetProjectWorkflowsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetProjectWorkflowsDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetRecentWorkflowActivityDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetBuildSummaryLinkDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetWorkflowServerGroupsDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetProjectPropertiesDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetWorkflowPropertiesDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetBuildRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.BuildProjectWithPropertiesDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.BuildProjectDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.RunWorkflowDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetProjectDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetMyProjectsDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.RunWorkflowByNameDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetRecentActivityForWorkflowDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetRecentActivityForProjectDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetProjectWorkflowByNameDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.BuildProjectByNameDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetWorkflowDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.RunWorkflowWithPropertiesDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetProjectByNameDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.urbancode.anthill3.integration.GetProjectWorkflowsDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }

        public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{
        try{
        

            if (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetRecentWorkflowActivityDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetRecentWorkflowActivityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetRecentWorkflowActivityDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetBuildSummaryLinkDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetBuildSummaryLinkDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetBuildSummaryLinkDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetWorkflowServerGroupsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetWorkflowServerGroupsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetWorkflowServerGroupsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetProjectPropertiesDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetProjectPropertiesDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetProjectPropertiesDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetWorkflowPropertiesDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetWorkflowPropertiesDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetWorkflowPropertiesDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetBuildRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetBuildRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetBuildRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetBuildRequestResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.BuildProjectWithPropertiesDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.BuildProjectWithPropertiesDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.BuildProjectWithPropertiesDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.BuildProjectDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.BuildProjectDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.BuildProjectDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.BuildProjectResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.BuildProjectResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.BuildProjectResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.RunWorkflowDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.RunWorkflowDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.RunWorkflowDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.RunWorkflowResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.RunWorkflowResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.RunWorkflowResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetProjectDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetProjectDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetProjectDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetProjectResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetProjectResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetProjectResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetMyProjectsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetMyProjectsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetMyProjectsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetMyProjectsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.RunWorkflowByNameDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.RunWorkflowByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.RunWorkflowByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetRecentActivityForWorkflowDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetRecentActivityForWorkflowDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetRecentActivityForWorkflowDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetRecentActivityForProjectDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetRecentActivityForProjectDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetRecentActivityForProjectDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetProjectWorkflowByNameDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetProjectWorkflowByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetProjectWorkflowByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.BuildProjectByNameDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.BuildProjectByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.BuildProjectByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetWorkflowDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetWorkflowDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetWorkflowDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetWorkflowResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetWorkflowResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetWorkflowResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.RunWorkflowWithPropertiesDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.RunWorkflowWithPropertiesDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetProjectByNameDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetProjectByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetProjectByNameDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetProjectByNameResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetProjectWorkflowsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetProjectWorkflowsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetProjectWorkflowsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        
        }catch(java.lang.Exception e){
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
        }

        
        
   }
   