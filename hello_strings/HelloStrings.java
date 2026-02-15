package hello_strings;

public class HelloStrings {

  public static void main(String[] args) {

    String helloStrings = "Hello Strings";

    System.out.println(helloStrings);

    int i = 1000;

    i = 10000000;

    System.out.println(i);

    String s = "Hello";

    s = "Hello Word";

    System.out.println(s);

    String greeting;

    StringBuilder largeGreeting = new StringBuilder("Hello");

    largeGreeting.append(" ");
    largeGreeting.append("w");
    largeGreeting.append("o");
    largeGreeting.append("r");
    largeGreeting.append("l");
    largeGreeting.append("d");

    greeting = largeGreeting.toString();

    System.out.println(greeting);

    String newGreeting;

    StringBuilder newLargeGreeting = new StringBuilder("Hello");

    newLargeGreeting.append(" Everyone");

    newGreeting = newLargeGreeting.toString();

    System.out.println(newGreeting);

  }

  public static String reverse(String original) {
    String reversed = "";
    for (int i = original.length() - 1; 0 <= i; i--) {
      reversed += original.charAt(i);
    }

    return reversed;
  }

  String first = "ABC";
  String second = "DEF";

  
}