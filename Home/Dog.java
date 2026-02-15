package home;

public class Dog extends Animal implements Pet {

  public Dog(String name, int age) {
    super(name, age);
  }

  @Override
  public void feed() {
    System.out.println("pâtée");
  }

  @Override
  public void play() {
    System.out.println("aboiement");
  }

  @Override
  public boolean pet() {
    System.out.println("adore les caresses.");
    return true;
  }

}