package org.sanju.rest.extension.client;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/**
 *
 * @author Sanju Thomas
 *
 */
public class TestExtensionClient {

	private ExtensionClient extensionClient;

	@Before
	public void setup(){
		this.extensionClient = new ExtensionClientImpl();
	}

	@Test
	public void testExtensionClientGet(){
		Assert.assertEquals("To test the maven plugin", this.extensionClient.get(new HashMap<>()));
	}
}
