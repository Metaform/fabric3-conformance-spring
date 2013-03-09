/*
 * Copyright(C) OASIS(R) 2009,2011. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 */
package client_springci;

import client.TestConfiguration;

/**
  * Tests that SCA extension elements within a Spring application context 
    conform to the SCA Spring Extension schema declared in sca-spring-extension.xsd.
 */
public class SPR_20006_TestCase extends SpringTestRunner {

    protected TestConfiguration getTestConfiguration() {
    	TestConfiguration config = new TestConfiguration();
    	config.testName 		 = getClass().getName().substring(16, getClass().getName().lastIndexOf('_'));
    	config.output[0] 		 = "exception";
    	config.composite 		 = "test.composite";
    	config.contributionNames = new String[] { config.testName, "SPR_General_Java" };
    	config.serviceName       = "TEST_COMPONENT/Service1";
    	return config;
    }
    
}
