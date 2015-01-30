/*Program starts at the main where the initial location (0,0) is given. Then it goes into the for loop where it increments the
 minutes from 5 to 60 by adding 5. While it adds minutes the random number generator gives NewX the numbers 0(north), 1(south), 
 2(east), 3(west). Each new number adds five to either the x(east or west) or y(north or south) miles until it hits 60 miles 
 in 60 minutes. Then at the end it takes the total distance of NewX and NewY which should equal to the square root of
  (x1-x2)^2 + (y1-y2)^2.
 */
import java.util.Random;
public class Gps 
{ 
	public static void main(String[] args)
	{
		System.out.println("intial location");
		int x=0,y=0;
		System.out.println("("+x+","+y+")");
		for (int minutes=5; minutes<=60; minutes=minutes+5)
		{
			System.out.println("we are now "+minutes+" minutes in");

			double RandomNumber=(int)(Math.random()*4);
			double NewX=RandomNumber;
			if (NewX==0)
			{
				y=y+5;
				System.out.println("go north "+5+" Miles");
				System.out.println("("+x+","+y+")");
			}
			else if (NewX==1)
			{
				y=y+5;
				System.out.println("go south "+5+" Miles");
				System.out.println("("+(-x)+","+y+")");
			}
			else if (NewX==2)
			{
				x=x+5;
				System.out.println("go east "+5+" Miles");	
				System.out.println("("+x+","+y+")");
			}
			else if (NewX==3)
			{
				x=x+5;
				System.out.println("go west "+5+" miles");
				System.out.println("("+x+","+(-y)+")");
			}
			System.out.println();
		}
		int Location=((x*x)+(y*y));
		System.out.println("Total mileage this hour is "+Math.pow(Location,.5));		
	}
}
