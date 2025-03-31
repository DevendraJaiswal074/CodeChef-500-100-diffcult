//https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/SUBSCRIBE_?tab=statement

import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		while(T >0){
		    int N,X;
		    N = scan.nextInt();
		    X = scan.nextInt();
		    
		    System.out.println((N+5)/6 * X);
		    T--;
		}
		scan.close();
	}
}
