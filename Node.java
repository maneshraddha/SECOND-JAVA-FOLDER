package com.bridgelabz.codes;
import java.lang.*;
import java.io.*;
 class Node
    {
        String data;
        Node next;

       public String getData ()  //get data
        {
            return data;
        }       
        public Node getNext ()  //get next node ka reference
        {
            return next;
        }
        public void setData(String d)  // set data
        {
             data = d;
        }
        public void setNext (Node n) // set next node ka reference
        {
            next = n;
        }

    }

