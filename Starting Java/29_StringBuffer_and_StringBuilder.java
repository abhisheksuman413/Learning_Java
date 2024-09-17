



/*
    *  Mutable Strings (StringBuilder and StringBuffer)
            --> In Java, if you need a string whose content can be changed after it is created, 
                you can use either StringBuilder or StringBuffer. These classes represent mutable 
                sequences of characters.

            --> StringBuilder:
                    -> Used for creating mutable strings.
                    -> Not thread-safe, meaning it is not synchronized and should not be used in 
                       multithreaded environments unless external synchronization is provided.
                    -> It is faster than StringBuffer because it doesn’t have the overhead of synchronization.

            --> StringBuffer:
                    -> Similar to StringBuilder but is thread-safe due to synchronization.
                    -> Slightly slower than StringBuilder because of the overhead of synchronization.
                    -> Suitable for use in multithreaded environments.

                    -> StringBuffer buffer size deta hai jo ki 16 byte ka hota hai
 */



class StringBuffer_and_StringBuilder
{
    public static void main(String arr[])
    {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());  // Here we printing the capacity of StringBuffer sb(So yha 16 print hoga because StringBuffer buffer size 16 byte ka hota hai)
        StringBuffer sb1 = new StringBuffer("Navin");
        System.out.println(sb1.capacity()); // Yha 21 print hoga beacuse 16 + 5("Navin") >>> Yha capacity expand ho jyega 

        sb1.append(" Reddy");
        System.out.println(sb1);

        // String str = sb1  >>> Yha error aayega because of type missmatch so
         String str = sb1 .toString(); // yha sb1 ko String me convert kr rhe hai  

         StringBuffer sb2 = new StringBuffer("Navin");


         sb2.deleteCharAt(3);
         System.out.println(sb2);
         
         sb2.insert(0, "Java");
         System.out.println(sb2);

         sb2.setLength(30); // Yha sb2 ka length 30 set kr he hai jitna me "Navin" store hoga uske bad ka value null set hoga 
    }    
}



/*
 *  Comparison between Immutable String, StringBuilder, and StringBuffer
 * 
 *  Feature                   | String (Immutable)                            | StringBuilder (Mutable)                 |  StringBuffer (Mutable & Thread-safe)
 *  ------------------------- | --------------------------------------------  | --------------------------------------  | ------------------------------------
 *  Mutability                | Immutable                                     | Mutable                                 | Mutable
 *                            | Once a String object is created, it           | StringBuilder allows modifications      | tringBuffer allows modifications
 *                            | cannot be changed. Any operation that         | without creating new objects.           | without creating new objects, and is
 *                            | modifies it creates a new object.             |                                         | synchronized, making it thread-safe.
 *  ------------------------- | --------------------------------------------  | --------------------------------------  | ------------------------------------
 *  Thread-Safety             | Thread-safe (due to immutability)             |  Not thread-safe                        |  Thread-safe (synchronized)
 *                            | Since String objects are immutable, they      | StringBuilder is not synchronized and   | StringBuffer is synchronized, making 
 *                            | can be safely used across multiple threads.   | not safe to use in multi-threaded apps  | it safe to use in multi-threaded apps.
 *  ------------------------- | --------------------------------------------  | --------------------------------------  | ------------------------------------
 *  Performance               | Slower in modifications (new object created)  |  Faster (modifies in-place)             |  Slower (due to synchronization)
 *                            | Modifying a String creates a new object,      | StringBuilder modifies the original     | StringBuffer has the overhead of 
 *                            | which can lead to performance overhead if     | object in-place, making it faster       | synchronization, making it slower
 *                            | done frequently.                              | than String for frequent modifications  | than StringBuilder.
 *  ------------------------- | --------------------------------------------  | --------------------------------------  | ------------------------------------
 *  Use Case                  | Best for strings that don’t change often      |  Best for frequent changes in a         |  Best for frequent changes in a 
 *                            | or for small modifications.                   | single-threaded environment.            | multi-threaded environment.
 *  ------------------------- | --------------------------------------------  | --------------------------------------  | ------------------------------------
 *  Memory Usage              | Higher (creates a new object on each change)  |  Lower (modifies in-place)              |  Lower (modifies in-place)
 *                            | Due to the creation of new String objects     | Modifications happen in the same        | Modifications happen in the same 
 *                            | on each modification, it uses more memory.    | StringBuilder object, saving memory.    | StringBuffer object, saving memory.
 */
