package ch11;

import java.util.*;

public class ex4 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(5, 10, 11, 1, 37, 3, 25));
		System.out.println(partition(list, 9));

	}
	
	public static ArrayList<Integer> partition(ArrayList<Integer> list, int E) {	
			Iterator<Integer> itr = list.iterator();
			
			ArrayList<Integer> less = new ArrayList<Integer>();
			
			ArrayList<Integer> more = new ArrayList<Integer>();
			
			ArrayList<Integer> partitioned = new ArrayList<Integer>();
			int element;
			
			
			while(itr.hasNext()) {
				element = itr.next();
				if(element < E) {
					less.add(element);
				}else {
					more.add(element);
				}
			}
			for(int i = 0; i < less.size(); i++) {
				partitioned.add(less.get(i));
			}
			for(int i = 0; i < more.size(); i++) {
				partitioned.add(more.get(i));
			}

			return partitioned;
		
	}

}
