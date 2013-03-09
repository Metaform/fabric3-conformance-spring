/*
 * Copyright(C) OASIS(R) 2009,2011. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 */
package client_springci;

import client.TestConfiguration;

/**
 * If the MANIFEST.MF file contains a header "Spring-Context" of the format:
 *    Spring-Context ::= path ( ';' path )*
 * where path is a relative path with respect to the @location URI, then each 
 * path specified in the header MUST identify a Spring application context
 * configuration file. [SPR40008]
 */
public class SPR_40008_TestCase extends SpringTestRunner {

    protected TestConfiguration getTestConfiguration() {
    	TestConfiguration config = new TestConfiguration();
    	config.testName 		 = getClass().getName().substring(16, getClass().getName().lastIndexOf('_'));
    	config.output[0] 		 = "ServiceImpl1 SPR_40008";
    	config.composite 		 = "test.composite";
    	config.contributionNames = new String[] { config.testName, "SPR_General_Java" };
    	config.serviceName       = "TEST_COMPONENT/Service1Bean1";
    	config.input = config.testName;
    	return config;
    }
    
}
