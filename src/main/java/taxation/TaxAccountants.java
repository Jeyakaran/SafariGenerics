package taxation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxAccountants {
  public static void calculateTaxes(Taxable t) {}

//  public static void showThing(List<? extends Object> l) {
  public static void showThing(List<?> l) {
    Object obj = l.get(0);
  }

//  public static <F extends Taxable & Runnable> void calculateBulkTaxes(List<F> lt) {
  public static void calculateBulkTaxes(List<? extends Taxable> lt) {
//    lt.add(new Corporations());  // would break with a List<Individual>
    for (Taxable t : lt) {  // Taxable t = lt.get(x) -- lt.get returns "the type in the list"
      calculateTaxes(t);
    }
  }

  public static void calculateBulkTaxes(Taxable[] ta) {
    // arrays KNOW their base type at runtime, this would throw an ArrayStoreException
    ta[0] = new Corporations();  // would break with a List<Individual>
    for (Taxable t : ta) {  // Taxable t = lt.get(x) -- lt.get returns "the type in the list"
      calculateTaxes(t);
    }
  }

  public static void collectClients(List<? super Individual> li) {
    //  Individual must be assignment compatible to the caller's type (?)
    li.add(new Individual());
  }

  public static void main(String[] args) {
    List<Taxable> clients = Arrays.asList(
        new Corporations(),
        new Corporations(),
        new Individual()
    );

    collectClients(clients);
    collectClients(new ArrayList<Object>()); // Also OK syntactically\

//    collectClients(new ArrayList<Corporations>());

    calculateBulkTaxes(clients);

    // Buy Joe's local tax company. Joe, only likes individuals
    List<Individual> joesClients = Arrays.asList(
        new Individual(),
        new Individual()
    );
    collectClients(joesClients);

    calculateBulkTaxes(joesClients);

    Individual [] joesClients2 = null;
    calculateBulkTaxes(joesClients2);
  }
}
