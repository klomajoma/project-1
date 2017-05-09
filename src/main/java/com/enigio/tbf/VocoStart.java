package com.enigio.tbf;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class VocoStart {

	public static String VOCO = "Hej love test";
	public static String TEST = "";
	public static HttpResponse<JsonNode> jsonResponse;
	public static HttpResponse<JsonNode> jsonResponse2;
	public static HttpResponse<JsonNode> jsonResponse3;

	public static void run() {
		try {
			
			jsonResponse = Unirest.get("http://api.fixer.io/latest").asJson();
			jsonResponse2 = Unirest.get("http://api.fixer.io/latest?base=USD").asJson();
			jsonResponse3 = Unirest.get("http://api.fixer.io/latest?base=SEK").asJson(); 

		} catch (UnirestException e) {
			e.printStackTrace();
		}

	}

}

