package Dessert;

public class IceCream implements Comparable<IceCream> {

  private String name;
  private int calories;

  public IceCream(String name, int calories) {
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
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  @Override
  public int compareTo(IceCream iceCream) {
    return this.getName().compareTo(iceCream.getName());
  }
}