package ch12;


public class assignment4 {


	
	public static String writeSequence(int n) {
		
		//create strings for when n = 1 or n = 2
		String one="1";
		String two="1 1";
		
		//create message for IllegalArgumentException
		String err = "number must be greater than 1";
		
		//n must be equal or greater than one
		//if n = 1 ; output = "1"
		//if n = 2 ; output = "1 1"
		//if n is even then begin the sequence with n/2
		//else begin sequence with n/2+1
		if(n < 1) {
			throw new IllegalArgumentException(err);
		}else if(n == 1) {
		
			return one;
		} else if (n == 2) {
			return two;
		} else if (n%2 == 0) {
			return (n/2) + " " + writeSequence(n-2) + " " + (n/2);
		} else {
			return (n/2+1) + " " + writeSequence(n-2) + " " + (n/2+1);
		}
		
	}
	

}
