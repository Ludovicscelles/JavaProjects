package movies;

public class Movies {

  public static void main(String[] args) {
    String[] movieTitle = { "Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom",
        "Indiana Jones and the Last Crusade" };
    String[][] actorsByMovie = new String[][] {
        { "Harrison Ford", "Karen Allen", "Paul Freeman" },
        { "Harrison Ford", "Kate Capshaw", "Ke Huy Quan" },
        { "Harrison Ford", "Sean Connery", "Denholm Elliott" }
    };

    for (int i = 0; i < movieTitle.length; i++) {
      System.out.println("Movie: " + movieTitle[i]);
      System.out.println("Actors: " + actorsByMovie[i][0] + ", " + actorsByMovie[i][1] + " and "
          + actorsByMovie[i][2] + ".");
      System.out.println();
    }

  }

}