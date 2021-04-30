package Algorithms;

/******************
 * @author Lalwani*
 ******************/

public class SCAN {
    public Object[] SCAN(int[] Q,int IH, int PH, int TT)
    {
        int seek_time=0,i,j,f=0,n=Q.length;
        
        String SeekTime[] = new String[Q.length+2];
        SeekTime[0] = "0";
        
        int[] Queue = new int[Q.length+2];
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
                    if(Q[j]>IH && min>Math.abs(Q[j]-IH) && visited[j]==0)
                    {
                        min = Math.abs(Q[j] - IH);
                        pos = j;
                    }
                }

                else if(f==1)
                {
                    if(Q[j]<=IH && min>Math.abs(Q[j]-IH) && visited[j]==0)
                    {
                        pos = j;
                        min = Math.abs(Q[j]-IH);
                    }
                }
            }

            if(pos==-1)
            {
                if(f==0)
                {
                    f=1;
                    seek_time += Math.abs(TT - IH);
                    Queue[t+1] = TT;
                    SeekTime[t+1] = seek_time+"";
                    IH = TT;
                    t += 1;
                }
                else 
                {
                    f=0;
                    seek_time += Math.abs(0 - IH);
                    Queue[t+1] = 0;
                    SeekTime[t+1] = seek_time+"";
                    IH = 0;
                    t += 1;
                }
                i--;
                continue;
            }
            visited[pos] = 1;
            seek_time += Math.abs(Q[pos] - IH);
            Queue[t+1] = Q[pos];
            SeekTime[t+1] = seek_time+"";
            IH = Q[pos];
            t += 1;
        }
        return new Object[]{Queue,SeekTime};
    }

}
