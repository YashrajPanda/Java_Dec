// array in java

public class array{
    public static void main(String a[]){
        // int num[] = new int[4];
        // num[0] = 10;
        // num[1] = 20;
        // num[2] = 30;
        // System.out.println(num[0]);
        // System.out.println(num[3]); //default value 0

        // // if i want to print all the values of array
        // for(int i=0;i<num.length;i++){
        //     System.out.println(num[i]);
        // }

        // Multi dimensional array
        // int num[][] = new int[3][4]; // 3 rows and 4 columns

        // for(int i=0;i<3;i++){ // rows
        //     for(int j=0;j<4;j++){ // columns
        //         num[i][j] = (int)(Math.random()*10); // assigning random values
        //     }
        // }

        // for(int i=0;i<3;i++){ // rows
        //     for(int j=0;j<4;j++){ // columns
        //         System.out.print(num[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("Using for-each loop");

        // // for-each loop
        // for (int n[] : num){
        //     for (int m : n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }


        // // jagged array
        // int num[][] = new int[3][];
        // num[0] = new int[4]; // first row has 2 columns
        // num[1] = new int[3]; // second row has 3 columns
        // num[2] = new int[2]; // third row has 4 columns
        // for(int i=0;i<num.length;i++){ // rows
        //     for(int j=0;j<num[i].length;j++){ // columns
        //         num[i][j] = (int)(Math.random()*10); // assigning random values
        //     }
        // }
        // for(int i=0;i<num.length;i++){ // rows
        //     for(int j=0;j<num[i].length;j++){ // columns
        //         System.out.print(num[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // threem dimensional array
        int arr[][][] = new int[2][3][4]; // 2 blocks, 3 rows, 4 columns
        for(int i=0;i<2;i++){ // blocks
            for(int j=0;j<3;j++){ // rows
                for(int k=0;k<4;k++){ // columns
                    arr[i][j][k] = (int)(Math.random()*10); // assigning random values
                }
            }
        }
        for(int i=0;i<2;i++){ // blocks
            System.out.println("Block " + (i+1) + ":");
            for(int j=0;j<3;j++){ // rows
                for(int k=0;k<4;k++){ // columns
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}


// Drawbacks of array : array size is fixed, array can store only similar data types 

// To overcome these drawbacks we have collections in java like ArrayList, LinkedList etc.