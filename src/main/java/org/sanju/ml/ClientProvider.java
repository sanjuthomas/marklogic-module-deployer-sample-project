package org.sanju.ml;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.DatabaseClientFactory;
import com.marklogic.client.DatabaseClientFactory.Authentication;

/**
 *
 * @author Sanju Thomas
 *
 */
public class ClientProvider {

	private static final String host = "localhost";
	private static final int port = 15000;
	private static DatabaseClient databaseClient = null;

	//test-maven-plugin-user should have "rest-extension-user", "rest-writer", and "rest-reader" roles.

	public static DatabaseClient getClient(){

		if(null == databaseClient){
			databaseClient = DatabaseClientFactory.newClient(host, port, "test-maven-plugin-user", "test", Authentication.DIGEST);
		}

		return databaseClient;
	}

}
