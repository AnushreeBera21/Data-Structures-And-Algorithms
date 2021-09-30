package JulyLunchtime;
import java.util.*;
public class ArrayRotiationReturns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int tc= sc.nextInt();
		while(tc-->0)
		{
			int n= sc.nextInt();
			int a[]= new int[n];
			int b[]= new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]= sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				b[i]= sc.nextInt();
			}
			int c[]= new int[n];
			int min= (a[0]+ b[0])%n, pos=0;
			for(int i=1;i<n;i++)
			{
				int temp= (a[i]+b[i])%n;
				if(temp<min)
				{
					min= temp;
					pos= i;
				}
			}
			for(int i=0;i<n;i++)
			{
				int j=(i+pos)%n;
				System.out.print((a[i]+b[j])%n);
			}
		}
	}

}
