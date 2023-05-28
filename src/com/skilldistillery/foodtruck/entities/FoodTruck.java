package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
private static int currentNumberOfTrucks;// everytime constructor is called this must be incrememnted by 1 and assign this number to be the current Id
private int id; 

private String name;
private String foodType;
private double rating;





public FoodTruck() {
	FoodTruck.currentNumberOfTrucks++;
	id = FoodTruck.currentNumberOfTrucks;
}


public FoodTruck (String name, String foodType, double rating) {
	this.name = name;
	this.foodType = foodType;
	this.rating = rating;
	
}








}
