package com.bridgelabz.codes;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class InventoryManager
{
    String nameofinventory;
    Long weightofinventory;
    Long priceofinventory;
    public static void main(String args[]) throws ParseException
    {
        try
        {
            JSONParser parser = new JSONParser();
            JSONArray array = (JSONArray)parser.parse(new FileReader("JSON.json"));
            Iterator<JSONObject> iterator = array.iterator();
            Iterator<JSONObject> iterator1 = array.iterator();
            //displaying inventory details
            System.out.println("Details of inventory manager");
            System.out.println("weight(kg)   name     price/kg   total");
            //ArrayList<InventoryManager> al = new ArrayList<InventoryManager>();
            while(iterator.hasNext())
            {
                JSONObject obj = (JSONObject) iterator.next();
                InventoryManager im = new InventoryManager();
                im.weightofinventory = (Long) (obj.get("weight(kg)"));      //retrive data weight
                System.out.print(im.weightofinventory + "           ");
                im.nameofinventory = (String) (obj.get("name"));            //retrive name
                System.out.print(im.nameofinventory + "      ");
                im.priceofinventory = (Long) (obj.get("price/kg"));         //retrive price
                System.out.print(im.priceofinventory + "      ");
                System.out.println(im.weightofinventory * im.priceofinventory);    //give total price
                System.out.println();
            } 
            System.out.println("JSON objects");
            while(iterator1.hasNext())          //create objects of json
            {
                JSONObject obj = (JSONObject) iterator1.next();
                System.out.println(obj.toString());
            } 
     
        }
        catch(FileNotFoundException e )
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
    public String toString()    
        {
            //System.out.println("shraddh:"); 
           return "weight:" +  this.weightofinventory+ "name:" + this.weightofinventory + "price/kg" + this.priceofinventory;
        }
}
