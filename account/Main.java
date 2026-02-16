package account;

public class Main {

  public static void main(String[] args) {

    // in one process
    Account account = Account.getInstance();
    account.signIn("Cartman");

    // later, elsewhere in the application
    Account account1 = Account.getInstance();
    User user = account1.getUser();
    System.out.println(user.getName());

  }
}