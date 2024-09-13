class do_while_Loop
{
    public static void main( String arr[])
    {
        

        /*
         * do-while Loop
                --> The do-while loop is similar to the while loop, but it guarantees that the 
                    loop body will be executed at least once, even if the condition is false at 
                    the start.
                --> do {
                        // Code to be executed
                    } while (condition);

         */


        int i = 1;

        do{
            System.out.println("I am inside do while loop block and vale of i is :- "+i);
            i++;
        }while(i<=5);


        int j = 8;

        do{
            System.out.println("I am inside do while loop block and vale of j is :- "+j);
            j++;
        }while(j<=5);
    }    
}
