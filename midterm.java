package ch12;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class midterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(17);
		list.add(13);
		list.add(13);
		list.add(13);
		list.add(12);
		list.add(17);
		list.add(11);
		
		System.out.println(maxOccurences(list));
		

	}
	
	public static int maxOccurences(LinkedList<Integer> list) {
		
		Map<Integer, Integer> modeMap = new HashMap<Integer, Integer>();
		int ret = 0;
		int max = 0;
		if(list.isEmpty()) {
			ret = 0;
		} else {
			for(int i = 0; i < list.size(); i++) {
				int curr = list.get(i);
				int count = 0;
				for(int j = 0; j < list.size(); j++) {
					if(list.get(j) == curr) {
						count++;
						modeMap.put(curr, count);
					}
				}
				if(count > max) {
					max = count;
					ret = list.get(i);
				}
			}
			System.out.println(modeMap);
		}
		return ret;
	}
}
