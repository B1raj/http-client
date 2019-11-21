package com.biraj.http_test;

import java.net.URI;
import java.nio.charset.Charset;


import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;
import jdk.incubator.http.HttpResponse.BodyHandler;
import lombok.extern.slf4j.Slf4j;

public class CustomHttpClient {

	public HttpResponse<String> doGet(String uri) {
		HttpClient client = HttpClient.newBuilder().build();
		HttpResponse<String> response = null;
		try {
			HttpRequest request = HttpRequest.newBuilder(new URI(uri)).GET().build();
			response = client.send(request, BodyHandler.asString(Charset.defaultCharset()));
		} catch (Exception e) {
		 e.printStackTrace();
		}
		return response;
	}
 
}
