package com.coderslab.test;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

public class SMSTest {

	private static final Logger logger = Logger.getLogger(SMSTest.class);
	
	Properties props;
	String endPoint;
	String username;
	String password;

	@Before
	public void setup() throws IOException {
		props = new Properties();
		props.load(SMSTest.class.getResourceAsStream("/onnorokom.properties"));
		endPoint = props.getProperty("onnorokom.endpoint");
		username = props.getProperty("onnorokom.username");
		password = props.getProperty("onnorokom.password");
	}

	// This method only to see header
	// @BeforeClass
	public static void beforeClass() throws Exception {
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
	}

	@Test
	public void test1() {
		logger.info("Endpoint: "+ endPoint +"\nUsername: "+ username +"\nPassword:" + password);
	}
}
