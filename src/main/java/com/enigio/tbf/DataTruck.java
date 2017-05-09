package com.enigio.tbf;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DataTruck {

	public static ArrayList<Feeder> feeders;

	public static void run() {
		
		feeders = new ArrayList<Feeder>();
		feeders.add(new Feeder("EUR","http://api.fixer.io/latest"));
		feeders.add(new Feeder("USD","http://api.fixer.io/latest?base=USD"));
		feeders.add(new Feeder("SEK","http://api.fixer.io/latest?base=SEK"));
	}

}

