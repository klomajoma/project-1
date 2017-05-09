package com.enigio.tbf;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Feeder {

    public String nameOfFeeder;
    public HttpResponse<JsonNode> jsonResponse;

    public Feeder( String name, String link) {

        nameOfFeeder = name;

        try {
            // Try to fetch JSON data from link.
            jsonResponse = Unirest.get(link).asJson();

        } catch (UnirestException e) {

            //Log potential errors on Stack.
            e.printStackTrace();

        }

    }

    public  HttpResponse<JsonNode> getJsonResponse() {
        return jsonResponse;
    }
}