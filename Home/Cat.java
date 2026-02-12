package Home;

import java.util.Random;

public class Cat extends Animal implements Pet {

  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  public void feed() {
    System.out.println("croquettes, pâté");
  }

  @Override
  public void play() {
    System.out.println("miaulement");
  }

  @Override
  public boolean pet() {
    Random random = new Random();
    boolean agrees = random.nextBoolean();
    if (agrees) {
      System.out.println("accepte les caresses");
    } else {
      System.out.println("n'aime pas les caresses");
    }
    return agrees;
  }

  @Override
  public void trick(){
    System.out.println("Nope.");
  }

}
