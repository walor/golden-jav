
/**
 * DashboardServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4.1  Built on : Aug 13, 2008 (05:03:35 LKT)
 */

    package com.urbancode.anthill3.integration;

    /**
     *  DashboardServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class DashboardServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public DashboardServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public DashboardServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getLatestActivityForWorkflows method
            * override this method for handling normal response from getLatestActivityForWorkflows operation
            */
           public void receiveResultgetLatestActivityForWorkflows(
                    com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getLatestActivityForWorkflows operation
           */
            public void receiveErrorgetLatestActivityForWorkflows(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRecentWorkflowActivity method
            * override this method for handling normal response from getRecentWorkflowActivity operation
            */
           public void receiveResultgetRecentWorkflowActivity(
                    com.urbancode.anthill3.integration.GetRecentWorkflowActivityResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRecentWorkflowActivity operation
           */
            public void receiveErrorgetRecentWorkflowActivity(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBuildSummaryLink method
            * override this method for handling normal response from getBuildSummaryLink operation
            */
           public void receiveResultgetBuildSummaryLink(
                    com.urbancode.anthill3.integration.GetBuildSummaryLinkResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBuildSummaryLink operation
           */
            public void receiveErrorgetBuildSummaryLink(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMyPreflightWorkflows method
            * override this method for handling normal response from getMyPreflightWorkflows operation
            */
           public void receiveResultgetMyPreflightWorkflows(
                    com.urbancode.anthill3.integration.GetMyPreflightWorkflowsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMyPreflightWorkflows operation
           */
            public void receiveErrorgetMyPreflightWorkflows(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWorkflowServerGroupByName method
            * override this method for handling normal response from getWorkflowServerGroupByName operation
            */
           public void receiveResultgetWorkflowServerGroupByName(
                    com.urbancode.anthill3.integration.GetWorkflowServerGroupByNameResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWorkflowServerGroupByName operation
           */
            public void receiveErrorgetWorkflowServerGroupByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWorkflowServerGroups method
            * override this method for handling normal response from getWorkflowServerGroups operation
            */
           public void receiveResultgetWorkflowServerGroups(
                    com.urbancode.anthill3.integration.GetWorkflowServerGroupsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWorkflowServerGroups operation
           */
            public void receiveErrorgetWorkflowServerGroups(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for runWorkflowWithPropertiesByName method
            * override this method for handling normal response from runWorkflowWithPropertiesByName operation
            */
           public void receiveResultrunWorkflowWithPropertiesByName(
                    com.urbancode.anthill3.integration.RunWorkflowWithPropertiesByNameResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from runWorkflowWithPropertiesByName operation
           */
            public void receiveErrorrunWorkflowWithPropertiesByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectProperties method
            * override this method for handling normal response from getProjectProperties operation
            */
           public void receiveResultgetProjectProperties(
                    com.urbancode.anthill3.integration.GetProjectPropertiesResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectProperties operation
           */
            public void receiveErrorgetProjectProperties(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWorkflowProperties method
            * override this method for handling normal response from getWorkflowProperties operation
            */
           public void receiveResultgetWorkflowProperties(
                    com.urbancode.anthill3.integration.GetWorkflowPropertiesResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWorkflowProperties operation
           */
            public void receiveErrorgetWorkflowProperties(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBuildRequest method
            * override this method for handling normal response from getBuildRequest operation
            */
           public void receiveResultgetBuildRequest(
                    com.urbancode.anthill3.integration.GetBuildRequestResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBuildRequest operation
           */
            public void receiveErrorgetBuildRequest(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buildProjectWithProperties method
            * override this method for handling normal response from buildProjectWithProperties operation
            */
           public void receiveResultbuildProjectWithProperties(
                    com.urbancode.anthill3.integration.BuildProjectWithPropertiesResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buildProjectWithProperties operation
           */
            public void receiveErrorbuildProjectWithProperties(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buildProject method
            * override this method for handling normal response from buildProject operation
            */
           public void receiveResultbuildProject(
                    com.urbancode.anthill3.integration.BuildProjectResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buildProject operation
           */
            public void receiveErrorbuildProject(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for runWorkflow method
            * override this method for handling normal response from runWorkflow operation
            */
           public void receiveResultrunWorkflow(
                    com.urbancode.anthill3.integration.RunWorkflowResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from runWorkflow operation
           */
            public void receiveErrorrunWorkflow(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProject method
            * override this method for handling normal response from getProject operation
            */
           public void receiveResultgetProject(
                    com.urbancode.anthill3.integration.GetProjectResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProject operation
           */
            public void receiveErrorgetProject(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buildProjectWithPropertiesByName method
            * override this method for handling normal response from buildProjectWithPropertiesByName operation
            */
           public void receiveResultbuildProjectWithPropertiesByName(
                    com.urbancode.anthill3.integration.BuildProjectWithPropertiesByNameResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buildProjectWithPropertiesByName operation
           */
            public void receiveErrorbuildProjectWithPropertiesByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMyProjects method
            * override this method for handling normal response from getMyProjects operation
            */
           public void receiveResultgetMyProjects(
                    com.urbancode.anthill3.integration.GetMyProjectsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMyProjects operation
           */
            public void receiveErrorgetMyProjects(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for runWorkflowByName method
            * override this method for handling normal response from runWorkflowByName operation
            */
           public void receiveResultrunWorkflowByName(
                    com.urbancode.anthill3.integration.RunWorkflowByNameResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from runWorkflowByName operation
           */
            public void receiveErrorrunWorkflowByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRecentActivityForWorkflow method
            * override this method for handling normal response from getRecentActivityForWorkflow operation
            */
           public void receiveResultgetRecentActivityForWorkflow(
                    com.urbancode.anthill3.integration.GetRecentActivityForWorkflowResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRecentActivityForWorkflow operation
           */
            public void receiveErrorgetRecentActivityForWorkflow(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getRecentActivityForProject method
            * override this method for handling normal response from getRecentActivityForProject operation
            */
           public void receiveResultgetRecentActivityForProject(
                    com.urbancode.anthill3.integration.GetRecentActivityForProjectResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getRecentActivityForProject operation
           */
            public void receiveErrorgetRecentActivityForProject(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getArtifactsLocationsForBuildLifeId method
            * override this method for handling normal response from getArtifactsLocationsForBuildLifeId operation
            */
           public void receiveResultgetArtifactsLocationsForBuildLifeId(
                    com.urbancode.anthill3.integration.GetArtifactsLocationsForBuildLifeIdResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getArtifactsLocationsForBuildLifeId operation
           */
            public void receiveErrorgetArtifactsLocationsForBuildLifeId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectWorkflowByName method
            * override this method for handling normal response from getProjectWorkflowByName operation
            */
           public void receiveResultgetProjectWorkflowByName(
                    com.urbancode.anthill3.integration.GetProjectWorkflowByNameResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectWorkflowByName operation
           */
            public void receiveErrorgetProjectWorkflowByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for buildProjectByName method
            * override this method for handling normal response from buildProjectByName operation
            */
           public void receiveResultbuildProjectByName(
                    com.urbancode.anthill3.integration.BuildProjectByNameResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buildProjectByName operation
           */
            public void receiveErrorbuildProjectByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getWorkflow method
            * override this method for handling normal response from getWorkflow operation
            */
           public void receiveResultgetWorkflow(
                    com.urbancode.anthill3.integration.GetWorkflowResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getWorkflow operation
           */
            public void receiveErrorgetWorkflow(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for runWorkflowWithProperties method
            * override this method for handling normal response from runWorkflowWithProperties operation
            */
           public void receiveResultrunWorkflowWithProperties(
                    com.urbancode.anthill3.integration.RunWorkflowWithPropertiesResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from runWorkflowWithProperties operation
           */
            public void receiveErrorrunWorkflowWithProperties(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getArtifactSetsForWorkflowId method
            * override this method for handling normal response from getArtifactSetsForWorkflowId operation
            */
           public void receiveResultgetArtifactSetsForWorkflowId(
                    com.urbancode.anthill3.integration.GetArtifactSetsForWorkflowIdResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getArtifactSetsForWorkflowId operation
           */
            public void receiveErrorgetArtifactSetsForWorkflowId(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectByName method
            * override this method for handling normal response from getProjectByName operation
            */
           public void receiveResultgetProjectByName(
                    com.urbancode.anthill3.integration.GetProjectByNameResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectByName operation
           */
            public void receiveErrorgetProjectByName(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProjectWorkflows method
            * override this method for handling normal response from getProjectWorkflows operation
            */
           public void receiveResultgetProjectWorkflows(
                    com.urbancode.anthill3.integration.GetProjectWorkflowsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProjectWorkflows operation
           */
            public void receiveErrorgetProjectWorkflows(java.lang.Exception e) {
            }
                


    }
    