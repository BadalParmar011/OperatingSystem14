package Algorithms;

public class SSTF {
    public Object[] SSTF(int[] Q,int IH)
    {
        int Queue[] = new int[Q.length+1];
        Queue[0]=IH;
        
        String SeekTime[] = new String[Q.length+1];
        SeekTime[0] = "0";
        
        int seek_time=0,n = Q.length;
        int[] visited = new int[n+1];

        for(int i=0;i<n;i++)
        {
            int min = 100000;
            int pos = 0;
            for(int j=0;j<n;j++)
            {
                if(Math.abs(Q[j] - IH) < min)
                {
                    if(visited[j]==0)
                    {
                        min = Math.abs(Q[j] - IH);
                        pos = j;
                    }
                }
            }
            visited[pos]=1;
            seek_time += Math.abs(Q[pos] - IH);
            Queue[i+1] = Q[pos];
            SeekTime[i+1] = seek_time+"";
            IH = Q[pos];
        }

        return new Object[]{Queue, SeekTime};
    }

}
