package account;

// This class is a singleton that represents the account of the user. 
public class Account {

  // Attibute that represents the user of the account. 
  // It is private because it should only be accessed through the methods of the Account class.
  private User user;
  private static Account instance;

  // Private constructor to prevent instantiation of the class from outside.
  private Account() {
  }

  // Method to get the instance of the Account class.
  // If the instance is null, it creates a new instance of the Account class and returns it. 
  // Otherwise, it returns the existing instance.
  public static Account getInstance() {
    if (instance == null) {
      instance = new Account();
    }
    return instance;
  }

  // public method to sign in the user. 
  // It takes the name of the user as a parameter and creates a new User object with the name.
  public void signIn(String name) {
    user = new User(name);
  }

  // public method to get the user of the account.
  public User getUser() {
    return user;
  }

}