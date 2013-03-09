/*
 * Copyright(C) OASIS(R) 2009,2011. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 */
package client_springci;

import client.TestConfiguration;

/**
 * If the implementation.spring @location URI identifies a directory, then 
 * the file META-INF/MANIFEST.MF underneath that directory MUST be read 
 * from the directory. [SPR40004]
 */
public class SPR_40004_TestCase extends SpringTestRunner {

    protected TestConfiguration getTestConfiguration() {
    	TestConfiguration config = new TestConfiguration();
    	config.testName 		 = getClass().getName().substring(16, getClass().getName().lastIndexOf('_'));
    	config.output[0] 		 = "ServiceImpl1 SPR_40004";
    	config.composite 		 = "test.composite";
    	config.contributionNames = new String[] { config.testName, "SPR_General_Java" };
    	config.serviceName       = "TEST_COMPONENT/Service1Bean";
    	config.input = config.testName;
    	return config;
    }
    
}
