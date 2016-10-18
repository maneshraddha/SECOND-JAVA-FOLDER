package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;

 
class VendingMachine
{
    public void  numberOfNotes(int rupees)
    {
         int count=0;
        //int []arr = new int[];
        int arr[] = {1000, 500, 100, 10,50, 5, 1}; //create array of notes
        int []arr1 = new int[arr.length];       //create array to store number of notes

        for(int i = 0; i<arr.length; i++)
        {
            if(rupees == 0)
                break;
            arr1[i]=rupees / arr[i];       // store number of given notes in array
            rupees = rupees % arr[i];       //take the remainder 
            count++;
        }

        for(int i=0; i<arr.length;i++)
        {
            System.out.println("Notes of "+ arr[i] +" is " + arr1[i]);      //print number of notes
        }  
    }

    public static void main(String args[])
    {
        Utility u = new Utility();
        //Calculate cal = new Calculate();
        System.out.println("Enter Rupees you want");
        int rupees = u.InputInt();
        
        VendingMachine v =new  VendingMachine();
        v.numberOfNotes(rupees);
    }
}
