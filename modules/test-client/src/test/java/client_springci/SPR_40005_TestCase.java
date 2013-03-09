/*
 * Copyright(C) OASIS(R) 2009,2011. All Rights Reserved.
 * OASIS trademark, IPR and other policies apply.    
 */
package client_springci;

import client.TestConfiguration;

/**
 */
public class SPR_40005_TestCase extends SpringTestRunner {

	protected TestConfiguration getTestConfiguration() {
		TestConfiguration config = new TestConfiguration();
		config.testName = getClass().getName().substring(16, getClass().getName().lastIndexOf('_'));
		config.output[0] = "RefImpl1 SPR_40005";
		config.composite = "test.composite";
		config.contributionNames = new String[] { config.testName };
		config.serviceName = "TEST_COMPONENT/Ref1Bean";
		config.input = config.testName;
		return config;
	}

}
