package shopping;

//public class ClothingPair<E extends Sized, String> extends Pair<E> {
//  java.lang.String f = "Hello";

public class ClothingPair<E extends Sized & Colored> extends Pair<E> {

    public ClothingPair(E left, E right) {
      super(left, right);
    }

    public boolean match() {
      return left.getSize() == right.getSize() &&
          left.getColor().equals(right.getColor());
    }

    // this E is an ENTIRELY DIFFERENT VARIABLE
//    public static <E extends Sized & Colored> boolean matches(E left, E right) {
    public static <F extends Sized & Colored> boolean matches(F left, F right) {
      return left.getSize() == right.getSize() &&
          left.getColor().equals(right.getColor());
    }
  }
