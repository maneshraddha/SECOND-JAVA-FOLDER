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
            switch (choice)
            {
                case 1:
                {
                    bo.widraw(choice);
                    break;
                }
                case 2:
                {
                    bo.deposit(choice);
                    break;
                }
                case 3:
                {
                    bo.getBalance(choice);
                    break;
                }     
                case 4:
                {
                    bo.operations(choice);
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
