package com.enigio.tbf;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Feeder {

    public String nameOfFeeder;
    public HttpResponse<JsonNode> jsonResponse;
    public String prettyJsonString;

    public Feeder( String name, String link) {

        nameOfFeeder = name;

        try {
            // Try to fetch JSON data from link.
            jsonResponse = Unirest.get(link).asJson();
            
            //Make a "pretty" json string.
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonParser jp = new JsonParser();
            JsonElement je = jp.parse(jsonResponse.getBody().toString());
            prettyJsonString = gson.toJson(je);

        } catch (UnirestException e) {

            //Log potential errors on Stack.
            e.printStackTrace();

        }

    }

    public  HttpResponse<JsonNode> getJsonResponse() {
        return jsonResponse;
    }
}