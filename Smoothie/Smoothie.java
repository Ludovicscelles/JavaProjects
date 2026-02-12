package Smoothie;

public class Smoothie {
  private final Liquid liquid;
  private final Fruit[] fruits;

  public Smoothie(Liquid liquid, Fruit[] fruits) {
    this.liquid = liquid;
    this.fruits = fruits;
  }

  public Liquid getLiquid() {
    return liquid;
  }

  public Fruit[] getFruits() {
    return fruits;
  }

  @Override
  public String toString() {
    String eachFruit = "";
    for (int i = 0; i < fruits.length; i++) {
      eachFruit += fruits[i].getName();
      if (i < fruits.length - 1) {
        eachFruit += ", ";
      }
    }

    return "Smoothie with " + liquid.getName() + " and fruits: " + eachFruit;
  }
}