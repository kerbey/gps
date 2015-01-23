import java.util.Random;
public class Gps 
{
	public static void main(String[] args)
	{
		int minutes=0, Location=0;
		System.out.println("intial location");
		int x=0,y=0;
		System.out.println("("+x+","+y+")");
		for (;minutes<=60;)
		{
			minutes=minutes+5;
			System.out.println("we are now "+minutes+" minutes in");
			Location=Location+newLocation(x,y);
		}
		System.out.println("Total mileage this hour is "+Location);		
	}
	public static int newLocation(int x, int y)
	{
		Random dice= new Random();
		int NewX=dice.nextInt(200);
		int NewY=dice.nextInt(200);
		NewX=NewX-100;
		NewY=NewY-100;
		if (NewX>=0 && NewY>=0)
		{
			System.out.println("("+NewX+","+NewY+")");
			System.out.println("go east "+NewX+" miles and north "+NewY+" Miles");
			if (NewX<0)
			{
				x=x+(-NewX);
			}
			else
			{
				x=x+NewX;
			}
			if (NewY<0)
			{
				y=y+(-NewY);
			}
			else
			{
				y=y+NewY;
			}
			System.out.println("Distance traveled for this time is "+(x+y));
		}
		else if (NewX>=0 && NewY<=0)
		{
			System.out.println("("+NewX+","+NewY+")");
			System.out.println("go east "+NewX+" miles and south "+(-NewY)+" Miles");
			if (NewX<0)
			{
				x=x+(-NewX);
			}
			else
			{
				x=x+NewX;
			}
			if (NewY<0)
			{
				y=y+(-NewY);
			}
			else
			{
				y=y+NewY;
			}
			System.out.println("Distance traveled for this time is "+(x+y));
		}
		else if (NewX<=0 && NewY>=0)
		{
			System.out.println("("+NewX+","+NewY+")");
			System.out.println("go west "+(-NewX)+" miles and north "+NewY+" Miles");
			if (NewX<0)
			{
				x=x+(-NewX);
			}
			else
			{
				x=x+NewX;
			}
			if (NewY<0)
			{
				y=y+(-NewY);
			}
			else
			{
				y=y+NewY;
			}
			System.out.println("Distance traveled for this time is "+(x+y));
		}
		else if (NewX<=0 && NewY<=0)
		{
			System.out.println("("+NewX+","+NewY+")");
			System.out.println("go west "+(-NewX)+" miles and south "+(-NewY)+" Miles");
			if (NewX<0)
			{
				x=x+(-NewX);
			}
			else
			{
				x=x+NewX;
			}
			if (NewY<0)
			{
				y=y+(-NewY);
			}
			else
			{
				y=y+NewY;
			}
			System.out.println("Distance traveled for this time is "+(x+y));
		}
		System.out.println();
		x=x+y;
		return x;
	}
}