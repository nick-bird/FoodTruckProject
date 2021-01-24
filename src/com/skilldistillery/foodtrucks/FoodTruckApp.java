package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {
	static Scanner kb = new Scanner(System.in);
	private static boolean keepAdding = true;

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		FoodTruck[] trucks = new FoodTruck[5];
		trucks = app.addTruck();

		boolean keepMenu = true;
		System.out.println();
		while (keepMenu) {
			System.out.println("Please use a number to select from the following menu items, or type 'quit' to exit: ");
			System.out.println("1. List all food trucks");
			System.out.println("2. Show average rating of trucks");
			System.out.println("3. Show highest rated truck");
			String menuSelection = "";
			menuSelection = kb.nextLine();
			switch (menuSelection) {
			case "1":
				System.out.println();
				app.printTrucks(trucks);
				break;
			case "2":
				app.printAverageRating(trucks);
				break;
			case "3":
				app.printHighestRating(trucks);
				break;
			case "quit":
				keepMenu = false;
				break;
			}

		}

	}
//looped method that calls create truck method, and stores new food truck in an array, with a 'break;' for if the user types 'quit'
	public FoodTruck[] addTruck() {
		FoodTruck[] allTrucks = new FoodTruck[5];
		for (int i = 0; i < 5; i++) {

			allTrucks[i] = createFoodTruck();

			if (keepAdding == false) {
				break;
			}

		}
		return allTrucks;

	}
// allows user to create food truck and assign values to fields, with a 'break;' for if user types 'quit'
	public FoodTruck createFoodTruck() {

		FoodTruck newTruck = new FoodTruck();
		boolean keepCreating = true;
		while (keepCreating) {
			System.out.print("Please enter name of foodtruck (or if you have entered all trucks type 'quit'): ");
			newTruck.setName(kb.nextLine());
			if (newTruck.getName().equals("quit")) {
				keepAdding = false;
				break;
			} else {
				System.out.print("Please enter type of food: ");
				newTruck.setFoodType(kb.nextLine());
				System.out.print("Please enter a rating between 1-10: ");
				newTruck.setRating(kb.nextInt());
				kb.nextLine();
				break;
			}

		}
		return newTruck;
	}
	public void printTrucks(FoodTruck[] trucks) {

		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i].getName().equals("quit")) {
				break;
			}
			System.out.println(trucks[i].toString());
		}
		System.out.println();
	}

	public void printHighestRating(FoodTruck[] trucks) {
		int count = 0;
		int highestRating = 0;
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i].getRating() == 0) {
				break;
			}
			if (trucks[i].getRating() > highestRating) {
				highestRating = trucks[i].getRating();
				count = i;
			}

		}
		System.out.println("The highest rated Food Truck: ");
		System.out.println(trucks[count].toString());
		System.out.println();
	}

	public void printAverageRating(FoodTruck[] trucks) {
		double average = 0;
		int divisor = 0;
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i].getName().equals("quit")) {
				break;
			}
			average += trucks[i].getRating();
			divisor++;
		}
		average = average / divisor;
		System.out.printf("The average rating of Food Trucks is: %.2f", average);
		System.out.println();
	}
}
