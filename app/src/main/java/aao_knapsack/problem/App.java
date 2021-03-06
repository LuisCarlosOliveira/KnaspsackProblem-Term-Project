/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package aao_knapsack.problem;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int[] W = new int[4];
        int[] V = new int[4];

        for (int i = 0; i < W.length; i++) {
            number = input.nextInt();
            W[i] = number;
        }

        for (int w: W) {
            System.out.println(w);
        }

        Kanpsack algorith = new Kanpsack();
        final int M = 150;
        final int M2 = 1000;

        //Test 1
        // n = 4
//        int W[] = new int[]{18,32,110,80};
//        int V[] = new int[]{22,28,120,90};
//        int n = V.length;
        //Test 2 for m2
        int T2W[] = new int[]{18,22,10,10};
        int T2V[] = new int[]{232,348,130,23};
        int T2n = T2V.length;

        // n = 2*4 = 8
        int V2[] = new int[]{22,28,120,90,10,25,6,34};
        int W2[] = new int[]{18,32,110,80,7,23,8,80};
        int n2 = V2.length;
        //Test 2 for m2
        int T2W2[] = new int[]{18,22,10,10,18,42,20,14};
        int T2V2[] = new int[]{232,348,130,230,180,113,111,111};
        int T2n2 = T2V2.length;

        // n = 4*4 = 16
        int V3[] = new int[]{22,28,120,90,10,25,6,34,22,26,100,80,34,45,56,32};
        int W3[] = new int[]{18,32,110,80,7,23,8,80,19,33,105,70,12,23,28,1};
        int n3 = V3.length;
        //Test 2 for m2
        int T2W3[] = new int[]{18,22,50,40,18,160,20,14,232,38,130,230,180,113,111,111};
        int T2V3[] = new int[]{832,348,130,230,480,413,231,111,232,348,10,30,480,213,211,561};
        int T2n3 = T2V3.length;

        // n = 8*4 = 32
        int W4[] = new int[]{18,32,110,80,7,23,8,80,19,33,105,70,12,23,28,1,18,32,110,70,76,25,85,5,9,35,15,50,12,23,48,20};
        int V4[] = new int[]{22,28,120,90,10,25,6,34,22,26,100,80,34,45,56,32,12,23,130,30,20,15,6,14,62,76,130,80,44,25,26,92};
        int n4 = V4.length;
        //Test 2 for m2
        int T2W4[] = new int[]{18,22,50,40,18,60,20,14,232,348,130,136,190,113,111,144,148,24,55,45,18,65,20,14,252,648,130,230,180,113,111,141};
        int T2V4[] = new int[]{332,348,130,230,480,413,231,111,232,348,10,30,480,213,211,561,842,348,123,330,480,313,281,411,332,248,101,20,380,213,211,221};
        int T2n4 = T2V4.length;

        /*algorith.knapsackDyProg(W, V, M, n);
        algorith.knapsackDyProg(W2, V2, M, n2);
        algorith.knapsackDyProg(W3, V3, M, n3);
        algorith.knapsackDyProg(W4, V4, M, n4);*/

        //algorith.knapsackDyProg(T2W, T2V2, M2, T2n);
        System.out.println("Comp: " + algorith.knapsackDyProg(T2W, T2V2, M2, T2n));
//        algorith.knapsackDyProg(T2W2, T2V2, M2, T2n2);
//        algorith.knapsackDyProg(T2W3, T2V3, M2, T2n3);
//        algorith.knapsackDyProg(T2W4, T2V4, M2, T2n4);
    }
}
