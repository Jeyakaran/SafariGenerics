package shopping;

public class Shoe implements Sized, Colored {
  private String color;
  private int size;

  public Shoe(String color, int size) {
    this.color = color;
    this.size = size;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "Shoe{" +
        "color='" + color + '\'' +
        ", size=" + size +
        '}';
  }
}
