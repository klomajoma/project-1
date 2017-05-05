package com.enigio.tbf;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class VocoStart {
	
	public static String VOCO = "";
	public static String TEST = "";

	HttpResponse<JsonNode> jsonResponse = Unirest.post("http://httpbin.org/post")
			.header("accept", "application/json")
			.queryString("apiKey", "123")
			.field("parameter", "value")
			.field("foo", "bar")
			.asJson();

	public VocoStart() throws UnirestException {
	}
}
