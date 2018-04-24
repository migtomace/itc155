package ch11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class isUnique {
	
	public boolean isUnique(HashMap<String, String> map) {
		
		//create a collection that contains values from the HashMap
	    Collection<String> values = map.values();
	    
	    //declare iterator
	    Iterator<String> iterator = values.iterator();
	    
	    //create a boolean defaulted to true
	    //meaning the two compared values won't equal each other
	    boolean bool = true;
	    
	    //create an empty string for value1
	    String value1 = "";
	    
	    //create a while loop to iterate through the collection values
	    while(iterator.hasNext()) {
	    	
	    	//define value2 as the next value
	    	String value2 = iterator.next();
	    	
	    	//if the compared values are not equal
	    	//AND
	    	//our boolean does not equal false
	    	//then our boolean equals true
	    	if(value1 != value2 && bool != false) {
	    		bool = true;
	    		
	    		//set value1 as the last value
	    		value1 = value2;
	    	} else {
	    		bool = false;
	    	}
	    }
		return bool;
	}

}
