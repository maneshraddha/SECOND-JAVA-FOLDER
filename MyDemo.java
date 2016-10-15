import java.io.*;
import java.lang.*;
class MyDemo
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter the name");
        String s1=br.readLine();
        System.out.println("Hello "+s1+ " How are you????");
    }
}
