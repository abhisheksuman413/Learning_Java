class Stack_And_Heap
{
    public static void main( String arr[])
    {




        /*
         *  In Java, Stack and Heap are two areas of memory where different types of data 
            are stored during the execution of a program. Understanding the differences between 
            stack and heap memory is crucial for memory management and performance optimization.

         1. Stack Memory
            --> Stack memory is used for static memory allocation and stores:
                        -> Method calls (also known as call stack).
                        -> Local variables (variables declared inside methods, constructors, or blocks).
                        -> References to objects that are stored in the heap (but not the actual objects themselves).

            --> The stack follows a Last In, First Out (LIFO) principle, where the last method call 
                or variable pushed onto the stack is the first to be popped off when the method returns.

            --> Key Characteristics of Stack Memory:
                    ->  Memory Allocation: Done when a method is invoked and released when the 
                        method call is complete.

                    ->  Size: Relatively small compared to the heap. Its size is determined 
                        by the operating system when the JVM starts.

                    ->  Lifetime: Variables on the stack only exist as long as the method is 
                        executing. Once the method completes, the stack frame (which includes 
                        local variables and method information) is removed, and the memory is freed.

                    ->  Speed: Stack memory is faster to access than heap memory due to 
                        its simpler memory allocation model (LIFO).

                    ->  Thread Safety: Each thread has its own stack, so there is no need 
                        for synchronization when accessing stack variables, 
                        making it thread-safe.

         2. Heap Memory
            --> Heap memory is used for dynamic memory allocation. All objects and class-level 
                variables (like static variables) are stored in the heap. Unlike stack memory, 
                the heap is not managed automatically in a LIFO manner, but instead, it requires 
                more sophisticated memory management techniques like Garbage Collection to free 
                up memory used by objects that are no longer in use.

            --> Key Characteristics of Heap Memory:
                    ->  Memory Allocation: Happens dynamically, usually when new 
                        objects are created using the new keyword.

                    ->  Size: The heap is much larger than the stack. Its size is controlled by the 
                        JVM (and can be configured using JVM options like -Xmx and -Xms).

                    ->  Lifetime: Objects created in the heap have global access and remain 
                        in memory until they are no longer referenced and are garbage collected.

                    ->  Speed: Access to heap memory is slower compared to stack memory due to 
                        the overhead of managing dynamically allocated memory.
                        
                    ->  Thread Safety: Heap memory is shared between all threads in a 
                        Java application, so multiple threads can access the same objects. 
                        This makes it susceptible to concurrency issues and often 
                        requires synchronization.




            NOTE :- For details information see hand writen notes
         */
    }    
}
