package aao_knapsack.problem;

public class Kanpsack {
    private static final String CONSTANT = "Constant order";
    private static final String LINEAR   = "Linear order";
    private static final String QUADRATIC = "Quadratic order";
    private static final String LOGARITHMIC = "Logarithmic order";
    private static final String N_LOGARITHMIC  = "N logarithmic order";
    private static final String CUBIC  = "Cubic order";
    private static final String FOURTH  = "Fourth order";
    private static final String EXPONENCIAL  = "Exponencial order";

    private int comp;
    public Kanpsack() {
    this.comp = 0;
    }

    /*public int createTable(int W[], int V[], int M, int n) {
        int B[][] = new int[n + 1][M + 1];

        for (int i = 0; i <= n; i++) { // Create a table with default value 0
            for (int j = 0; j <= M; j++) {
                B[i][j] = 0;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= M; j++) {
                B[i][j] = B[i - 1][j];
                this.comp++;
                if ((j >= W[i - 1]) && (B[i][j] < B[i - 1][j - W[i - 1]] + V[i - 1])) {
                    this.comp++;
                    B[i][j] = B[i - 1][j - W[i - 1]] + V[i - 1];
                }

                System.out.print(B[i][j] + " ");
            }
            System.out.print("\n");
        }
    }*/


    public int knapsackDyProg(int W[], int V[], int M, int n) {
        int B[][] = new int[n + 1][M + 1];

        for (int i = 0; i <= n; i++) { // Create a table with default value 0
            for (int j = 0; j <= M; j++) {
                B[i][j] = 0;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= M; j++) {
                B[i][j] = B[i - 1][j];
                this.comp++;
                if ((j >= W[i - 1]) && (B[i][j] < B[i - 1][j - W[i - 1]] + V[i - 1])) {
                    this.comp++;
                    B[i][j] = B[i - 1][j - W[i - 1]] + V[i - 1];
                }

                System.out.print(B[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Max Value:\t" + B[n][M]);

        System.out.println("Selected Packs: ");

        while (n != 0) {
            if (B[n][M] != B[n - 1][M]) {
                System.out.println("\tPackage " + n + " with W = " + W[n - 1] + " and Value = " + V[n - 1]);

                M = M - W[n - 1];
            }

            n--;
        }
        //System.out.println(this.comp);
        return comp;
    }

//    public String classify(int W[], int V[], int M, int n) {
//     int min = 0;
//        for (int i = 0; i < n; i++) {
//
//            2*comp[i]
//            if (min == knapsackDyProg(W, V, M, n)) {
//            }
//        }
//        if (comp)
//        {
//            return P_IMPOSSIBLE;
//        }
//
//        if (side1 == side2)
//        {
//            if (side2 == side3)
//            {
//                return P_EQUILATERAL;
//            }
//            else
//            {
//                return P_ISOSCELES;
//            }
//        }
//
//        if (isRightAngled())
//        {
//            return P_RIGHTANGLED;
//        }
//
//        return P_SCALENE;
//    }
}
