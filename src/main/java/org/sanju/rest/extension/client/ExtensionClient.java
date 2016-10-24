package org.sanju.rest.extension.client;

import java.util.Map;

/**
 *
 * @author Sanju Thomas
 *
 */
public interface ExtensionClient {

	Object get(final Map<String, String> params);

	Object post(final Map<String, String> params, final Map<String, Object> payload);

	Object put(final Map<String, String> params, final Map<String, Object> payload);

	Object delete(final Map<String, String> params);

}
