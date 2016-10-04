public class FunctionBubble {
  public static void bubble(int[] a) {
      for(int i = a.length - 1 ; i > 0 ; i--) {
          for(int j = 0 ; j < i ; j++) {
              if( a[j] > a[j+1] ) {
                  int p = a[j];
                  a[j] = a[j+1];
                  a[j+1] = p;
              }
          }
      }
  }
  public static void main(String[] args) {
    int a[] = {3, -6, 5, 2, 7, 11} ;
    bubble(a);
    for(int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
