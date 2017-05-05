package com.enigio.tbf;
<<<<<<< HEAD
=======

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
>>>>>>> 7a354fb5fec69f631b35e7fd24aba700f99f1a2a

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

