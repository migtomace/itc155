package ch11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList<String>();
		
		list.add("cat");
		list.add("cats");
		list.add("dog");
		list.add("dogs");
		
		System.out.println(list);
		removeEvenLength(list);
		System.out.println("After...");
		System.out.println(list);
		
		
	}
	
	//remove all strings of even length from a list
	//we use arraylist
	public static void removeEvenLength(LinkedList<String> list) {
//		int i = 0;
//		while(i < list.size()) {
//			String element = list.get(i);
//			if(element.length() % 2 == 0) {
//				list.remove(i);
//			}else {
//				i++; //skip to next element
//			}
//		}
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			String element = i.next();
			if(element.length() % 2 == 0) {
				i.remove();
			}
		}
	}

}
