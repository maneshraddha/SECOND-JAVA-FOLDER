package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
class StopWatch
{

    public long startTime()
    {
        long starttime = System.currentTimeMillis(); // get start time
        return starttime;
    }
    public long endTime()
    {
        long endtime = System.currentTimeMillis(); // get end time
        return endtime;
    }

    public void elapsedTime( long endtime, long starttime)  //measure the difference of start time and end time
    {
        long difference = endtime - starttime;
        System.out.println(difference + "milliseconds");	
    }
}
class Stop
{
    public static void main(String[]args)
    {
        Utility u = new Utility();
        StopWatch s= new StopWatch();
        int n = u.InputInt();
        long a = s.startTime();
        int k = u.InputInt();
        long b = s.endTime();
        s.elapsedTime(b, a);
    }
}

