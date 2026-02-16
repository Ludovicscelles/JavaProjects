package use_map;

import java.util.Comparator;

public class User {

  private String name;

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // @Override
  // public int compareTo(User user) {
  // return this.getName().compareTo(user.getName());
  // }

  @Override
  public String toString() {
    return name;
  }
}