package JulyLunchtime;
import java.util.*;
public class ChefandSpells {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int tc= sc.nextInt();
		while(tc-->0)
		{
			long a= sc.nextLong();
			long b= sc.nextLong();
			long c= sc.nextLong();
			
			int max= (int)Math.max(a, Math.max(b, c));
			int min= (int)Math.min(a, Math.min(b,  c));
			
			System.out.println(max+ (a+b+c- max-min));
		}
	}

}
