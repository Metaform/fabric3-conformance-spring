/*
 * Copyright(C) OASIS(R) 2009,2011. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 */
package client_springci;

import client.TestConfiguration;

/**
 * Tests that the @default attribute of a <reference/> subelement of a <beans/> element has 
 * the value of the @name attribute of one of the <bean/> subelements of the <beans/> element.
 * [SPR20004]
 * 
 * This tests the case where the @default attribute has an incorrect value
 */
public class SPR_20004_1_TestCase extends SpringTestRunner {

    protected TestConfiguration getTestConfiguration() {
    	TestConfiguration config = new TestConfiguration();
    	config.testName 		 = getClass().getName().substring(16, getClass().getName().lastIndexOf('_'));
    	config.output[0] 		 = "ServiceImpl1 RefImpl1 null";
    	config.composite 		 = "test.composite";
    	config.contributionNames = new String[] { config.testName, "SPR_General_Java" };
    	config.serviceName       = "TEST_COMPONENT/Service1";
    	return config;
    }
    
}
