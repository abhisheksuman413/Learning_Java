class Ternary_Operator
{
    public static void main (String arr[])
    {
        


        /*
         * Ternary Operator in Java
                --> The ternary operator is a shorthand way to write a simple if-else statement. 
                    It evaluates a condition and returns one value if true and another value if false.
                --> variable = (condition) ? value_if_true : value_if_false;
            
         * Multiple conditions in Ternary Operator (? :)
                ---> In Java, the ternary operator (? :) can handle multiple conditions by nesting them, 
                     though this can become less readable as more conditions are added. Here's the general 
                     syntax for using multiple conditions within the ternary operator:
                --->result = (condition1) ? value_if_true1 :
                             (condition2) ? value_if_true2 :
                             (condition3) ? value_if_true3 :
                             value_if_all_false;

         */


        int n=4;
        int result =0;

        // If n is even i want to store result = 10 If n i odd i wnat to store result = 20
        
        result = n%2 == 0 ? 10 : 20;
        System.out.println(result);

        n = 3;

        result = n%2 == 0 ? 10 : 20;
        System.out.println(result);


        // Multiple conditions in Ternary Operator (? :)

        int score = 85;
        String grade = (score >= 90) ? "A" :
                       (score >= 80) ? "B" :
                       (score >= 70) ? "C" :
                       (score >= 60) ? "D" : "F";
            
        System.out.println("Grade: " + grade);


    }    
}
