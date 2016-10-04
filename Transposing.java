public class Transposing {
  public static void main(String[] args) {
    int[][] a = {
      {-9, 1, 4, 6, 0},
      {5, -4, 8, -6, 2},
      {9, -2, 3, -7, 6},
      {5, -5, 4, -8, 7},
      {1, -2, 3, -4, 5}
    };
    int n = a.length;
    int b[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
           b[i][j] = a[j][i];
      }
    }
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
      System.out.println(b[i][j]);
    }
   }
  }
}
