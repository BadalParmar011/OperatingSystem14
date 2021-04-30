package Algorithms;

import java.util.Arrays;


public class CLOOK {
	public Object[] CLOOK(int[] Q,int IH,int PH)
	{
		int n = Q.length,max_loc=0,min_loc=10000;
                
                String SeekTime[] = new String[Q.length+1];
                SeekTime[0] = "0";
        
                int[] Queue = new int[Q.length+1];
                Queue[0]=IH;
                
		int seek_time=0,i,j,f=0,d=0;
                
		Arrays.sort(Q);
                min_loc = Q[0];
                max_loc = Q[n-1];
		
		int[] visited = new int[n+1];
		
		
		if(PH<=IH) f=0;
		else f=1;
		
		for(i=0;i<n;i++)
		{
			int pos = -1;
			int min = 10000;
			for(j=0;j<n;j++)
			{
				if(d==1)
				{
					if(Q[j] == IH) 
					{
						pos=j;
						break;
					}
				}
				else
				{
					if(f==0)
					{
						if(Q[j]>IH && min>Q[j]-IH && visited[j]==0)
						{
							min = Q[j] - IH;
							pos = j;
						}
					}
					
					else if(f==1)
					{
						if(Q[j]<=IH && min>IH-Q[j] && visited[j]==0)
						{
							pos = j;
							min = IH-Q[j];
						}
					}
				}
			}
			if(pos==-1)
			{
				if(f==0)
				{
					IH = min_loc;
					d=1;
				}
				else 
				{
					IH = max_loc;
					d=1;
				}
				i--;
				continue;
			}
			visited[pos] = 1;
			if(d==0) seek_time += Math.abs(Q[pos] - IH);
			else if(d==1) d=0;
			IH = Q[pos];
                        Queue[i+1] = Q[pos];
                        SeekTime[i+1] = seek_time+""; 
		}
            return new Object[]{Queue, SeekTime};
	}
}
