import java.io.*;
import java.lang.*;
class Power
{
    public static void main(String [] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));      //create object of bufferedRader
        System.out.println("Give power of 2");
        int n = Integer.parseInt(br.readLine());
        int []arr=new int[35];
        int sum=1;
        if(n>0 && n<=31)
        {
            arr[0] = 1;
            for(int i=1; i<n;i++)
            {
                sum= 2*sum;     //store powers of 2 in array
                arr[i]=sum;
            }
            System.out.println("values are "); 
            for(int i=0; i<n;i++)
            {
        
                System.out.println(arr[i]); 
            }
        }
        else 
            System.out.println("Invalid");
    }
}
