import java.util.Scanner;

public class Removing {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a[] = {3, -6, 5, 2, 7};
    int i ;
    int b = scanner.nextInt();
    if((b >= 0) && (b<= a.length - 1)) {
      for (i = 0 ; i < a.length - 1 ; i++){
        if(i == b){
          a[i] = a[i + 1] ;
          b = b + 1;
        }
      }
            for(i = 0; i < a.length - 1; i++){
            System.out.println( a[i]);
            }
    }
  }
}
