package com.bridgelabz.codes;
import java.io.*;
import com.bridgelabz.util.Utility;
import com.bridgelabz.codes.BankingOperation;
class BankingCashCounter
{
    public static void main(String args[])
    {
        Utility u = new Utility();
        BankingOperation bo = new BankingOperation();
        int choice;
        boolean check = true;

        while(check)
        {
            System.out.println("Plz enter 1. for widraw 2. for deposit 3. for get balance 4. for number of operations  5. for exit ");
            choice = u.InputInt();
            //select any choice you want from given options
            switch (choice)
            {
                case 1:
                {
                    bo.widraw(choice);      //call widraw mwthod
                    break;
                }
                case 2:
                {
                    bo.deposit(choice);     //call deposit method
                    break;
                }
                case 3:
                {
                    bo.getBalance(choice);  //balance in account
                    break;
                }     
                case 4:
                {
                    bo.operations(choice);      //number of opearations
                    break;
                } 
                case 5:
                {
                     System.out.println("Exit");
                    check = false;
                    break;
                }  
                default:
                {
                    System.out.println("Entered wrong choice");
                    break;
                }        
            }    
        }
    }
}
