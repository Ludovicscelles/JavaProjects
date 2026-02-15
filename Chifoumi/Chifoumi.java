package chifoumi;

public class Chifoumi {

  public static String counterAttack(String attack) {
    if (attack.equals("pierre")) {
      return "feuille";
    }
    if (attack.equals("feuille")) {
      return "ciseaux";
    }
    return "pierre";
  }

  public static void main(String[] args) {
    System.out.println("Indy joue pierre");
    System.out.println("Je joue " + counterAttack("pierre"));

    System.out.println("Indy joue feuille");
    System.out.println("Je joue " + counterAttack("feuille"));

    System.out.println("Indy joue ciseaux");
    System.out.println("Je joue " + counterAttack("ciseaux"));
    
  }
}