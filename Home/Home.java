package Home;

public class Home {

  public static void main(String[] args) {
    Cat daisy = new Cat("Daisy", 8);
    Dog dingo = new Dog("Dingo", 10);

    System.out.println(
        daisy.getName() + " a " + daisy.getAge() + " ans et " + dingo.getName() + " a " + dingo.getAge() + " ans.");
    System.out.println("Chacun ont leur cri respectif :");
    System.out.print(daisy.getName() + " : ");
    daisy.play();
    System.out.print(dingo.getName() + " : ");
    dingo.play();
    System.out.println("Chacun ont leur nourriture préférée :");
    System.out.print(daisy.getName() + " : ");
    daisy.feed();
    System.out.print(dingo.getName() + " : ");
    dingo.feed();
    System.out.println("Chacun ont leur relation avec les caresses :");
    System.out.print(daisy.getName() + " ");
    daisy.pet();
    System.out.print(dingo.getName() + " ");
    dingo.pet();
  }
}