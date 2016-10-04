public class FunctionMult {
  public static void main(String[] args) {
    int[][] a = {
      {9, 1, 4, 6, 0},
      {5, -4, 8, -6, 2},
      {9, -2, 3, -7, 6},
      {5, -5, 4, -8, 7},
      {1, -2, 3, -4, 5}
    };
    int[][] b = {
      {1 , 2 , 3 , 4 },
      {5 , -6, 7, -8 },
      {9 , 8 , -7 , 6},
      {5, 4, -3, 2},
      {9 , 5, -3, 6}
    };

    int[][] c = new int[a.length][b[0].length];

     proizv(a, b, c);
    for (int i = 0; i < c.length; i++) {
      for (int j = 0; j < c[0].length; j++) {
        System.out.println(c[i][j]);
      }
    System.out.println();
    }

  }
  public static int proizv (int a[][] , int b[][], int c[][] ) {

    int al = a.length;
    int bol = b[0].length;
    int bl = b.length;
    if (a[0].length == b.length){
      for (int i = 0; i < al; i++) {
        for (int j = 0; j < bol; j++) {
          for (int k = 0; k < bl; k++) {
               c[i][j] += a[i][k] * b[k][j];
                     }
                 }
             }
    }
return al;
  }
}
