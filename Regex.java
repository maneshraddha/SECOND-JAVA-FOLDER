package com.bridgelabz.codes;
import com.bridgelabz.util.Utility;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
class Regex
{
    public static void main(String args[])
    {
        Utility u = new Utility();
        File file = new File("message.txt");
        String messege = u.readFile(file);          //take text file in string
        String firstname=null, phonenumber;
        System.out.println("Enter the full name");
        String fullname = u.InputString();          //scan the name
        boolean checkname = Pattern.matches("[A-Z][A-z a-z]*[\\s][A-Z][A-Za-z]*", fullname);        //check name is valid or not
        if(checkname)           //check name is valid or not
        {
            String name[] = fullname.split(" ");        //store 1st name in varoable
            firstname = name[0];
        }
        else
        {
            System.out.println("incorrect format");     //else exit the code
            System.exit(0);
        }
        System.out.println("enter the phone number");
        phonenumber = u.InputString();                  //scan the number
        boolean checknumber = Pattern.matches("[789]{1}[\\d]{9}", phonenumber);
        if(!checknumber)        //check if valid
        {
            System.out.println("wrong number plz enter another");
            System.exit(0);         //else exit
        }
        DateFormat dateformat = new SimpleDateFormat();         //object of DateFormat method
        String date = dateformat.format(new Date());            //take date in  string
        //replace corresponding string        
        messege = messege.replace("<<name>>", firstname);
        messege = messege.replace("<<full name>>", fullname);
        messege = messege.replace("91-xxxxxxxxxx.", phonenumber);
        messege = messege.replace("XX/XX/XXXX.", date);
        System.out.println("\n\n" +messege);
    }
}
