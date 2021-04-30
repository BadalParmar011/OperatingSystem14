package Algorithms;

public class FCFS {
    
    public Object[] FCFS(int[] Q,int IH){
        int seek_time=0;
        
        String SeekTime[]= new String[Q.length+1];
        SeekTime[0] = "0";
        
        int Queue[]= new int[Q.length+1]; 
        Queue[0] = IH;
        
        for(int i = 0;i<Q.length;i++){
            Queue[i+1] = Q[i];
        }
        
        for(int i=1;i<Queue.length;i++)
        {
            IH = Math.abs(IH - Queue[i]);
            seek_time+=IH;
            SeekTime[i] = seek_time+"";
            IH = Queue[i];
        }
        return new Object[]{Queue,SeekTime};
    }    
}

