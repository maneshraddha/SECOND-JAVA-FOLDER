package com.bridgelabz.util;
import java.io.*;

public class Utility
	{
		BufferedReader br, brfile;
		public Utility() 
			{ 

				br = new BufferedReader(new InputStreamReader (System.in));
			}

	// Reading String
		public String InputString()
			{
				try
					{
						return br.readLine(); // scan the string
					}
				catch (Exception e)
					{
						System.out.println(e);	
					}
				return " ";
			} 
// Reading character
		public char InputChar()
			{
				try
					{

						return (char)br.read();  //scan the character
					}
				catch(Exception e)
					{
						System.out.println(e);
					}
				return ' ';
			

			}	
		// Reading int
		public int InputInt()
			{
				try 
					{

						return Integer.parseInt(br.readLine()); //scan the int
					}
				catch (Exception e)
					{ 
						System.out.println(e);	
					}
				return 0;
			}

// Reading float
    public float InputFloat()
    {
        try 
        {
            return Float.parseFloat(br.readLine()); // scan float
        }
        catch (Exception e)
        { 
            System.out.println(e);	
        }
        return 0;	
    }


		// Reading DOUBLE
		public double InputDouble()
			{
				try 
					{

						return Double.parseDouble(br.readLine()); // scan double
					}
				catch (Exception e)
					{ 
						System.out.println(e);	
					}
				return 0.0;
			}

		//Reading array
		public int[] Array1DIn(int arraysize)
			{
				int [] array=new int[arraysize];

				for(int i=0;i<arraysize;i++)        //enter elements in array
					{
						array[i] = InputInt();
					} 
				return array;      
			}


     // creatig stringarray

     public String[] Array1DString(int arraysize)
			{
				String [] array=new String[arraysize];
				for(int i=0;i<arraysize;i++)                    //enter elements in array
					{
						array[i] = InputString();
					} 
				return array;      
			}
		//Printing array
		public void Print1DArrayIn(int []array)
			{

				for(int i=0;i<array.length;i++)
					{
						System.out.println(array[i]);
					} 
						
	 		}


     //printing string array
      public void Print1DStringArrayIn(String []array)
			{

				for(int i=0;i<array.length;i++)
					{
						System.out.println(array[i]);
					} 
						
	 		}

		// Anagram
		public void Show() throws IOException
			{

				System.out.println("Enter the Strings");

				String s1 = InputString();  // scan 2 strings
				String s2 = InputString();

				int sum=0, sum1=0;
				int a=s1.length();  // take length of 2 strings
				int b=s2.length();
				int []arr=new int[a];
				int []arr1=new int[b];
				if (a==b)
					{
						for(int i=0;i<a;i++)
							{				

								arr[i]=(int)s1.charAt(i); //convert char into ascii string 1
							}

						for(int i=0;i<b;i++)
							{

								arr1[i]=(int)s2.charAt(i); //convert char into ascii string 2
							}
						for(int i=0;i<a;i++)
							{
								sum=sum+arr[i];    // add acii of CHAR IN STRING1
							}
						for(int i=0;i<b;i++)
							{
								sum1=sum1+arr1[i];   //add acii of CHAR IN STRING2
							}
						//System.out.println(sum);
						//System.out.println(sum1);
						if(sum==sum1) // if acii addtion pf both string is equal
							{ 
								System.out.println("Both Strings are anagram");
							}
						else
							System.out.println("not anagram");
				}			
				else 
					System.out.println("not anagram");

		}
	// for Bubblesort
		public void GetData()

		{
				System.out.println("Enter number of elements in array");
				int n=InputInt();
				System.out.println("Enter elements in array");
				int [] arr= Array1DIn(n); // scan array
				int t=0;  // temparary variable
				for(int i=0;i<n-1;i++)
					{ 
						for(int j=0;j<n-1;j++)
							{

								if(arr[j]>arr[j+1]) // if 1st element of array is greater than 2nd then swap
									{ 
										t=arr[j];
										arr[j]=arr[j+1];
										arr[j+1]=t;
									}
							}
				}
				System.out.println("---------------------------------------------------");

				
				Print1DArrayIn(arr); // print array


			}
//bubblesort of string
        public void GetStringData()
			{
				System.out.println("Enter number of elements in  string array");
				int n=InputInt();
				System.out.println("Enter elements in array");
				String [] arr= Array1DString(n); // scan string
				String t=" ";
				for(int i=0;i<n-1;i++)
					{ 
						for(int j=0;j<n-1;j++)
							{
									int a=arr[j].compareTo(arr[j+1]);  //compare 2 strings swap accordingly
									if(a>0)
									{ 
										t=arr[j];
										arr[j]=arr[j+1];
										arr[j+1]=t;
									}
							}
				}
				System.out.println("---------------------------------------------------");
				
				Print1DStringArrayIn(arr);  // print string


			}
		// Creating 2Darray


		public int [][]input2DArray(int row, int column)
			{ 

				System.out.println("give number of rows and column");
				int [][]arr=new int[row][column];
				System.out.println("enter rows and column");
				for(int x=0;x<row;x++)
					{
						for (int j=0;j<column;j++)
							{
								arr[x][j]=InputInt();
							}
					}

				return arr;
			}


     //print2DArray

		public void Print2DArray(int [][]arr)
			{
				int row= arr.length;
				int column= arr[0].length;
				for(int x=0;x<row;x++)
					{
						for (int j=0;j<column;j++)
							{
								System.out.print(arr[x][j] + "\t");
							}
						System.out.println("\n");

					} 
			}
 /// CREATING INSERTION SORT
		public void Insertionsort()
					{
						 System.out.println("Enter number of elements in array");
						int n=InputInt();
						System.out.println("Enter elements in array");
						int [] arr= Array1DIn(n);
						for(int i=1;i<n;i++)
							{
        						int key=arr[i];  // store i th element in seperate variable
 								int j=arr[i-1];  //store i th element in seperate variable
								while(j>0 && arr[j] > key)   // continue till j>0 and j th element is greater than ith
										{
											arr[j+1]=arr[j];
											j=j-1;
										}
								arr[j+1]=arr[j];

 							}
					}
		//Insertion sort for string
		public void InsertionSortString()
			{
				System.out.println("enter number of string you want");
				int n= InputInt();
				System.out.println("enter of string you want");
				String [] arr=Array1DString(n);
				for(int i=1;i<n;i++)
					{
						int j=i-1;
						String key=arr[i];
						//String  s1= arr[j];
					
						while(j>=0 && arr[j].compareTo(key) > 0) 
							{
								
								arr[j+1]=arr[j];	
								j--;
							}	
						arr[j+1]=key;
								
					}

 	
				Print1DStringArrayIn(arr);
				
			} 
	
		// for binary search
		public int binarySearch (int []arr, int n)
			{
				int start=0; //initialize variable
                int end=arr.length-1; // calculate length of array
                while(start <= end)
                {
                    int mid=(start+end)/2; // find of element in array
                    if(n==arr[mid])
                        return arr[mid];
                    else if(n>arr[mid])
                         start=mid+1;
                    else
                    end=mid-1;
              
                } 
                  return -1;              
			}		
	}
