//John Rosar
//COSC1437
//Lab3 part 2


import java.util.Scanner;

public class SavingMoney_Rosar {
	public static void main(String[] args)
	{
		//declaring variables
		String name,acctNumber;
		float inMoney, intRate;;
		
		//sc is scanner object
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your name:");
		name = sc.nextLine(); 
		System.out.println("Enter your Account Number:");
		acctNumber = sc.nextLine();
		System.out.println("Enter your Current Balance:");
		inMoney = sc.nextFloat(); 
		sc.nextLine();
		System.out.println("Enter your Interest Rate:");
		intRate = sc.nextFloat(); 
		sc.nextLine();
		
		 //creating object for Customer_Rosar
		Customer_Rosar object = new Customer_Rosar(name,acctNumber,inMoney,intRate);
		System.out.println(object);
		  System.out.println("-------------------------------------------");
		System.out.format("Total Saving Money:\t\t%.2f",object.calTotal()); 

		  }
		}