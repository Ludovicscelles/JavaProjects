package Dessert;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class Dessert {

  public static void main(String[] args) {

    IceCream chocolate = new IceCream("Chocolate", 175);
    IceCream vanilla = new IceCream("Vanilla", 200);
    IceCream strawberry = new IceCream("Strawberry", 150);
    IceCream stracciatella = new IceCream("Stracciatella", 180);
    IceCream caramel = new IceCream("Caramel", 190);
    IceCream pistachio = new IceCream("Pistachio", 160);
    IceCream coconut = new IceCream("Coconut", 170);
    IceCream cherry = new IceCream("Cherry", 155);

    HashSet<IceCream> desserts = new HashSet<>();

    desserts.add(caramel);
    desserts.add(chocolate);
    desserts.add(vanilla);
    desserts.add(stracciatella);
    desserts.add(pistachio);
    desserts.add(strawberry);
    desserts.add(cherry);
    boolean addCoconut = desserts.add(coconut);
    boolean addAgain = desserts.add(coconut);

    System.out.println();
    System.out.println("Veuillez trouver ci-dessous la liste de nos glaces : ");
    showDessertsList(desserts);

    System.out.println();
    System.out.println(addCoconut);
    System.out.println(addAgain);

    boolean removeStrawberry = desserts.remove(strawberry);
    boolean removeAgain = desserts.remove(strawberry);

    System.out.println();
    System.out.println(removeStrawberry);
    System.out.println(removeAgain);

    System.out.println();
    System.out.println("Veuillez trouver ci-dessous la liste mise à jour de nos glaces : ");
    showDessertsList(desserts);

    LinkedHashSet<IceCream> newIceCreams = new LinkedHashSet<>();
    IceCream mango = new IceCream("Mango", 165);
    IceCream blueberry = new IceCream("Blueberry", 155);
    IceCream lemon = new IceCream("Lemon", 140);
    IceCream raspberry = new IceCream("Raspberry", 150);
    IceCream peach = new IceCream("Peach", 145);
    IceCream watermelon = new IceCream("Watermelon", 130);
    IceCream passionFruit = new IceCream("Passion Fruit", 135);
    IceCream lychee = new IceCream("Lychee", 120);

    newIceCreams.add(lychee);
    newIceCreams.add(mango);
    newIceCreams.add(passionFruit);
    newIceCreams.add(raspberry);
    newIceCreams.add(peach);
    newIceCreams.add(lemon);
    newIceCreams.add(watermelon);
    newIceCreams.add(blueberry);

    System.out.println();
    System.out.println("Veuillez découvrir nos nouveaux parfums de glaces : ");
    showNewIceCreamsList(newIceCreams);

    TreeSet<IceCream> treeIceCreams = new TreeSet<>();
    treeIceCreams.add(lychee);
    treeIceCreams.add(mango);
    treeIceCreams.add(coconut);
    treeIceCreams.add(caramel);
    treeIceCreams.add(stracciatella);
    treeIceCreams.add(passionFruit);
    treeIceCreams.add(peach);
    treeIceCreams.add(vanilla);
    treeIceCreams.add(cherry);
    treeIceCreams.add(chocolate);
    treeIceCreams.add(pistachio);
    treeIceCreams.add(watermelon);
    treeIceCreams.add(blueberry);
    treeIceCreams.add(lemon);

    System.out.println();
    for (IceCream iceCream : treeIceCreams) {
      System.out.println(iceCream.getName());
    }

    IceCream first = treeIceCreams.first();
    IceCream last = treeIceCreams.last();

    System.out.println();
    System.out.println(
        "Nos parfums de glaces sont classés par ordre alphabétique." + "Le premier parfum de glace est : "
            + first.getName() + " et le dernier parfum de glace est : "
            + last.getName());
    System.out.println();

    IceCream firstIceCream = treeIceCreams.pollFirst();
    IceCream lastIceCream = treeIceCreams.pollLast();

    boolean containFirst = treeIceCreams.contains(firstIceCream);
    boolean containLast = treeIceCreams.contains(lastIceCream);

    System.out.println(containFirst);
    System.out.println(containLast);
    System.out.println();

    for (IceCream iceCream : treeIceCreams.descendingSet()) {
      System.out.println(iceCream.getName());
    }

    System.out.println();

    for (IceCream iceCream : treeIceCreams.subSet(coconut, mango)) {
      System.out.println(iceCream.getName());
    }

    System.out.println();

  }

  private static void showDessertsList(Set<IceCream> desserts) {
    for (IceCream dessert : desserts) {
      System.out.println(" -" + dessert.getName() + " : " + dessert.getCalories());
    }
  }

  private static void showNewIceCreamsList(Set<IceCream> newIceCreams) {
    for (IceCream newIceCream : newIceCreams) {
      System.out.println(" -" + newIceCream.getName() + " : " + newIceCream.getCalories());
    }
  }
}