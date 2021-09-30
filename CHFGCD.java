package CodechefCookOff;

import java.util.*;
public class CHFGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int tc= sc.nextInt();
		while(tc-->0)
		{
			long x= sc.nextInt();
			long y= sc.nextInt();
			
			if(gcd(x, y)>1)
				System.out.println(0);
			
			else if(x%2!=0 && y%2!=0)
				System.out.println(2);
			
			else if(x%2!=0 || y%2!=0)
				System.out.println(1);	
		}
	}
	
	static long gcd(long a, long b) {
		if(b==0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
