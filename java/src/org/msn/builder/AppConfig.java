package org.msn.builder;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

public class AppConfig extends ResourceConfig {
	public AppConfig() {
		packages("org.msn.ws.controllers");
		property(ServerProperties.OUTBOUND_CONTENT_LENGTH_BUFFER,0);
	}
}
