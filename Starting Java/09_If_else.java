class If_else {
    public static void main(String arr[]) {

        /*
         * if Statement
            -->The if statement evaluates a condition and executes the block of code 
               inside the statement if the condition is true.
            --> if (condition) {
                  // Code to execute if the condition is true
                }
         * if-else Statement
            -->The if-else statement provides an alternative action if the condition is false.
            --> if (condition) {
                 // Code to execute if the condition is true
                } else {
                    // Code to execute if the condition is false
                }
        >>> We can put muiltipal condation in condition section 
        >>> Jb eak statement hai if else me to {} use krne ka need nhi hota hai 
        >>> jb eak se jda statement hoga if else me to {} use krna mandatory ho jyega 
         */


        if(true)
            System.out.println("I am inside if block ");
        

        int a = 8;
        int b = 12;

        if (a < 10) {
            System.out.println("I am inside if block ");
            System.out.println("Thank You ");
        } else {
            System.out.println("I am inside else block ");
        }

        // Bina {} ke v likh skte hai error nhin aayega(jb tak eak statement hai if else me tb tak) 
        if (a > 10) 
            System.out.println("I am inside if block ");
        else 
            System.out.println("I am inside else block ");

        // Agr a bda hai to a value print hoga Or b bda hai to b ka value print hoga
        if(a>b)
            System.out.println("Prnting value of a :- "+a);
        else
            System.out.println("Prnting value of b :- "+b);


        
    }
}
