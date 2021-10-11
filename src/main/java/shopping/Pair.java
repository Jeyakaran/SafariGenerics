package shopping;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Pair<E> {
  E left;
  E right;

  public Pair(E left, E right) {
    this.left = left;
    this.right = right;
  }

  public E getLeft() {
    return left;
  }

  public void setLeft(E left) {
    this.left = left;
  }

  public E getRight() {
    return right;
  }

  public void setRight(E right) {
    this.right = right;
  }

//  public boolean matchByPredicate(BiPredicate<E, E> test) {
//    return test.test(left, right);
//  }
//  public boolean match() {
//    return left.getSize() == right.getSize();
//  }

  @Override
  public String toString() {
    return "Pair{" +
        "left=" + left +
        ", right=" + right +
        '}';
  }
}
