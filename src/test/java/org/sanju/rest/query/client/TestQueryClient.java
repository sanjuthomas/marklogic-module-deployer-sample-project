package org.sanju.rest.query.client;

import org.junit.Before;
import org.junit.Test;
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

	@Test
	public void shouldFindById(){
		Assert.assertEquals("/test/junit.json", this.queryClient.findById("1000").get("results").get(0).get("uri").textValue());
	}

}
