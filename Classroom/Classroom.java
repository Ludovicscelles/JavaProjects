package Classroom;

public class Classroom {

  public static void main(String[] args) {

    Wilder david = new Wilder("David", false);

    Wilder tania = new Wilder("Tania", true);

    Wilder jimmy = new Wilder("Jimmy", true);

    Wilder sofia = new Wilder("Sofia", false);

    String introduceDavid = david.whoAmI();
    String introduceTania = tania.whoAmI();
    String introduceJimmy = jimmy.whoAmI();
    String introduceSofia = sofia.whoAmI();

    System.out.println();

    System.out.println(introduceDavid);

    System.out.println();

    System.out.println(introduceTania);

    System.out.println();

    System.out.println(introduceJimmy);

    System.out.println();

    System.out.print(introduceSofia);

    System.out.println();

  }
}