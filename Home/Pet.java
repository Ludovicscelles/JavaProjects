package home;

public interface Pet {

  void feed();

  void play();

  boolean pet();

  default void trick() {
    System.out.println("Does a trick");
  }
}