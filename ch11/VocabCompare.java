package ch11;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class VocabCompare {


	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//create scanners for each file
		Scanner scannerMoby = new Scanner(new File("mobydick.txt"));
		Scanner scannerHamlet = new Scanner(new File("hamlet(1).txt"));
		

		
		Set<String> wordsMoby = new HashSet<String>();
		Set<String> wordsHamlet = new HashSet<String>();
		
		while(scannerMoby.hasNext()){
			String word1 = scannerMoby.next();
			word1 = word1.toLowerCase();
			wordsMoby.add(word1);
		}
		
		while(scannerHamlet.hasNext()){
			String word2 = scannerHamlet.next();
			word2 = word2.toLowerCase();
			wordsHamlet.add(word2);
		}
		

		Set<String> wordsCommon =new HashSet<String>(wordsMoby);
		wordsCommon.retainAll(wordsHamlet);
		
		
		//Division for percentages.
		double perc1 = (double)wordsCommon.size()/wordsMoby.size() *100;
		double perc2= (double)wordsCommon.size()/wordsHamlet.size() *100;
		
	
		
		System.out.println("file #1 anme? mobydick.txt");
		System.out.println("file #2 name? hamlet.txt");
		
		System.out.println("file #1 words = " + wordsMoby.size());
		System.out.println("file #2 words = " + wordsHamlet.size());
		
		System.out.println("common words = " + wordsCommon.size());
		
		System.out.println("Percentage of file 1 in overlap = " + perc1);
		System.out.println("Percentage of file 2 in overlap = " + perc2);
		scannerMoby.close();
		scannerHamlet.close();

	}

	public static boolean hasDuplicates(Set<Integer> list){
		
		Iterator<Integer> i = list.iterator();
		
		Set<Integer> set = new HashSet<Integer>();
		while(i.hasNext()){
			int x = (int) i.next();
			set.add(x);
		}
		
		return set.size()<list.size(); //list has duplicates
			
}


}
