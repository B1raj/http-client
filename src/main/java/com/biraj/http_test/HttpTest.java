package com.biraj.http_test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

import jdk.incubator.http.*;
import jdk.incubator.http.HttpResponse.*;


public class HttpTest {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		HttpClient client = HttpClient.newBuilder().build();

		HttpRequest request = HttpRequest.newBuilder(new URI("http://airhacks.com")).GET().build();

		HttpResponse<String> response = client.send(request,
				BodyHandler.asString(Charset.defaultCharset()));

		System.out.println(response.statusCode());

	}

}
