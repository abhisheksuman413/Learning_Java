

/*
          Object Oriented Programing
          
          * Object -> Every object have properties and Behaviour
                   -> In java if we have to create object first we have to create class
                   -> JVM create object in java 

          * Class -> class is act as a blueprint for object

          * Class
                -> A class is a blueprint or template for creating objects. 
                -> It defines properties (attributes) and behaviors (methods) 
                   that the objects created from the class will have. 
                -> In Java, classes contain fields (variables) and methods (functions) 
                   to define the state and behavior of the objects.
         * Key Points:
                -> Class is a blueprint, and Object is an instance of that class.
                -> Classes define the attributes (fields) and behaviors (methods) that the objects will have.
                -> Objects are created from classes and store specific data in the attributes defined by the class.
         */



// Creating calss
class Calculator
{
    public void print()
    {
        System.out.println("I am call from calc class");   
    }


    public int Add(int N1, int N2)
    {
        int R = N1 + N2;
        return R;
    }
}



class Class_And_Object
{
    public static void main(String arr[])
    {

        int num1 =4;
        int num2 =9;  // Here int is premitive data type and num2 is premitive variables

        // Creating object of class 


        Calculator calc_object = new Calculator();    // Here Calculator is non premitive data type and calc_object is non premitive variables(reference variables)
                                                     // When we create a bject JVM will allocate space 

        calc_object.print(); // Access print() method of Calculator class in Class_And_Object class with the help of calc_object(Calculator class)


        int result = calc_object.Add(num1, num2);

        System.out.println(result);
        
    }    
}








