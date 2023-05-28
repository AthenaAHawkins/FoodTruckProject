package com.skilldistillery.foodtruck.app;

import java.util.Arrays;
import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private static FoodTruck[] fleet;

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		Scanner scan = new Scanner(System.in);
//		app.run();

		fleet = new FoodTruck[5];

		for (int truckNum = 0; truckNum < fleet.length; truckNum++) {
			System.out.println("What is the food truck name? (Enter 'quit' to stop entering trucks)");
			String truckName = scan.nextLine();
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("What type of food does the truck serve?");
			String truckType = scan.nextLine();
			System.out.println("What is the trucks rating?");
			double truckRating = scan.nextDouble();
			FoodTruck truck = new FoodTruck(truckName, truckType, truckRating);
			fleet[truckNum] = truck;
			scan.nextLine();
		}
		
		app.menu();
		
		
		
		

	}

	public void menu() {
		System.out.println("****************** MENU ******************");
		System.out.println("1. List all existing food trucks");
		System.out.println("2. See the average rating of food trucks");
		System.out.println("3. Display the highest-rated food truck");
		System.out.println("4. Quit the program");
	}
	
	public double averageRating(double trucksum) {
		double sum = 0;
		double avg = 0;
		for (FoodTruck truckRating : fleet) {
			sum += trucksum;
		}
		avg = sum / fleet.length;
		return avg;
		
	}
	
	
	
	

	@Override
	public String toString() {
		return "FoodTruckApp [fleet=" + Arrays.toString(fleet) + "]";
	}

}

//	public void run() {
//	}
