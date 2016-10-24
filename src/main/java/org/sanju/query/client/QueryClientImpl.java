package org.sanju.query.client;

import org.sanju.ml.ClientProvider;

import com.fasterxml.jackson.databind.JsonNode;
import com.marklogic.client.document.ServerTransform;
import com.marklogic.client.io.JacksonHandle;
import com.marklogic.client.query.QueryManager;
import com.marklogic.client.query.StructuredQueryBuilder;
import com.marklogic.client.query.StructuredQueryDefinition;

/**
 *
 * @author Sanju Thomas
 *
 */
public class QueryClientImpl implements QueryClient{

	@Override
	public JsonNode findById(final String id) {

		final QueryManager queryMgr = ClientProvider.getClient().newQueryManager();
		final StructuredQueryBuilder qb = new StructuredQueryBuilder();
		final StructuredQueryDefinition containQuery = qb.containerQuery(qb.jsonProperty("id"), qb.term(id));
		containQuery.setResponseTransform(new ServerTransform("js-test-transform"));
		final JacksonHandle results = queryMgr.search(containQuery, new JacksonHandle());
		return results.get();
	}

}
