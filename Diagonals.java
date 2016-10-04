public class Diagonals {
  public static void main(String[] args) {
    int[][] a = {
      {-9, 1, 4, 6, 0},
      {5, -4, 8, -6, 2},
      {9, -2, 3, -7, 6},
      {5, -5, 4, -8, 7},
      {1, -2, 3, -4, 5}
    };
  int sglav = 0;
  int spoboch = 0;
  int minv = 1000000;
  for (int i = 0; i < a.length ; i++) {
    for (int j = 0; j < a.length ; j++) {
      if (i == j) {
        sglav = sglav + a[i][j];
      }
      if (i + j == a.length - 1 ) {
        spoboch = spoboch + a[i][j];
      }
      if (i < j) {
        if (a[i][j] < minv) {
          minv = a[i][j];
        }
      }
    }
   }
   System.out.println("Summa glav = " + sglav + " Summa poboch = " + spoboch + " Min vishe glav = " + minv);
  }
}
