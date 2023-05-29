package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
private static int currentNumberOfTrucks = 1;// everytime constructor is called this must be incrememnted by 1 and assign this number to be the current Id
private int id; 

private String name;
private String foodType;
private double rating;
private static int nextTruckId = 1;


public FoodTruck (String name, String foodType, double rating) {
	this.name = name;
	this.foodType = foodType;
	this.rating = rating;
	this.id = currentNumberOfTrucks++;
	
}


@Override
public String toString() {
	return "FoodTruck [id=" + id + ", name=" + name + ", foodType=" + foodType + ", rating=" + rating + "]";
}


public int getCurrentNumberOfTrucks() {
	return currentNumberOfTrucks;
}


public void setCurrentNumberOfTrucks(int currentNumberOfTrucks) {
	FoodTruck.currentNumberOfTrucks = currentNumberOfTrucks;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getFoodType() {
	return foodType;
}


public void setFoodType(String foodType) {
	this.foodType = foodType;
}


public double getRating() {
	return rating;
}


public void setRating(double rating) {
	this.rating = rating;
}



}