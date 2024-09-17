
/*
 * Jagged Arrays
        ---> In Java, you can create jagged arrays, which are arrays of arrays where each sub-array 
             can have a different length. These are sometimes called "ragged" arrays.
 */

class jagged_and_3D_Array {
    public static void main(String arr[]) {
        // jagged Array
        int num[][] = new int[3][];

        // Define size of subp-array
        num[0] = new int[3];
        num[1] = new int[1];
        num[2] = new int[5];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 100);
            }

        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        for( int n[]: num)
        {
            for(int j : n)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }


        // 3D array 


        int num1[][][] = new int[3][2][3]; // Creating 3d array
        // All things is same as 2d array  
    }
}
