

/*
     *  In Java, a String is an object that represents a sequence of characters. 
        Strings are widely used in Java programming, and they are immutable, meaning 
        once a String object is created, it cannot be modified. Any operations that 
        alter the String result in the creation of a new String object.



        >>> String in java is not a premative data type its a class in java 

 */




class String_example
{
    public static void main(String aa[])
    {
        String name = "navin"; // String in java is not a premative data type its a class in java 

        // For creating a class object we need to new keyword but here we don't use new keyword 

        String name1 = new String("navin1");

        System.out.println(name1);
        System.out.println("Hello "+name1);
        System.out.println(name1.charAt(2));


        /*
         >>> So in java hame new keyword ka use nhi krna pdta hai String create krne ke liye 
         >>> Hamlog direct String name = "navin"  kr ke create krte hai 
         */

    }
}
