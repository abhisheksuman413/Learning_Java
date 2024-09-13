class For_Loop
{
    public static void main(String arr[])
    {
        

        /*
         * for Loop
                --> The for loop is commonly used when the number of iterations is known beforehand. 
                --> It consists of three parts: initialization, condition, and increment/decrement.

                --> for (initialization; condition; increment/decrement) {
                        // Code to be executed
                    }

        */


        // In a increment order 
        for( int i=1; i<=5; i++){
            System.out.println("I am inside while loop block and vale of i is :- "+i);
        }

        // In a decreament order 

        for( int i=5; i>=1; i--){
            System.out.println("I am inside while loop block and vale of i is :- "+i+ " In a decreament order ");
        }


        // Nested for loop

        for( int i=1; i<=5; i++){
            System.out.println("I am inside while loop block and vale of i is :- "+i);

            for( int j=1; j<=5; j++){
                System.out.println("I am inside nested while loop block and vale of i is :- "+i + " Value of j is :- " + j);
            }
        }
    }    
}
