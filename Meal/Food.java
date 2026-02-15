package meal;


public class Food implements Comparable<Food> {

  private String name;
  private int calories;

  public Food(String name, int calories) {
    this.name = name;
    this.calories = calories;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCalories() {
    return this.calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  @Override
  // comparing the calories of two food items, in descending order
  public int compareTo(Food food) {
    return food.getCalories() - this.getCalories();
  }

  

}