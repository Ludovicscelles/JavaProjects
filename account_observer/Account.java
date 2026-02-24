package account_observer;

import java.util.Timer;
import java.util.TimerTask;

// The Account class represents a user's account in the application. 
// It provides a method to sign in a user and get the user's information.
public class Account {

  // Attibute that represents the user of the account.
  public static void signIn(String name, SignInListener event) {

    // loading begins
    event.onLoading();

    if (name == null || name.isEmpty()) {
      // sends the error message and stops
      event.onError("Name is null or empty");
      return;
    }
    // Simulate the time it takes to sign in by sleeping the thread for a random
    // time between 1 and 4 seconds.
    int time = (int) (Math.random() * ((4000 - 1000) + 1)) + 1000;
    new Timer().schedule(new TimerTask() {
      @Override
      public void run() {
        User user = new User(name);
        // sends the user
        event.onSuccess(user);

      }
    }, time);
  }

}