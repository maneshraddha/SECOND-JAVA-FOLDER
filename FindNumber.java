package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
    class Calculate
        {
            int Powerof2(int n)
                {
                    int sum=1;
                    for(int i=0;i<=n;i++)
                        {
                            sum=sum*2;
                        }
                return sum;
        }
    int binarysearch(int k, int sum)
        {
            int []arr = new int[sum];
            for(int i=0;i<sum;i++)
                {
                    arr[i]=i;
                }
            int start=0;
            int end=sum-1;
            while(start<=end)
                {
                    int mid=(start+end)/2;
                    if(arr[mid]==k)
                    return arr[mid];
                    else if(k>arr[mid])
                    start = mid+1;
                    else
                    end = mid-1;
                }
            return -1;  
        }
}

    class FindNumber
        {
            public static void main(String []args)
                {
                    Utility u = new Utility();
                    Calculate c= new Calculate();
                    System.out.println("enter the number");
                    int n=u.InputInt();
                    int sum = c.Powerof2(n);
                    System.out.println("enter the number u want to find");
                    int k=u.InputInt();
                    int ans=c.binarysearch(k,sum);
                    if(ans==(-1))
                    System.out.println("Number not found");
                    else 
                    System.out.println("NUmber is " + ans);
                }
       }
