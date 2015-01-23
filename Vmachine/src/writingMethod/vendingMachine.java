package writingMethod;
import java.util.Scanner;
public class vendingMachine
{
	public static void main(String[] args)
	{
		int number,total4=0, total5=0;
		int total6=0;
		int finalTotal=0;
		int input2=1;
		int finaltotal2=0;
		int product=1;
		Scanner keyboard = new Scanner(System.in); 
		if (product<=5 && product!=0)
		{
			System.out.println("do you want to spend money on your next product");
			System.out.println("enter 0 to stop or enter your product number (1,2,3,4, or 5) to continue");
			product=keyboard.nextInt();
			if (product==0)
			{
				end();//end method will stop the program if zero is entered for the product
			}
			System.out.println("Now to find the cost for product "+product+"?");
			 finalTotal = Cost();//goes to cost method to collect amount user wants to spend
			if (input2==1)
			{//user enters in price for product down below
				System.out.println("how many one dollar bills does it cost?");
				number = keyboard.nextInt();
				int amount4=number*100; 
				total4=total4+amount4;
				vendingMachine(total4);
				System.out.println("how many five dollar bills does it cost?");
				number = keyboard.nextInt();
				int amount5=number*500;
				total5=total5+amount5;
				vendingMachine(total5);
				System.out.println("how much change does it cost?");
				int amount6 = keyboard.nextInt();
				total6=total6+amount6;
				vendingMachine(total6);

				finaltotal2 = total4+total5+total6;
				System.out.println("you're spending "+finaltotal2+" cents");

				System.out.println("do you want to keep adding money?");
				System.out.println("enter 1 for yes 2 for no and 0 to cancel");
				input2=keyboard.nextInt();
				if (input2==0)
				{
					System.out.println("you just got your money back and can start over");
					start();//start method can bring user back to the main method if zero is entered
				}
			}
			System.out.println("your change is "+(finalTotal-finaltotal2)+" cents");
			vendingMachine(finalTotal-finaltotal2);//change is given here
			product++;
		}
	}
	public static void start()
	{
		main(null);
	}
	private static void end() 
	{
		System.exit(0);
	}
	private static int Cost()
	{
		int number,input=1,total=0, total2=0, total3=0 /*total4=0, total5=0*/;
		int finalTotal=0;
		Scanner keyboard = new Scanner(System.in); 
		if (input==1)
		{
			System.out.println("how many one dollar bills do you want to spend?");
			number = keyboard.nextInt();
			int amount=number*100;
			total=total+amount;
			vendingMachine(total);

			System.out.println("how many five dollar bills do you want to spend?");
			number = keyboard.nextInt();
			int amount2=number*500;
			total2=total2+amount2;
			vendingMachine(total2);

			System.out.println("how much change do you want to spend?");
			int amount3 = keyboard.nextInt();
			total3=total3+amount3;
			vendingMachine(total3);

			finalTotal=total+total2+total3;
			System.out.println("your item is worth "+finalTotal+" cents");
			System.out.println("do you want to keep adding money?");
			System.out.println("enter 1 for yes and 2 for no and 0 to cancel.");
			input=keyboard.nextInt();
			if (input==0)
			{
				end();
			}
		}
		return finalTotal;
	}
	private static void vendingMachine(int amount)
	{//algorithm to get any amount of money in change
		int originalAmount,quarters, dimes, nickels, pennies; 
		originalAmount = amount;       
		quarters = amount / 25;     
		amount = amount % 25;     
		dimes = amount / 10;       
		amount = amount % 10;      
		nickels = amount / 5;      
		amount = amount % 5;       
		pennies = amount;
		System.out.println(originalAmount +" cents in coins can be given as:");      
		System.out.println(quarters + " quarters");   
		System.out.println(dimes + " dimes");     
		System.out.println(nickels + " nickels and"); 
		System.out.println(pennies + " pennies");		
	}
}