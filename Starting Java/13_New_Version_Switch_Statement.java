class New_Version_Switch_Statement
{
    public static void main( String arr[])
    {
        /*
         * Key Features of the New Switch Syntax:
                --> Switch as an Expression: The switch block can return a value.
                --> Arrow (->) Syntax: Simplified syntax without needing break statements.
                --> yield for Returning Values: Instead of using return, the yield keyword is 
                    used to return values from the switch expression.
                --> Multiple Case Labels: You can now specify multiple case labels with commas.
         */


         String day = "Sunday";
         String result = "";

         switch(day){
            case "Saturday", "Sunday" -> result = "6 Am";

            case "Monday"-> result = "8 Am";

            default -> result = "7 Am";
         }
         System. out.println(result);



         // Switch as an Expression: 

         String day1 ="Monday";

         String result1 = switch(day1){
            case "Saturday", "Sunday" ->  "6 Am";

            case "Monday"-> "8 Am";

            default ->  "7 Am";
         }; // We have to put ; here because this is a Expression 
         System. out.println(result1);


         // yield for Returning Values

         String day2 = "Sunday";
         String result2="";

         result2 = switch(day2){
            case "Saturday", "Sunday" : yield "6 Am";

            case "Monday" : yield "8 Am";

            default : yield "7 Am";
         };
         System. out.println(result2);
    }    
}
