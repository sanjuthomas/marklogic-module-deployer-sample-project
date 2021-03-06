package org.sanju.rest.extension.client;

import java.util.Map;
import java.util.Map.Entry;

import org.sanju.ml.ClientProvider;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marklogic.client.DatabaseClient;
import com.marklogic.client.extensions.ResourceManager;
import com.marklogic.client.io.JacksonHandle;
import com.marklogic.client.io.StringHandle;
import com.marklogic.client.util.RequestParameters;

/**
 *
 * @author Sanju Thomas
 *
 */
public class ExtensionClientImpl extends ResourceManager implements ExtensionClient{

	private static final String TEST_END_POINT  = "js-test-extension";
	private static final ObjectMapper mapper = new ObjectMapper();


	public ExtensionClientImpl(){
		final DatabaseClient databaseClient = ClientProvider.getClient();
		databaseClient.init(TEST_END_POINT, this);
	}


	@Override
	public Object get(final Map<String, String> params) {
		return this.getServices().get(this.getRequestParams(params), new StringHandle()).get();
	}


	private RequestParameters getRequestParams(final Map<String, String> params) {
		final RequestParameters requestParams = new RequestParameters();
		for(final Entry<String,String> entry : params.entrySet()){
			requestParams.put(entry.getKey(), entry.getValue());
		}
		return requestParams;
	}


	@Override
	public Object post(final Map<String, String> params, final Map<String, Object> payload) {
		return this.getServices().post( this.getRequestParams(params), this.getHandle(payload), new StringHandle()).get();
	}


	@Override
	public Object put(final Map<String, String> params, final Map<String, Object> payload) {
		return this.getServices().put( this.getRequestParams(params), this.getHandle(payload), new StringHandle()).get();
	}


	private JacksonHandle getHandle(final Map<String, Object> params) {
		final JacksonHandle jacksonHandle = new JacksonHandle();
		jacksonHandle.set(mapper.convertValue(params, JsonNode.class));
		return jacksonHandle;
	}


	@Override
	public Object delete(final Map<String, String> params) {
		return this.getServices().delete(this.getRequestParams(params), new StringHandle()).get();
	}
}
