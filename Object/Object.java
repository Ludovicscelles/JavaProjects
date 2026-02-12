package Object;

public class Object {

  public static void main(String[] args) {

    Duck Riri = new Duck("Riri");

    System.out.println(Riri);

    Duck Donald = new Duck("Donald", 84);

    System.out.println(Donald);

    Duck mysterMask = new Duck("Myster Mask");
    Duck alberColvert = mysterMask;

    System.out.println(mysterMask);
    System.out.println(alberColvert);

    Duck fifi = new Duck("Fifi", 8);

    int age = fifi.getAge();

    System.out.println(age);

    boolean isSwimming = fifi.isSwimming();

    System.out.println(isSwimming);

    fifi.setAge(11);
    age = fifi.getAge();

    System.out.println(age);

    Duck loulou = new Duck("Loulou", 9);
    String introduceDuck = loulou.nameAndAge();

    System.out.println(introduceDuck);

    String sound = Duck.quack();

    System.out.println(sound);

  }

}
