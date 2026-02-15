package decipherer;

public class Decipherer {

  // method to decipher the message
  public static String decipher(String message) {

    // calculate the number of characters to extract
    int numberKey = message.length() / 2;

    // extract the substring from the message
    int indexStart = 5;
    int indexEnd = indexStart + numberKey;
    String subMessage = message.substring(indexStart, indexEnd);

    // replace the characters @, # and ? with a space
    subMessage = subMessage.replaceAll("[@#?]+", " ");

    // reverse the substring
    String reversedMessage = new StringBuilder(subMessage).reverse().toString();
    return reversedMessage;
  }

  public static void main(String[] args) {
    System.out.println("Deciphering the messages...");
    String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
    String decipheredMessage1 = decipher(message1);
    System.out.println();
    System.out.println("The deciphered message is: " + decipheredMessage1);
    String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
    String decipheredMessage2 = decipher(message2);
    System.out.println("The deciphered message is: " + decipheredMessage2);
    System.out.println();
    String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";
    String decipheredMessage3 = decipher(message3);
    System.out.println("The deciphered message is: " + decipheredMessage3);
  }
}