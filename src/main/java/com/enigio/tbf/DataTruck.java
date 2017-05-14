package com.enigio.tbf;

import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.http.HttpSession;

public class DataTruck {
	
	public static ArrayList<Feeder> feeders;
	public static boolean deletion = false;

	public static void run() {
		
		feeders = new ArrayList<Feeder>();
		feeders.add(new Feeder("EUR","http://api.fixer.io/latest"));
		feeders.add(new Feeder("USD","http://api.fixer.io/latest?base=USD"));
		feeders.add(new Feeder("SEK","http://api.fixer.io/latest?base=SEK"));
	}
	
	public static void addData(String name, String link) {
		
		feeders.add(new Feeder(name, link));

	}
	
	public static void deleteAll(HttpSession session) {
		
        feeders = new ArrayList<Feeder>(); 
        session.setAttribute("feeders", DataTruck.feeders);
	}

}

