package com.skilldistillery.foodtrucks;

public class FoodTruck {
	private static int trucksAdded = 0;
	private int numID = 0;
	private String name = "";
	private String foodType = "";
	private int rating = 0;
//increments static int in constructor, and assigns it to the new truck
	public FoodTruck() {
		trucksAdded++;
		setNumID(trucksAdded);
	}

	public int getNumID() {
		return numID;
	}

	public void setNumID(int numID) {
		this.numID = numID;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	public String toString() {
		String s = "Number ID: " + this.getNumID() + " Name: " + this.getName() + " Food Type: "
				+ this.getFoodType() + " Rating: " + this.getRating();
				return s;
	}
}
