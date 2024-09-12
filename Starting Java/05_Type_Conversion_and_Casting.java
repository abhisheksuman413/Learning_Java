 class Type_Conversion_and_Casting 
{

    public static void main(String a[])
    {
        // We cannot channge the type of variables 

        byte byte_variable = 127;

        int int_variable = 256;

        // byte_variable = int_variable; // this gives error because we put int_variable into byte_variable >>> int ko bye me dalege to kuch value ko lose kr dege isliye nhi bkr skte hai

        int_variable = byte_variable; // Yha error nhi aayega because byte ko int me dalege to koi vale ko ham lose nhi kr rhe hai isliye ye possible hai(range of byte is small as compare to int )
                                    // This is known as type conversion 
                                    // Implicit conversion from byte to int
                                    // Here byte variable become integer

    
        int int_variable1 = 12; 

        // byte_variable = int_variable // Yha int_variable ka 12 hai jo ki byte variable ke range(127) ke andr hai fir v error aayega because compiler int ko byte ke andr allow nhi krega chahe value jo v ho 

        // So yha int_variable ka type change kr dega isko type casting bolte hai

        byte_variable = (byte)int_variable1;  // Ye possible hai because yha type cast kr de rhe hai // Explicit casting from int to byte
        
        System.out.println(byte_variable);
        

        int int_variable2 = 257;


        byte byte_variable1 = (byte)int_variable2;
        /*
         >>> So yha pe int_variable2 ka value byte ke range(127) se jda hai 
         >>> So yha pe compiler % kja use krta hai 
         >>> 257 % 256 here 256 is whole range of byte (-ve to +ve )
         >>> 257 % 256 and we get remender here is 1 
         >>> So byte_variable1 me 1 store hoga 


         >>> ChatGpt se aaya tha 
         >>>The range of byte is from -128 to 127.
            When casting int (which has a larger range) to byte, any value outside the byte's range will cause overflow, resulting in wrapping around to a negative value.
            In the example above, 130 exceeds the range of byte, so it wraps around to -126.
         */
        System.out.println("Printing byte_variable1:- "+ byte_variable1); // So yha 1 print hoga 


        // int x = 5.6; // Yha v error aayega 
        float f = 5.6f;
        
        int x = (int)f; // Yha only 5 print nhi hoga because 5.6 ko int me convert kr diye hai >>> Yha point ke bad ke value ko lose kr dege 
        System.out.println("Printing x "+x);

        // Type Pormotion 

        byte ab = 10;
        byte cd = 30;

        // byte result = ab*cd; // This give error 
        int result = ab * cd ;
        
        System.out.println(result);
        /*
         >>> In Java, type promotion refers to the automatic conversion of smaller data 
            types to larger data types during operations or expressions to prevent data loss.
        >>> Yha result ka type int hai
         */
        


    }
}
