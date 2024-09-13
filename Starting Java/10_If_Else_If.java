class If_Else_If
{
    
    public static void main( String arr[])
    {
        /*
         * if-else if-else Ladder
                --> This structure is used when multiple conditions need to be evaluated. 
                    The first if condition is checked, and if it is false, the next else 
                    if condition is checked, and so on. If none of the conditions are true, 
                    the else block is executed.
                --> if (condition1) {
                        // Code to execute if condition1 is true
                    } else if (condition2) {
                        // Code to execute if condition2 is true
                    } else {
                        // Code to execute if both conditions are false
                    }
         */

         if(false){
            System.out.println("I am inside if block ");
         }
         else if(true){
            System.out.println("I am inside else if block ");
         }else{
            System.out.println("I am inside else block ");
         }

         int x=8;
         int y=9;
         int z=6;

         // Now we have to check greatest of three
         if(x>y && x>z){
            System.out.println("Prnting x because is greate :- "+x);
         }
         else if(y>x && y>z){
            System.out.println("Prnting y because is greate :- "+y);
         }
         else{
            System.out.println("Prnting z because is greate :- "+z);
         }

    }
}
