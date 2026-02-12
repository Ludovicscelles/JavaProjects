package Hangar;

public class Hangar {

  public static void main(String[] args) {

    Car ford = new Car("Ford", 125000);
    Boat beneteau = new Boat("Bénéteau", 1000);

    String introduceFord = ford.doStuff();
    String intorduceBeneteau = beneteau.doStuff();

    System.out.println();
    System.out.println(introduceFord);
    System.out.println();
    System.out.println(intorduceBeneteau);
    System.out.println();
  }
}