import java.io.*;
import java.lang.*;
 class Flip
	{
		public static void main(String [] args) throws IOException
			{

				BufferedReader br = new BufferedReader(new InputStreamReader (System.in)); // create object of bufferedreader class for scaning
				System.out.println("Enter the number of times coin  flip");
				int i=Integer.parseInt(br.readLine());
				float m=i;
				if (i>0)
					{
						if(m%2==0)
							{
								float c= (m/2)/m;
								float d=1-c;
								System.out.println("Percentage of head is:"+ c);
								System.out.println("Percentage of tail is:"+ d);

							}
						if (i%2!=0)
							{

								System.out.println("If head is in initial position ");

								float n=(((m-1)/2)+1)/m; //calculate %tage
								float k= 1-n;
								System.out.println("Percentage of hrad wiil be:"+ n);
								System.out.println("Precentage of tail will be:"+ k);

								System.out.println("If tail is in initial position ");

								float a=(((m-1)/2)+1)/m;  // calculate %tage
								float b=1-n;
								System.out.println("Percentage of tail wiil be:" + a);
								System.out.println("Precentage of head will be:" + b);
							}

				}
					else 

                                System.out.println("Invalid number);
	}

