package Meal;

import java.util.ArrayList;

public class Meal {

  public static void main(String[] args) {

    Food burger = new Food("Big Mac", 400);
    Food fries = new Food("French fries", 250);
    Food cheesburger = new Food("Cheeseburger", 300);
    Food sunday = new Food("Chocolate", 175);

    ArrayList<Food> lunch = new ArrayList<>();

    lunch.add(cheesburger);
    lunch.add(fries);
    lunch.add(burger);
    lunch.add(sunday);

    System.out.println("Voici les aliments de votre repas :");
    for (Food food : lunch) {
      System.out.println("- " + food.getName() + " : " + food.getCalories() + " calories");
    }

    System.out.println("Voici les aliments de votre repas :");
    for (int i = 0; i < lunch.size(); i++) {
      Food food = lunch.get(i);
      System.out.println("- " + food.getName() + " : " + food.getCalories() + " calories");
    }

    Food complement = lunch.get(1);

    System.out.println(
        "Voici le complément de votre repas : " + complement.getName() + " (" + complement.getCalories()
            + " calories).");

    lunch.remove(1);

    Food secondFood = lunch.get(1);

    System.out.println(
        "Voici le second aliment de votre repas : " + secondFood.getName() + " (" + secondFood.getCalories()
            + " calories).");

    Food milkshake = new Food("Vanilla Milkshake", 200);

    lunch.set(2, milkshake);
    Food dessert = lunch.get(2);

    System.out.println(
        "Voici le dessert de votre repas : " + dessert.getName() + " (" + dessert.getCalories() + " calories).");

    lunch.clear();

    System.out.println("Voici les aliments de votre repas :");
    for (Food food : lunch) {
      System.out.println("- " + food.getName() + " : " + food.getCalories() + " calories");
    }
  }

}