package JulyLunchtime;
import java.util.*;
public class RedAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int tc= sc.nextInt();
		while(tc-->0)
		{
			int n= sc.nextInt();
			int d= sc.nextInt();
			int H= sc.nextInt();
			int a[]= new int[n];
			int lev=0, flag=0;
			for(int i=0;i<n;i++)
			{
				a[i]= sc.nextInt();
				if(a[i]> 0)
				{
					lev=lev+a[i];
					
				}
				else {
					if(lev<d) {
						lev=0;
					}
					else {
						lev=lev-d;
					}
				}
				
				if(lev> H) {
					flag= 1;
					break;
				}
			}
			
			if(flag==1)
			{
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
