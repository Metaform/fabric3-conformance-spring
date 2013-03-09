/*
 * Copyright(C) OASIS(R) 2009,2011. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 */
package client_springci;

import client.TestConfiguration;

/**
 * [SPR30005] Tests that where there are no explicit <sca:service/> elements in the
 * application context, if a bean class implements two or more java interfaces which
 * are annotated with @Remotable, this is not allowed and the SCA runtime MUST raise
 * an error.
 */
public class SPR_30005_TestCase extends SpringTestRunner {

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
