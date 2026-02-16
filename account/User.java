package account;

import java.time.LocalDate;

public class User {

  private String name;
  private String phoneNumber;
  private String email;
  private LocalDate birthday;

  public User(String name, String phoneNumber, String email, LocalDate birthday) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.birthday = birthday;
  }

   public User(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getBirthday() {
    return this.birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }
}