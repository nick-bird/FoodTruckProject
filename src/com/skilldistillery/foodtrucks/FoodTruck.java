package com.skilldistillery.foodtrucks;

public class FoodTruck {
	
	private static int nextTruck = 0;

	private int numID = 0;
	private String name = "";
	private String foodType = "";
	private int rating = 0;
//int numberID, String name, String foodType, int rating
	public FoodTruck() {
//		
	}
	
	
//	public FoodTruck(String name, String foodType, int rating) {
//		this(numberID, name, foodType, rating);
//	}


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


	@Override
	public String toString() {
		return "FoodTruck [numID=" + numID + ", name=" + name + 
				", foodType=" + foodType + ", rating=" + rating + "]";
	}

	
	

}
