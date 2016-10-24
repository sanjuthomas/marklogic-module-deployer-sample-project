package org.sanju.rest.extension.client;

import java.util.HashMap;
import java.util.Map;

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

	@Test
	public void testExtensionClientPut(){

		final Map<String, String> params = new HashMap<>();
		params.put("url", "/test/junit.json");

		final Map<String, Object> payload = new HashMap<>();
		payload.put("id", 1000);
		payload.put("name", "Sanju Thomas");
		final String url = (String) this.extensionClient.put(params, payload);
		Assert.assertEquals("/test/junit.json", url);
	}

	@Test
	public void testExtensionClientDelete(){

		Assert.assertEquals("sub test function", this.extensionClient.delete(new HashMap<>()));
	}
}
