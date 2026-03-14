/**

 * Oct 17,21
 * Recursion
 * Methods for recursion main
 */




package Recursion;

public class Recursion {

	
public static int sum_up(int ii) {
		
		if (ii <= 0) {
			return 0;
			
		}
		
		return ii+sum_up(ii-1);//
	}
	
	public static int sum_up_tail(int ii) {
		
		return sum_up_tail(ii, 0);
	}
	
	public static int sum_up_tail(int ii, int jj) {
		if (ii <1) {
			return jj;
			
		}
		else {
			return sum_up_tail(ii-1, jj+ ii);//
		}
	}
	
	public static int fib(int ii) {
		
		if (ii <=1)
			return ii;
		else
		return fib(ii-1) + fib(ii-2);//fibonacci
		
	}
	
	public static int power (int ii, int jj) {
		
		if(jj==0)
			return 1;
		else
		return power(ii,jj-1)* ii;
	}
	
	public static void triangle (int ii) {
		
		if(ii<1)
			return;
		
		triangle(ii -1);//sub 1 from tri
		
		for(int i = 0; i<ii; i++)//loops that adds *
			System.out.print("*");
		System.out.print("\n");
		
	}
	
	public static int balance (int x, int y) {
		//abs 
		if(Math.abs(x-y)<=1)
		//the ternary operator
			return(x<y?x:y);
		else
			
		return (x<y?balance(x+1, y-1):balance(x-1,y+1));
		
	}
	
	public static int Ackermann (int ii, int jj) {
		//if ii = 0 return
		if (ii == 0)
			return jj+1;
		
		//if jj = 0 return
		if(jj == 0)
			
			return Ackermann (ii -1, 1); //
		else
			
			return Ackermann(ii-1, Ackermann(ii, jj-1)); //Ackermann func
	}
	
	public static double pi_approximation(int ii) {
		//if equal to 1 return else
		
		if(ii ==1)
			return 4;
		
		else
			return pi_approximation(ii-1)+4*(Math.pow(-1, ii+1))/(2*ii-1); //calculates the leibniz approximation of pi given array
		
		
	}
	
	
	public static int lengthOfLongestSubsequence(String a1, String b1) {
		//comparing length
		if(a1.length() == 0 || b1.length() == 0) 
			return 0;
		//
		if(a1.charAt(0) == b1.charAt(0))
			return 1+lengthOfLongestSubsequence(a1.substring(1), b1.substring(1)); // extracting characters
		
		else
			return(Math.max(lengthOfLongestSubsequence(a1.substring(1), b1), lengthOfLongestSubsequence(a1, b1.substring(1))));
		
		
		
	}
	
	
}


//fib ii 
//power ii jj
//triangle 
//balance ii jj 
//Ackermann ii jj
//pi_approximation ii
//lengthOfLongestSubsequence a1, b1 String
