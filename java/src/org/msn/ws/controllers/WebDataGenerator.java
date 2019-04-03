package org.msn.ws.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.msn.core.StreamingProcessor;

@Path("/streaming")
public class WebDataGenerator {
	@GET
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response getData() {
		return Response.ok(new StreamingProcessor()).build();
	}
}
