package Assignment_1;

import java.util.Scanner;

class flower
{
	String flower;
	int petals;
	float price;
	
	void setFlower(String flower,int petals,float price)
	{
		this.flower = flower;
		this.petals = petals;
		this.price = price;
	}
	String getFlower()
	{
		return flower;
	}
	int getPetals()
	{
		return petals;
	}
	float getPrice()
	{
		return price; 
	}
}
public class A1Q12 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		flower obj = new flower();
		System.out.println("Enter The Details of the Flower");
		System.out.println("Enter Flower Type, Number of Petals and Price of the FLower");
		obj.setFlower(sc.next(), sc.nextInt(), sc.nextFloat());
		System.out.println("The Flower Name is "+obj.getFlower());
		System.out.println("The Flower Price is "+obj.getPrice());
		System.out.println("The Flower has petals = "+obj.getPetals());
	}
}
