package com.java;

public class Arrays {

    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);

        // Finding the largest element
//            double[] myList = {1.9, 2.9, 3.4, 3.5};
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            // 2.9 > 1.9
            if (myList[i] > max) {
                //max= 2.9
                max = myList[i];
            }
        }
        System.out.println("Max is " + max);


        int[][] twoDArray =
                {
                        {1, 2, 3}, // i = 0 => {1, 2, 3} => { j0, j1, j2}
                        {4, 5, 6}, // i = 1, j = 1
                        {7, 8, 9}  // i = 2, j = 2
                };

             // [1,2,3] [4,5,6] [7,8,9]


        for (int i = 0; i < twoDArray.length; ++i) {
            System.out.print("[");
            for (int j = 0; j < twoDArray.length; ++j) {
                System.out.print(twoDArray[i][j]);
                if (j != 2){
                    System.out.print(",");
            }
            }
            System.out.print("]");
            System.out.println(" ");
            }
        }
    }