package smoothie;

public class Blender {

  public static Smoothie blender(Liquid liquid, Fruit... fruits) {
    return new Smoothie(liquid, fruits);
  }

  public static void main(String[] args) {
    Smoothie mySmoothie = blender(new Liquid("Milk"), new Fruit("Banana"), new Fruit("Strawberry"),
        new Fruit("Cherry"));

    System.out.println(mySmoothie);
  }

}