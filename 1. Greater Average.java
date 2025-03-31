//https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/AVGPROBLEM
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t>0){
		    int A,B,C;
		    
		    A = scan.nextInt();
		    B = scan.nextInt();
		    C = scan.nextInt();
		    
		    if((A+B) > 2*C){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		scan.close();

	}
}
