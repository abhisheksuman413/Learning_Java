



/*
    * Immutable Strings (Java String)
        --> A String in Java is immutable, meaning that once a String object is created, its 
            value cannot be changed. Any operation that attempts to modify a String (like concatenation 
            or replacement) creates a new String object in memory, leaving the original string unchanged.

        --> Why Strings Are Immutable:
                ->  Security: Immutable strings are safe for use in multithreaded environments. 
                    Since the value of a String cannot be changed, they can be shared between 
                    multiple threads without any risk of inconsistency.
                ->  String Pooling: Java maintains a special memory region called the String pool, 
                    where string literals are stored. When a new string is created, Java checks if an 
                    identical string already exists in the pool. If it does, the existing string 
                    reference is reused, saving memory. Immutability ensures that pooled strings 
                    remain unchanged.
                
                -> Java heap memory me String Constant pool ka eak area hota hai jha sare string object store hota hai 

                ->  Caching: Because strings are immutable, their hash codes can be cached, 
                    making them more efficient when used in data structures like hash 
                    tables (HashMap, HashSet).
    * Mutable Strings (StringBuilder and StringBuffer)

        --> In Java, if you need a string whose content can be changed after it is created, 
            you can use either StringBuilder or StringBuffer. These classes represent mutable 
            sequences of characters.
 */



class Mutable_vs_Immutable_String
{
    public static void main(String arr[])
    {

        // This is Immutable Strings
        String name = "navin";
        name = name +" Reddy"; // Here we not changing the existing String "navin" here we creating new String "navin Reddy"
                              // Here only change the reference value of name 
                              // Yha kuch der bad "navin" object destroy ho jyega heap meamory se because wo unuse hai(It is part of garbage collection)
        System.out.println(name);


        String s1 = "Navin";


        String s2 = "Navin"; // In heap memory onother "Navin" object create nhi ho rha hai wahi object ka reference yha pass ho rha hai

        // Example 
        System.out.println(s1 == s2); // Yha true aayega because s1 & s2 dono same object ko point kr rhe hai

    }    
}
