public class Crossing {
  public static void main(String[] args) {
    int a[] = {3, -6, 5, 2, 7} ;
    int b[] = {7, 3, -6, 8} ;
      for( int i = 0; i < a.length; i++) {
        for( int j = 0; j < b.length; j++){
          if( a[i] == b[j]) {
            System.out.println(a[i]);
          }
        }
      }
  }
}
