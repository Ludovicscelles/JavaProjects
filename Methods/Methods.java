package Methods;

import java.util.Arrays;

public class Methods {

  public static void main(String[] args) {

    System.out.println();

    String[] moviesArray = {
        "Raiders of the Lost Ark",
        "Indiana Jones and the Temple of Doom",
        "Indiana Jones and the Last Crusade",
        "Indiana Jones and the Kingdom of the Crytal Skulls"
    };

    for (String movie : moviesArray) {
      System.out.println(movie);
    }

    System.out.println();

    String[] moviesArray2 = new String[moviesArray.length + 2];

    for (int i = 0; i < moviesArray.length; i++) {
      moviesArray2[i] = moviesArray[i];
    }

    int lastPreviousIndex = moviesArray.length - 1;

    moviesArray2[lastPreviousIndex + 1] = "Indiana Jones and the Fate of Atlantis";
    moviesArray2[lastPreviousIndex + 2] = "Indiana Jones and Facebook's Personnal Data";

    for (String movie : moviesArray2) {
      System.out.println(movie);
    }

    System.out.println();

    String[] moviesArray3 = Arrays.copyOf(moviesArray2, moviesArray2.length + 3);

    int lastPreviousIndex2 = moviesArray2.length - 1;

    moviesArray3[lastPreviousIndex2 + 1] = "Indiana Jones and the Dial of Destiny";

    for (String movie : moviesArray3) {
      System.out.println(movie);
    }

    System.out.println();

  }

}