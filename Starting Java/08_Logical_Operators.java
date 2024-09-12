class Logical_Operators
{
    public static void main( String arr[])
    {
        /*
         >>>  AND(&) --> Isme dono operations true hona chiye
                  --> True True --> True
                  --> True False --> False
                  --> False True --> False
                  --> False False --> False

         >>> OR(|) --> Isme koi eak operation true hoga to chlega 
                --> True True --> True
                --> True False --> True
                --> False True --> True
                --> False False --> False

        >>> Not(!) --> Isme result opposite ho jta hai example
                --> True --> False 
                --> False --> True 

        >>> Inn sare operator ko ham coding me directly use nhi kr skte hai iske liye hmko short-circuiting  krna pdta hai 

            --> AND -> &&
            --> OR -> ||
            --> Not -> !

        >>> short-circuiting called because 
            --> In And if first statement is false dusre statement ke liye jayega hi nhi  False return kr dega 
            --> In OR if first statement is True dusre statement ke liye jayega hi nhi  True return kr dega 
            
         */


         int x =9;
         int y =5;
         int a =3;
         int b =5;
         int z = 1;



         // AND
         boolean result1 = x > y && a < b; // Print true becouse both statement is true 
         System.out.println("Printing Result1 :- "+result1);
         boolean result2 = x > y && a > b; // Print False because 2nd statement is false 
         System.out.println("Printing Result2 :- "+result2);


         // OR
         boolean result3 = x > y || a > b; // Print true becouse both statement is true 
         System.out.println("Printing result3 :- "+result3);
         boolean result4 = x > y || a < z; // Print true becouse one statement is true 
         System.out.println("Printing result4 :- "+result4);
         boolean result5 = x < y || a < z; // Print false becouse both statement is false 
         System.out.println("Printing result5 :- "+result5);
         
         

         // NOT
         boolean p = true;
         boolean q = !p;
         System.out.println("Printing q :- "+q);


    }    
}
