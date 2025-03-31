//https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/JASSIGNMENTS

import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		while(T > 0){
		    int X = scan.nextInt();
		    if ((X+3)<=10) {
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    T--;
		}
        scan.close();
	}
}
