package ch11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class isUniqueTest extends isUnique {

	@Test
	void test() {
		
		isUnique unique = new isUnique();
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("0", "0");
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "2");
		
		System.out.println(unique.isUnique(map));
	}
	
	@Test
	void test2() {
		
isUnique unique = new isUnique();
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("0", "0");
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		
		System.out.println(unique.isUnique(map));
	}

}
