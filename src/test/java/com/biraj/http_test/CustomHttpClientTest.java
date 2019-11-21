
package com.biraj.http_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import jdk.incubator.http.HttpResponse;

public class CustomHttpClientTest {

	@Test
	public void testDoGet() {

		CustomHttpClient client = new CustomHttpClient();
		HttpResponse<String> r = client.doGet("http://airhacks.com/xyz");
		assertEquals(r.statusCode(), 404);
	}

}
