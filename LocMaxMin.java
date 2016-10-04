public class LocMaxMin {
  public static void main(String args[]) {
    int a[] = {3, -6, 5, 2, 7} ;
    int max ;
    int min ;
      for (int i = 1; i < a.length - 1; i++) {
        if ((a[i-1] < a[i]) && (a[i] > a[i+1])) {
          max = a[i];
            System.out.println("Max = "+ max);
        }
        if ((a[i-1] > a[i]) && (a[i] < a[i+1])) {
          min = a[i];
            System.out.println("Min = " + min);
        }
      }
  }
}
