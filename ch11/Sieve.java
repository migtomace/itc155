package ch11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will tell all the prime #s up to max #");
		
		Scanner console = new Scanner(System.in);
		System.out.println("Max number?");
		int max = console.nextInt();
				
		LinkedList<Integer>primes = sieve(max);
		System.out.println("Prime numbers up to " + max + " :");
		System.out.println(primes);
		
		
		console.close();
	}
	
	//return a list of all prime numbers up to the given max #
	//using the Sieve of Eratosthenes algorithm.
	public static LinkedList<Integer> sieve (int max){
		
		//add all numbers from 2 to max in the list
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		LinkedList<Integer> primes = new LinkedList<Integer>();
		for(int i = 2; i <= max; i++) {
			numbers.add(i);
		}
		
		while(!numbers.isEmpty()) {
			//remove the prime number from the front of the list
			int front = numbers.remove(0);
			primes.add(front);
			
			//remove all multiples of this prime number
			Iterator<Integer> itr = numbers.iterator();
			while(itr.hasNext()) {
				int current = itr.next();
				if(current % front == 0) {
					itr.remove();
				}
			}
		}
		
		return primes;
	}

}
