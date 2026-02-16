package use_map;

import java.util.Map;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class UseMap {

  public static void main(String[] args) {

    Map<String, String> capitales = new HashMap<>();

    capitales.put("France", "Paris");
    capitales.put("Italie", "Rome");
    capitales.put("Espagne", "Madrid");
    capitales.put("Portugal", "Lisbonne");
    capitales.put("Allemagne", "Berlin");
    capitales.put("Royaume-Uni", "Londres");
    capitales.put("Belgique", "Bruxelles");
    capitales.put("Suisse", "Berne");
    capitales.put("Pays-Bas", "Amsterdam");
    capitales.put("Grèce", "Athènes");
    capitales.put("Suède", "Stockholm");
    capitales.put("Norvège", "Oslo");
    capitales.put("Danemark", "Copenhague");
    capitales.put("Finlande", "Helsinki");

    for (Map.Entry<String, String> entry : capitales.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    User bernard = new User("Bernard");
    User laverne = new User("Laverne");
    User hoagie = new User("Hoagie");
    User surfer = new User("Surfer");
    Computer sx386 = new Computer("386SX-25");
    Computer dx486 = new Computer("486DX2-66");
    Computer c64 = new Computer("Commodore 64");

    Map<User, Computer> classroom = new HashMap<>();

    classroom.put(surfer, c64);
    classroom.put(bernard, dx486);
    classroom.put(laverne, sx386);
    classroom.put(hoagie, sx386);

    System.out.println();
    for (Map.Entry<User, Computer> entry : classroom.entrySet()) {
      System.out.printf("L'élève %s aura l'ordinateur %s.%n", entry.getKey(), entry.getValue());
    }

    System.out.println();

    for (User user : classroom.keySet()) {
      System.out.println(user.getName());
    }

    System.out.println();

    for (Computer computer : classroom.values()) {
      System.out.println(computer.getModel());
    }

    System.out.println();

    for (Map.Entry<User, Computer> entry : classroom.entrySet()) {
      User user = entry.getKey();
      Computer computer = entry.getValue();
      System.out.println(user.getName() + ": " + computer.getModel());
    }

    System.out.println();

    System.out.println(classroom.containsKey(laverne));
    System.out.println(classroom.containsValue(c64));

    Map<User, Computer> linkedClassroom = new LinkedHashMap<>();
    linkedClassroom.put(bernard, dx486);
    linkedClassroom.put(laverne, sx386);
    linkedClassroom.put(hoagie, sx386);
    linkedClassroom.put(surfer, c64);

    System.out.println();
    for (User user : linkedClassroom.keySet()) {
      Computer computer = linkedClassroom.get(user);
      System.out.println(user.getName() + ": " + computer.getModel());
    }
    System.out.println();

    Comparator<User> comparator = new Comparator<User>() {
      @Override
      public int compare(User orig, User compare) {
        return orig.getName().compareTo(compare.getName());
      }
    };

    Map<User, Computer> treeClassroom = new TreeMap<>(comparator);

    treeClassroom.put(surfer, c64);
    treeClassroom.put(laverne, sx386);
    treeClassroom.put(hoagie, sx386);
    treeClassroom.put(bernard, dx486);

    for (User user : treeClassroom.keySet()) {
      Computer computer = treeClassroom.get(user);
      System.out.println(user.getName() + ": " + computer.getModel());
    }
    System.out.println();

  }

}