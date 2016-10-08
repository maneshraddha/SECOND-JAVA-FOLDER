import java.io.*;
import java.lang.*;
 class Harmonic
	{
		public static void main(String [] args) throws IOException
			{
				BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
				System.out.println("Enter the number");
				int n=Integer.parseInt(br.readLine());
				float sum=0;
				for(int i=1;i<=n;i++)
					{

						sum=sum + (1.0f/i); //1.0f taken bcoz of float
	

					}

				System.out.println("Value is:" + sum);

			}
	}

