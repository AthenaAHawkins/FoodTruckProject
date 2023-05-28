package com.skilldistillery.foodtruck.app;

import java.util.Arrays;
import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private static FoodTruck[] fleet = new FoodTruck[5];

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
			FoodTruck truck = new FoodTruck(truckName, truckType, truckRating);
			fleet[truckNum] = truck;
			scan.nextLine();

		}
		menu();
		int choice = scan.nextInt();
		boolean askAgain = true;
		while(askAgain)
		{
			switch (choice) {
			case 1:
				allExistingFoodTrucks();
				break;
			case 2:
				averageRating();
				break;
			case 3:
				allExistingFoodTrucks();
				break;
			case 4:
				askAgain = false;
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
		double count = 0;
		double avg = 0;
		for (FoodTruck truck : fleet) {
			if (truck != null) {
				sum += truck.getRating();
				count++;
			}
		}
		avg = sum / fleet.length;
		return avg;

	}

	public void allExistingFoodTrucks() {
		System.out.println("All trucks currently stored are: ");
		if( ) {
			
		}
		
	}

//	public double highestRated() {
//		for (FoodTruck foodTruck : fleet) {
//			
//		}

	@Override
	public String toString() {
		return "FoodTruckApp [fleet=" + Arrays.toString(fleet) + "]";
	}

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();

	}

}
