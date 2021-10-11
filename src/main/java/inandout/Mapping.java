package inandout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Mapping {
  public static <E, F> List<F> map(List<E> input, Function<? super E, ? extends F> op) {
    List<F> res = new ArrayList<>();

    for (E e : input) {
      res.add(op.apply(e));
    }
    return res;
  }

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");
    Function<CharSequence, Integer> fsi = (CharSequence s) -> s.length();
    List<Number> li = map(ls, fsi);
    System.out.println("results: " + li);

    List<StringBuilder> lsb = Arrays.asList(new StringBuilder("Fred"),
        new StringBuilder("Jim"),
        new StringBuilder("Sheila"));
    List<Number> li2 = map(lsb, fsi);
    System.out.println("more results: " + li2);
  }
}
