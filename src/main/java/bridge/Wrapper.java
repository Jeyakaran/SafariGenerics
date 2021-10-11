package bridge;

import java.lang.reflect.Method;

public class Wrapper implements Comparable<Wrapper> {
//  @Override
//  public boolean equals(Object obj) {
//    return super.equals(obj);
//  }

  @Override
  public int compareTo(Wrapper o) {
    return 0;
  }

  public static void main(String[] args) {
    Class<?> cl = Comparable.class;
    Method[] ma = cl.getDeclaredMethods();
    for (Method m : ma) {
      System.out.println(m);
    }

    Class<?> cl2 = Wrapper.class;
    Method [] mea = cl2.getDeclaredMethods();
    for (Method m : mea) {
      System.out.println(m);
    }

    // also see the bridge method by using the "disassembler"
    // javap -c -cp target/classes bridge.Wrapper

  }
}
