package com.bridgelabz.codes;
import com.bridgelabz.util.Utility;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.lang.*;
public class JSONReader
{
    public static void main(String args[])
    {
        
       try 
        {
            
            //creating JSonParser Object it is use to convert a JSON text to a JavaScript object.
		   JSONParser parser = new JSONParser();

           JSONArray array = (JSONArray)parser.parse(new FileReader("JSON.json"));
         
			//calling iterator method on jsonArray object
			Iterator<JSONObject> iterator = array.iterator();

			    //displaying the details of the inventory
			    System.out.println("wt(kg)   Name    price/kg    Total");			
			    while(iterator.hasNext())
			    {
				    JSONObject jsonObject = (JSONObject)iterator.next();	
                     //retriving weight value
				    Long weight = (Long)(jsonObject.get("weight(kg)"));
				    System.out.print(weight +"       ");

				    String name = (String) jsonObject.get("name");
				    System.out.print(name +"      ");
				    //retriving price values
				    Long priceperkg = (Long)jsonObject.get("price/kg");
				    System.out.print(priceperkg + "       ");

				    //printing total value				
				    System.out.print(priceperkg*weight + "    "); 
                    System.out.println(); 					
			    }
            
       }
       catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
