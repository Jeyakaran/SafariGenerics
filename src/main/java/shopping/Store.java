package shopping;

public class Store {
  public static void main(String[] args) {
    ClothingPair<Shoe> ps = new ClothingPair<>(new Shoe("Brown", 10), new Shoe("Brown", 11));
    System.out.println("shoes match? " + ps.match());

    ClothingPair<Shoe> ps2 = new ClothingPair<>(new Shoe("Brown", 10), new Shoe("Brown", 10));
    System.out.println("shoes match? " + ps2.match());

    ClothingPair<Shoe> ps3 = new ClothingPair<>(new Shoe("Brown", 10), new Shoe("Red", 10));
    System.out.println("shoes match? " + ps3.match());

//    boolean looksGood = ClothingPair.<Shoe>matches(new Shoe("Brown", 10), new Shoe("Red", 10));
    boolean looksGood = ClothingPair.matches(new Shoe("Brown", 10), new Shoe("Red", 10));
  }
}
