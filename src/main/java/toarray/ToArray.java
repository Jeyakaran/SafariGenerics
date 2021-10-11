package toarray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ToArray {

  public static <E extends F, F> F[] asAList(List<E> l, Class<F> theClass) {
//    E[] res = new E[l.size()];
//    E[] res = (E[])new Object[l.size()];
//    E[] res = (E[]) Array.newInstance(theClass, l.size());
    F[] res = (F[]) Array.newInstance(theClass, l.size());
    for (int i = 0; i < l.size(); i++) {
      res[i] = l.get(i);
    }
    return res;
  }

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");

//    String [] sa = asAList(ls, String.class);
    CharSequence[] sa = asAList(ls, CharSequence.class);
    sa[0] = new StringBuilder("Oops");
    System.out.println("returned array is " + Arrays.toString(sa));
    System.out.println("array type is " + sa.getClass());

    // generics ONLY work with object types
//    List<int> li; // bad :(

    List<Integer> li = Arrays.asList(1, 2, 3);
//    Integer[] ia = asAList(li, String.class); // Class<E> in method prevents this
    Integer[] ia = asAList(li, Integer.class);
    System.out.println("array is " + Arrays.toString(ia));
    System.out.println("array type is " + ia.getClass());
  }
}
