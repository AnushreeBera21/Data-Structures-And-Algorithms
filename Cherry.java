package Codeforces;

import java.util.*;
public class Cherry {

	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		int tc= sc.nextInt();
		while(tc-->0)
		{
			int n= sc.nextInt();
			
			int a[]= new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]= sc.nextInt();
			}
			
			ArrayList<Integer> vect= new ArrayList<Integer>();
			int k=0;
			for(int i=1; i< n;i++) {
				int sum=0;
				sum= a[i]*a[i-1];
				vect.add(sum, k);
				k++;
			}
			System.out.println(Math.max(vect.get(0), vect.get(k-1)));
		}
	}
}
