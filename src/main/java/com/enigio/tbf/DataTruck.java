package com.enigio.tbf;

import java.util.ArrayList;

public class DataTruck {

	public static ArrayList<Feeder> feeders;

	public static void run() {
		feeders = new ArrayList<Feeder>();
		feeders.add(new Feeder("Euro data","http://api.fixer.io/latest"));
		feeders.add(new Feeder("USD data","http://api.fixer.io/latest?base=USD"));
		feeders.add(new Feeder("SEK data","http://api.fixer.io/latest?base=SEK"));
	}

}

