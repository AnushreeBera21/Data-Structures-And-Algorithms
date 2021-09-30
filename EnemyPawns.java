package CodeforcesRound732;
import java.util.*;
public class EnemyPawns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int tc= sc.nextInt();
		while(tc-->0)
		{
			int count=0;
			int n= sc.nextInt();
			int a[]= new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
			for(int i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
				if(b[i]==1)
				{
					count++;
				}
			}
			
			for(int i=0;i<n;i++)
			{
				if(i==0)
				{
					if(a[i]==1)
					{
						if(b[i+1]!=1)
							count--;
					}
				}
				else if(i==n-1)
				{
					if(a[i]==1)
					{
						if(b[i-1]!=1)
							count--;
					}
				}
				else {
					if(a[i]==1&&b[i]==1)
					{
						if(b[i-1]!=1&&b[i+1]!=1 && a[i-1]!=1 && a[i+1]!=1)
							count--;
						
					}
				
				}
			}
			System.out.println(count);
		}
	}

}
