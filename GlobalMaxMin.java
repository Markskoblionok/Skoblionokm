public class GlobalMaxMin {
  public static void main(String args[]) {
    int a[] = {3, -6, 5, 2, 7} ;
    int per = -1000000;
    int per2 = 1000000;
      for (int i = 1; i < a.length; i++) {
        if (per < a[i]) {
          per = a[i];
        }
        if (per2 > a[i]) {
          per2 = a[i];
        }
      }
      System.out.println("Max = "+ per + "  " + "Min = " + per2);
  }
}
