package Object;

public class Duck {

  private String name;
  private int age;
  private boolean swimming;

  public Duck(String name) {
    this.name = name;
    this.age = 0;
    this.swimming = false;
  }

  public Duck(String name, int age) {
    this.name = name;
    this.age = age;
    this.swimming = false;
  };

  public String getName() {
    return this.name;
  }

  public void SetName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isSwimming() {
    return this.swimming;
  }

  public String nameAndAge() {
    return "My name is " + this.getName() + " and I'm " + String.valueOf(this.getAge()) + ".";
  }

  public static String quack(){
    return "Quack";
  }

  @Override
  public String toString() {
    return "Duck{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", swimming=" + swimming +
        '}';
  }

}
