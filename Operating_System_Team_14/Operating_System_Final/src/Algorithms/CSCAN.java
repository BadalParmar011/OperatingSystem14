package Algorithms;

public class CSCAN
{
    public Object[] CSCAN(int[] Q,int IH,int PH, int TT)
    {
        int seek_time=0,i,j,f=0,n = Q.length;
        
        String SeekTime[] = new String[Q.length+3];
        SeekTime[0] = "0";
        
        int[] Queue = new int[Q.length+3];
        Queue[0]=IH;
        
        int[] visited = new int[n+1];


        if(PH<=IH) f=0;
        else f=1;
        int t = 0;
        for(i=0;i<n;i++)
        {
                int pos = -1;
                int min = 10000;
                for(j=0;j<n;j++)
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
                
                if(pos==-1)
                {
                        if(f==0)
                        {
                                seek_time += Math.abs(TT - IH);
                                Queue[t+1] = TT;
                                Queue[t+2] = 0;
                                SeekTime[t+1] = seek_time+"";
                                SeekTime[t+2] = seek_time+"";
                                IH = 0;
                                t += 2;
                        }
                        else 
                        {
                                seek_time += Math.abs(0 - IH);
                                Queue[t+1] = 0;
                                Queue[t+2] = TT;
                                SeekTime[t+1] = seek_time+"";
                                SeekTime[t+2] = seek_time+"";
                                IH = TT;
                                t += 2;
                        }
                        i--;
                        continue;
                }
                visited[pos] = 1;
                seek_time += Math.abs(Q[pos] - IH);
                Queue[t+1] = Q[pos];
                SeekTime[t+1] = seek_time+"";
                IH = Q[pos];
                t +=1 ;
        }

        return new Object[]{Queue, SeekTime};
    }
}