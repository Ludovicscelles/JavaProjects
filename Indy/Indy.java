package Indy;

import java.util.Arrays;

public class Indy {

  public static void main(String[] args) {

    // Simple variables
    String weapon1 = "whip";
    String weapon2 = "gun";
    String weapon3 = "saber";

    System.out.println("Indy has a " + weapon1 + ", a " + weapon2 + " and a " + weapon3 + ".");

    // Arrays
    String[] weapons = new String[] { "whip", "gun", "saber" };

    System.out.println("Indy has a " + weapons[0] + ", a " + weapons[1] + " and a " + weapons[2] + ".");

    String[] ortherWeapons = { "pistol", "grenade", "knife" };

    System.out.println("Indy has these other weapons: " + ortherWeapons[0] + ", " + ortherWeapons[1] + " and "
        + ortherWeapons[2] + ".");

    ortherWeapons[1] = "sword";

    System.out.println(Arrays.toString(ortherWeapons));

    String[] weaponsIndiana = { "whip", "gun", "saber", "pistol", "sword", "knife" };
    String[] weaponsHelen = { "gun", "grenade", "knife", "shield" };
    String[] weaponsRavenwood = { "belt", "dagger", "gun", "shield" };

    System.err.println("Indy has these weapons: " + Arrays.toString(weaponsIndiana)
        + "\nHelen has these weapons: " + Arrays.toString(weaponsHelen) + "\nRavenwood has these weapons: "
        + Arrays.toString(weaponsRavenwood));

    // Multidimensional arrays
    String[][] weaponsByCharacter;

    weaponsByCharacter = new String[][] {
        weaponsIndiana,
        weaponsHelen,
        weaponsRavenwood
    };

    System.out.println(Arrays.toString(weaponsByCharacter[0]));
    System.out.println(Arrays.toString(weaponsByCharacter[1]));
    System.out.println(Arrays.toString(weaponsByCharacter[2]));

    System.out.println(weaponsByCharacter[0][0]);
    System.out.println(weaponsByCharacter[0][5]);
    System.out.println(weaponsByCharacter[1][2]);
    System.out.println(weaponsByCharacter[2][0]);

    System.out.println(weapons.length);

    System.out.println(weaponsByCharacter.length);
    System.out.println(weaponsByCharacter[0].length);
    System.out.println(weaponsByCharacter[2].length);

    // sorting arrays
    int[] numbersArray = { 16, 0, 5, 3, 1, 6, 4 };
    Arrays.sort(numbersArray);
    System.out.println(Arrays.toString(numbersArray));

    Arrays.sort(weapons);
    System.out.println(Arrays.toString(weapons));

    // Loops

    // for loop
    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");
    }

    System.out.println();

    for (int compteur = 0; compteur < 10; compteur++) {
      System.out.print(compteur + " ");
    }

    System.out.println();

    for (int i = 9; i >= 0; i--) {
      System.out.print(i + " ");
    }

    System.out.println();

    weapons = new String[] { "whip", "gun", "saber" };

    for (int i = 0; i < weapons.length; i++) {
      System.out.println(weapons[i]);
    }

    // while loop
    int i = 0;
    while (i < 10) {
      System.out.print(i + " ");
      i++;
    }
    System.out.println();

    // for each loop

    for (String otherWeapon : ortherWeapons) {
      System.out.println(otherWeapon);
    }
  }
}