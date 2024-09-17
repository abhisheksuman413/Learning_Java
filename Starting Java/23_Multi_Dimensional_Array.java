


/*
 * 
    *   In Java, multidimensional arrays are arrays of arrays. 
        They allow you to create structures like tables or matrices where data is 
        stored in multiple dimensions (e.g., 2D arrays, 3D arrays, etc.). Multidimensional 
        arrays are useful when dealing with complex data, such as coordinates in a 
        3D space or elements of a matrix.
 */

class Multi_Dimensional_Array 
{
    public static void main(String arr[])
    {
        int num [][] = new int[3][4];


        // Printing 2d array 
        
        for( int i = 0; i<3; i++)
        {
            for (int j =0; j<4; j++)
            {
                System.out.print(" Printing array num :- "+num[i][j]);
            }
            System.out.println();
        }

        // Assine value to 2d array 

        for(int i =0; i<3; i++)
        {
            for(int j =0; j<4; j++)
            {
                num[i][j] = (int)(Math.random() * 100); // Here we inserting random value to num array
            }
        }


        // Again prenting 
        for( int i = 0; i<3; i++)
        {
            for (int j =0; j<4; j++)
            {
                System.out.print(" Printing array num :- "+num[i][j]);
            }
            System.out.println();
        }

        // Printing Using an enhanced for loop:

        for( int n[]: num)
        {
            for(int j : n)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }   
}