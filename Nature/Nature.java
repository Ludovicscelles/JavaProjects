package nature;

import java.util.ArrayList;

public class Nature {

  public static void main(String[] args) {

    Duck donald = new Duck("Donald");

    donald.setAge(84);

    System.out.println("1. Duck name is: " + donald.getName() + ".");
    System.out.println("2. He is " + String.valueOf(donald.getAge()) + ".");
    System.out.println("3. He sings " + donald.sing() + ".");

    Eagle thorondor = new Eagle("Thorondor");
    thorondor.setAge(26);

    System.out.println("4. Eagle name is: " + thorondor.getName() + ".");
    System.out.println("5. He is " + String.valueOf(thorondor.getAge()) + ".");
    System.out.println("6. He sings " + thorondor.sing() + ".");

    ArrayList<Bird> birds = new ArrayList<>();
    birds.add(donald);
    birds.add(thorondor);
    System.out.println("7. Birds in the list: ");
    for (Bird bird : birds) {
      System.out.println("- " + bird.getName());
    }
  };
}