class While_Loop
{
    public static void main(String arr[])
    {
        

        /*
         * while Loop
             --> The while loop continues to execute a block of code as long 
                 as the given condition is true.
                
             --> while (condition) {
                        // Code to be executed
                    }

        */

        int x = 1;

        while(x<=5){
            System.out.println("I am inside while loop block and vale of x is :- "+x);
            x++;
        }


        // Nested while loop 
        int z=1;
        while(z<=5){
            System.out.println("I am inside while loop block and vale of z is :- "+z );

            int j = 1;
            while(j<=3){
                System.out.println("I am inside nested while loop block and vale of z is :- "+z + "  Value of j is :- "+j);
                j++;
             }
            z++;
        }
        
    }    
}
