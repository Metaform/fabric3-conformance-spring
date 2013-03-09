/*
 * Copyright(C) OASIS(R) 2009,2011. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 */
package client_springci;

import client.TestConfiguration;

/**
 * If there is no MANIFEST.MF file or if there is no Spring-Context header within the 
 * MANIFEST.MF file, the Spring application context MUST be built using all the *.xml 
 * files in the META-INF/spring subdirectory within the JAR identified by the 
 * @location URI or underneath the directory specified by the @location URI. 
 * [SPR40006]
 * 
 * This test the case where there is a manifest which has no Spring-Context header
 */
public class SPR_40006_2_TestCase extends SpringTestRunner {

    protected TestConfiguration getTestConfiguration() {
    	TestConfiguration config = new TestConfiguration();
    	config.testName 		 = getClass().getName().substring(16, getClass().getName().lastIndexOf('_'));
    	config.output[0] 		 = "ServiceImpl1 SPR_40006_2";
    	config.composite 		 = "test.composite";
    	config.contributionNames = new String[] { config.testName, "SPR_General_Java" };
    	config.serviceName       = "TEST_COMPONENT/Service1Bean";
    	config.input = config.testName;
    	return config;
    }
    
}
