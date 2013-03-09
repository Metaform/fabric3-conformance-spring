/*
 * Copyright(C) OASIS(R) 2009,2011. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 */
package client_springci;

import client.TestConfiguration;

/**
 * The implementation.spring @location attribute URI value MUST point to one of the following:
 * a) a Spring application context file
 * b) a Java archive file (JAR)
 * c) a directory
 * [SPR40001]
 * 
 * This tests the case (a) 
 */
public class SPR_40001_1_TestCase extends SpringTestRunner {

    protected TestConfiguration getTestConfiguration() {
    	TestConfiguration config = new TestConfiguration();
    	config.testName 		 = getClass().getName().substring(16, getClass().getName().lastIndexOf('_'));
    	config.output[0] 		 = "ServiceImpl1 SPR_40001_1";
    	config.composite 		 = "test.composite";
    	config.contributionNames = new String[] { config.testName, "SPR_General_Java" };
    	config.serviceName       = "TEST_COMPONENT/Service1Bean";
    	config.input = config.testName;
    	return config;
    }
    
}
