package org.sanju.query.client;

import com.fasterxml.jackson.databind.JsonNode;

/**
 *
 * @author Sanju Thomas
 *
 */
public interface QueryClient {

	/**
	 * Query by property and apply transform on the way out.
	 *
	 * @param id
	 * @return
	 */
	JsonNode findById(String id);

}
