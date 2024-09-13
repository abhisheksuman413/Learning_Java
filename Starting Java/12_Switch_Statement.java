class Switch_Statement
{
    public static void main( String arr[])
    {
        


        /*
         * switch Statement
                --> The switch statement evaluates an expression and executes the 
                    corresponding case block that matches the value of the expression.
                --> Syntax

                        switch (expression) {
                            case value1:
                                // Code to execute if expression equals value1
                                break;
                            case value2:
                                // Code to execute if expression equals value2
                                break;
                            // More cases...
                            default:
                                // Code to execute if no case matches
                        }
        >>> Agr case ke sath break ka use nhi krte hai to switch jis case ko match krega uss case ke nhiche jitne v case hoge wo sare case ke code ko execute kr dega 
        >>> Isliye break use krna important hai 
        >>> Latest version of java me break ka use nhi krte hai uska dusra syntax hai see in next code 
         */


         int n=4;

         switch(n){
            case 1:
                System.out.println(" The day is Monday");
                break;
            case 2:
                System.out.println(" The day is Tuesday");
                break;
            case 3:
                System.out.println(" The day is Wednesday");
                break;
            case 4:
                System.out.println(" The day is Thursday");
                break;
            case 5:
                System.out.println(" The day is Friday");
                break;
            case 6:
                System.out.println(" The day is Saturday");
                break;
            case 7:
                System.out.println(" The day is Sunady");
                break;
            default: // Jb koi case magtch nhi krega to ye run hoga 
                System.out.println(" Enter a valid no ");
         }
    }    
}
