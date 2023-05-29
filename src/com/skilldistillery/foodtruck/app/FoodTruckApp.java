package com.skilldistillery.foodtruck.app;

import java.util.Arrays;
import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private FoodTruck[] fleet = new FoodTruck[5];
	private int currentNumberOfTrucks=0;

	public void run() {
		Scanner scan = new Scanner(System.in);

		for (int truckNum = 0; truckNum < fleet.length; truckNum++) {
			System.out.println("What is the food truck name? (Enter 'quit' to stop entering trucks)");
			String truckName = scan.nextLine();
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			}
			{
				System.out.println("What type of food does the truck serve?");
			}
			String truckType = scan.nextLine();
			System.out.println("What is the trucks rating?");
			double truckRating = scan.nextDouble();
			scan.nextLine();
			FoodTruck truck = new FoodTruck(truckName, truckType, truckRating);
			fleet[truckNum] = truck;
			currentNumberOfTrucks++;
			

		}
		boolean askAgain = true;
		while(askAgain)
		{
			menu();
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("All trucks currently stached are: ");
				allExistingFoodTrucks();
				break;
			case 2:
				System.out.println("The average rating is: ");
				System.out.println(averageRating());
				break;
			case 3:
				System.out.println("The highest rated food truck is: ");
				System.out.println(highestRated());
				break;
			case 4:
				askAgain = false;
				break;
			default:
				System.out.println("Improper input, try again");
			}
		}
	}

	public void menu() {

		System.out.println("****************** MENU ******************");
		System.out.println("1. List all existing food trucks");
		System.out.println("2. See the average rating of food trucks");
		System.out.println("3. Display the highest-rated food truck");
		System.out.println("4. Quit the program");
	
	}

	public double averageRating() {
		double sum = 0;
		double avg = 0;
		for (int index = 0; index < fleet.length; index ++) {
			if (fleet[index] != null) {
				sum += fleet[index].getRating();
			}
		}
		avg = sum / currentNumberOfTrucks;
		return avg;

	}

	public void allExistingFoodTrucks() {
		System.out.println("All trucks currently stored are: ");
		for(int index = 0; index < fleet.length; index ++) {
			if( fleet[index] != null ) {
				System.out.println(fleet[index].toString());
			}
		}
			
		}
		
	public double highestRated() {
		double maxNum = 0;
		for (int index = 0; index < fleet.length; index++) {
			if(fleet[index] != null) {
			if (fleet[index].getRating() > maxNum) {
			maxNum = fleet[index].getRating();
		}
			}
		}
		return maxNum;
	}

	@Override
	public String toString() {
		return "FoodTruckApp [fleet=" + Arrays.toString(fleet) + "]";
	}

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();

	}

}
