package com.enigio.tbf;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class VocoStart {

	public static String VOCO = "Hej love test";
	public static String TEST = "";
	public static HttpResponse<JsonNode> jsonResponse;

	public static void run() {
		try {
			jsonResponse = Unirest.get("http://api.fixer.io/latest").asJson();

		} catch (UnirestException e) {
			e.printStackTrace();
		}
	}

}
