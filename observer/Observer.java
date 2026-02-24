package observer;

import java.util.Timer;
import java.util.TimerTask;

public class Observer {

  public static void main(String[] args) {

    // Observer pattern is a software design pattern in which an object, called the
    // subject,
    // maintains a list of its dependents, called observers, and notifies them
    // automatically of any state changes,
    // usually by calling one of their methods.

    // In this example, we will create a simple observer pattern implementation
    // where we have a Subject class that maintains a list of observers and notifies
    // them of any changes.

    // First, we will create the Subject class.
    System.out.println(1);

    // Simulate some work being done in the main thread
    try {
      // Sleep for 5 seconds to simulate work being done
      Thread.sleep(5000);
      // catch the InterruptedException that may be thrown by Thread.sleep()
      // InterruptedException is thrown when a thread is interrupted while it is
      // sleeping, waiting, or otherwise occupied.
      // In this case, we are catching the InterruptedException that may be thrown by
      // Thread.sleep() and printing the stack trace of the exception.
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(2);

    // Simulate some work being done in the main thread
    // Sleep for 5 seconds to simulate work being done
    // catch the InterruptedException that may be thrown by Thread.sleep()
    // InterruptedException is thrown when a thread is interrupted while it is
    // sleeping, waiting, or otherwise occupied.
    // It's asynchronous because it will not block the main thread while it is
    // sleeping, and the main thread can continue to execute other code while the
    // timer is running in the background.
    new Timer().schedule(new TimerTask() {
      // This method is called when the timer is triggered. It will print the number 3
      // to the console.
      @Override
      public void run() {
        System.out.println(3);
      }
      // The timer is set to trigger after 10 seconds (10000 milliseconds).
    }, 10000);
    System.out.println(4);

  }
}