package use_map;

public class Computer {

  private String model;

  public Computer(String model) {
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public String toString() {
    return model;
  }
}