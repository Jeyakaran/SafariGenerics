package simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseAList {

//  public static <E> E[] asArray(List<E> stuff) {
//    E[] result = new E[stuff.size()];
//  }

  public static void breakAList(List l) {
    l.add(LocalDate.now());
  }

  public static void main(String[] args) {
//    List<String> names = new ArrayList(Arrays.asList(LocalDate.now()));
//    List<String> names = new ArrayList<String>(Arrays.asList(LocalDate.now(), "Alfie"));
    List<String> names = new ArrayList<>(Arrays.asList(/*LocalDate.now(),*/ "Alfie"));
    names = Collections.checkedList(names, String.class);
    names.add("Fred");
    names.add("Jim");
//    names.add(LocalDate.now());
//    breakAList(names);

//    String s = (String)names.get(2);
    String s = names.get(0);
    System.out.println(s);

    boolean b = true;
    int x = 99;
    String y = "200";
//    var z = b ? x : y; // combinations of interfaces
  }
}
