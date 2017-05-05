package com.enigio.tbf;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class VocoStart {

	public static String VOCO = "Hej voco";
	public static String TEST = "";
	public static HttpResponse<String> jsonResponse;

	public static void run() {
		try {
			jsonResponse = Unirest.get("http://httpbin.org/get").asString();

		} catch (UnirestException e) {
			e.printStackTrace();
		}
	}

}
