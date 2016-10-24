package org.sanju.query.client;

import com.fasterxml.jackson.databind.JsonNode;

/**
 *
 * @author Sanju Thomas
 *
 */
public interface QueryClient {

	JsonNode findById(String id);

}
