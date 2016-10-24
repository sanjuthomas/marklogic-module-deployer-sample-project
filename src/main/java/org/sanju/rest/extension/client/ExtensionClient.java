package org.sanju.rest.extension.client;

import java.util.Map;

/**
 *
 * @author Sanju Thomas
 *
 */
public interface ExtensionClient {

	Object get(final Map<String, String> params);

	Object post(final Map<String, String> params);

	Object put(final Map<String, String> params);

	Object delete(final Map<String, String> params);

}
