package com.bridgelabz.codes;
import java.lang.*;
import java.io.*;
 class HashNode
    {
        int data;
        HashNode next;

       public int getData ()  //get data
        {
            return data;
        }       
        public HashNode getNext ()  //get next node ka reference
        {
            return next;
        }
        public void setData(int d)  // set data
        {
             data = d;
        }
        public void setNext (HashNode n) // set next node ka reference
        {
            next = n;
        }

    }

