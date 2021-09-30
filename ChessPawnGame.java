package CodeforcesRound732;
import java.util.*;
public class ChessPawnGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int tc= sc.nextInt();
		while(tc-->0)
		{
			int n= sc.nextInt(), ans=0;
			String a,b;
			a= sc.next();
			b= sc.next();
			for(int i=0;i<n;i++)
			{
				if(b.charAt(i)=='1')
				{
					if(a.charAt(i)=='0') {
						ans++;
						
					}
				}
					
			}
		}
	}

}
