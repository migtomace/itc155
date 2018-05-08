package ch12;

public class assignment5 {
	public static void main(String[] args) {
		System.out.println(writeChars(1));
		System.out.println(writeChars(2));
		System.out.println(writeChars(3));
		System.out.println(writeChars(4));
		System.out.println(writeChars(5));
		System.out.println(writeChars(6));
		System.out.println(writeChars(7));
		System.out.println(writeChars(8));
	}
	
	public static String writeChars(int n) {
		
		//create strings for when n = 1 or n = 2
		String one="*";
		String two="**";
		
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
		} else {
			return "<" + writeChars(n-2) + ">";
		}
		
	}
}
