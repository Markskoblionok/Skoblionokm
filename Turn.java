public class Turn{
  public static void main(String[] args) {
    int[][] a = {
      {-9, 1, 4, 6, 0},
      {5, -4, 8, -6, 2},
      {9, -2, 3, -7, 6},
      {5, -5, 4, -8, 7},
      {1, -2, 3, -4, 5}
  };
  int i;
  int j;
  int n = a.length;
  int m;
  int l;
  int p;
    for (i = 0; i < a.length ; i++) {
      m = n - 1;
      for (j = 0; j < n  ; j++) {
        if (i + j != a.length + 1){
          p = a[i][j];
          a[i][j] = a[i + m][j + m];
          a[i + m][j + m] = p;
          m = m - 1;
        }
      }
      n = n - 1;
    }
      for(i = 0; i < a.length; i++){
        for  (j = 0; j < a[i].length; j++){
          System.out.print(a[i][j] + " ");
        }
        System.out.println();
      }
  }
  }
