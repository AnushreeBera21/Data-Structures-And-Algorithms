package tslInternship;

import java.io.*;
import java.util.*;

class FlowShopAlgorithm{
	
	public int[] ArrangeDescendingJobs(int[][] Jobmx, int n, int m)
	{
		int jobsdesc[]= new int[n];
		int Ttime[]= new int[n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				Ttime[i]+= Jobmx[i][j];
			}
		}
		
		for(int i=0;i<n;i++)
		{
			int pos=0, max= Ttime[0];
			for(int j=0;j<n;j++)
			{
				if(Ttime[j]> max)
				{
					max= Ttime[j];
					pos= j;
				}
				
			}
			Ttime[pos]= -1;
			jobsdesc[i]= pos;

		}
		
		return jobsdesc;
		
	}
	
	public ArrayList<Integer> initiateAlgorithm(int[] jobsdesc, int[][] process_time, int n, int m)
	{
		ArrayList<Integer> list_jobs= new ArrayList<Integer>();
		list_jobs.add(jobsdesc[0]);
		
		
		
		for(int i=1;i<n;i++)
		{
			
			ArrayList<List<Integer>> list_permutations = generatePermutations(list_jobs, jobsdesc[i]);
			
			int min_make_span=Integer.MAX_VALUE;
			ArrayList<Integer> optimal_jobs_list= new ArrayList<Integer>();
			for(int j=0;j<list_permutations.size();j++)
			{
				System.out.println(list_permutations.get(j).toString());
				int make_span= computePartialSequence((ArrayList<Integer>) list_permutations.get(j), process_time, n, m);
				System.out.println(make_span);
				if(make_span < min_make_span)
				{
					
					
					min_make_span= make_span;
					optimal_jobs_list= (ArrayList<Integer>) list_permutations.get(j);
					
					
					
					
				}
			}
		
			list_jobs= optimal_jobs_list;
			
		}
		
		return list_jobs;
	}
	
	public int computePartialSequence(ArrayList<Integer> list, int[][] process_time_init, int n, int m)
	{
		int[][] partialSequence= new int[list.size()][m];
		int make_span=0;
		int[][] process_time= new int[list.size()][m];
		
		
		for(int i= 0;i<list.size();i++)
		{
			for(int j=0;j<m;j++)
			{
				
				process_time[i][j]= process_time_init[(int)list.get(i)][j];
//				System.out.print(process_time[i][j]+" ");
			}
//			System.out.println();
		}
		

		for(int i=0;i<list.size();i++)
		{
	
			for(int j=0;j<m;j++)
			{
				if(i==0 && j==0)
				{
					partialSequence[i][j]= process_time[i][j];
				}
				else if(i==0)
				{
					partialSequence[i][j]= partialSequence[i][j-1]+ process_time[i][j];
				}
				else if(i!=0 && j==0)
				{
					partialSequence[i][j]= partialSequence[i-1][j]+ process_time[i][j];
				}
				else {
					partialSequence[i][j]= Math.max(partialSequence[i-1][j], partialSequence[i][j-1])+ process_time[i][j];
				}
				
				System.out.print(partialSequence[i][j]+" ");
			}
			System.out.println();
		}
		make_span= partialSequence[list.size()-1][m-1];
		
		
		
		return make_span;
		
	}
	
	ArrayList<List<Integer>> generatePermutations(ArrayList<Integer> list_jobs,int job)
	{
		ArrayList<List<Integer>> list_permutations= new ArrayList<List<Integer>>();
		int n= list_jobs.size();
		
		
		for(int i=0;i<n+1;i++)
		{
			
			ArrayList<Integer> permutations= new ArrayList<Integer>(list_jobs);
			permutations.add(i, job);
			list_permutations.add(permutations);
			
		}
		return list_permutations;
	}
}
public class FlowShopScheduling {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n, m;
		String s[];
		s= br.readLine().trim().split(" ");
		n= Integer.parseInt(s[0]);
		m= Integer.parseInt(s[1]);
//		System.out.println(n+" "+m);
		int process_time[][]= new int[n][m];
		for(int i=0; i<n;i++)
		{
			String str[]= br.readLine().split(" ");
			for(int j=0;j<m;j++)
			{
				process_time[i][j]= Integer.parseInt(str[j]);
			}
		}
		FlowShopAlgorithm fs= new FlowShopAlgorithm();
		
		int jobsdesc[]= fs.ArrangeDescendingJobs(process_time, n, m);
		
		ArrayList<Integer> list_jobs= fs.initiateAlgorithm(jobsdesc, process_time, n, m);
		
		System.out.println("The most Optimal Flow shop Sequence is :");
		for(int i=0;i< list_jobs.size();i++)
		{
			System.out.print(list_jobs.get(i)+" ");
		}
	}

}
