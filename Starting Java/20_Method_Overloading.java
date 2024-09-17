


/*
         *  Method Overloading in Java is a feature that allows a class to have multiple methods 
            with the same name but different parameter lists. It’s a way to perform polymorphism 
            (specifically, compile-time polymorphism) where the method to be called is determined at 
            compile time based on the method signature.

         * Key Rules of Method Overloading:
                    --> Different Number of Parameters: You can overload a method by 
                        changing the number of parameters.
                    --> Different Data Types of Parameters: You can overload a 
                        method by changing the types of parameters.
                    --> Different Order of Parameters: You can overload a method by 
                        changing the order of the parameters if they have different types.
                    --> Cannot Overload by Changing Return Type Alone: The return type alone 
                        is not enough to overload a method. The method signatures 
                        (parameter lists) must differ.

                        
    >>> NOTE:- Method overloding and Method overriding is two different things we study later
*/
class Calculator1
{
    // Changing no of parameters with same method name 
    public int add( int num1, int num2)
    {
        return num1+num2;
    }
    public int add(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
    public int add(  int num1, int num2, int num3, int num4)
    {
        return num1+num2+num3+num4;
    }
    public double add( double num1, int num2, int num3, int num4)
    {
        return num1+num2+num3+num4;
    }
    
}




class Method_Overloading
{
    public static void main( String arr[])
    {
        Calculator1 calc = new Calculator1();

        // On basis of parameters differnt method is called 
        int Result1 = calc.add(15, 20); // Calling add() method with 2 parameters with same name 
        System.out.println(Result1);

        int Result2 = calc.add(1, 25,7); // Calling add() method with 3 parameters with same name 
        System.out.println(Result2);

        int Result3 = calc.add(15, 20,56,30);  // Calling add() method with 4 parametrs with same name 
        System.out.println(Result3);


        double Result4 = calc.add(15.30, 20,56,30);  // Calling add() method with 4 parametrs and different type of parameters with same name  
        System.out.println(Result4);

    }
}
