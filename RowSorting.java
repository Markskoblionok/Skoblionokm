public class RowSorting {
  public static void main(String[] args) {
    int a[] = {3, -6, 5, 2, 7} ;
  int p, i, j ;
  for (i = a.length - 1 ; i >= 0 ; i--) {
    for (j = 0 ; j < i ; j++ ) {
      if (a[j] > a[j + 1]) {
        p = a[j + 1] ;
        a[j + 1] = a[j] ;
        a[j] = p ;
      }
    }
  }
  for (i = 0 ; i < a.length; i++) {
    System.out.println(a[i]);
  }
 }
}
