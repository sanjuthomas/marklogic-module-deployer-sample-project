package org.sanju.rest.query.client;

import org.junit.Before;
import org.sanju.query.client.QueryClient;
import org.sanju.query.client.QueryClientImpl;

import junit.framework.Assert;

/**
 *
 * @author Sanju Thomas
 *
 */
public class TestQueryClient {

	private QueryClient queryClient;

	@Before
	public void setup(){
		this.queryClient = new QueryClientImpl();
	}

	public void shouldFindById(){
		Assert.assertEquals("from transform", this.queryClient.findById("1000").get("injected").textValue());
		Assert.assertEquals("/test/junit.json", this.queryClient.findById("1000").get("results").get(0).get("uri").textValue());
	}

}
