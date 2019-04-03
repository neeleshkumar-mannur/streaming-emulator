package org.msn.core;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.StreamingOutput;

public class StreamingProcessor implements StreamingOutput{

	@Override
	public void write(OutputStream output) throws IOException, WebApplicationException {
		try {
			for (int i = 0; i < 10; i++) {
                output.write(String.format("Hello %d\n", i).getBytes());
                output.flush();
                TimeUnit.MILLISECONDS.sleep(500);
            }
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
