

/*
    
    *   In Java, arrays are fundamental data structures used to store multiple values of the same type in a 
        single variable. They are especially useful when you need to work with collections of fixed-size data. 
        Here's why arrays are important in Java:

            1. Efficient Data Storage
                --> Arrays provide a way to store a collection of data in a single variable. 
                    This reduces the need to declare multiple variables for similar types of data.
                --> The memory allocation is contiguous, meaning the elements are stored next to 
                    each other in memory, which makes accessing the elements faster.
            2. Fixed Size
                --> Arrays have a fixed size, which means you must know the number of elements the 
                    array will hold at the time of creation. This can be both a limitation and an 
                    advantage depending on your use case.
                --> Fixed size ensures that the program does not have to frequently resize or 
                    allocate memory during execution, which enhances performance.
            3. Random Access
                --> Arrays allow random access, meaning you can access any element in 
                    constant time using its index (i.e., array[index]).
                --> This makes arrays very efficient for scenarios where you need to 
                    frequently access elements by their index.
            4. Type Safety
                --> Java arrays are type-safe, meaning the data you store in an array is 
                    restricted to a particular type, ensuring that errors are caught at compile time.
            5. Use in Algorithms and Data Structures
                --> Arrays form the basis of many data structures, such as stacks, queues, and heaps.
                --> They are also heavily used in algorithms involving sorting, 
                    searching, and dynamic programming.

    * Accessing Array Elements
        --> You can access an element of an array by using its index, which starts from 0
        --> int firstElement = myArray[0];  // Access the first element (10)
        --> int secondElement = myArray[1]; // Access the second element (20)
    
    *Modifying Array Elements
        --> You can assign new values to specific elements in an array using their index.
        --> myArray[2] = 100;  // Change the third element to 100

    * Iterating Over Arrays
        --> You can use a loop to iterate through the elements of an array.

                -> Using a for loop:
                        for (int i = 0; i < myArray.length; i++) {
                            System.out.println("Element at index " + i + ": " + myArray[i]);
                        }
                -> Using an enhanced for loop:
                        for (int value : myArray) {
                           System.out.println("Array value: " + value);
                        }




 */





class Array
{
    public static void main(String arr[])
    {
        int nums[] ={1,2,5,7,9,10};
        System.out.println(nums[3]); // Printing arrat value

        nums[3] = 100; // Updating array value at index 3
        System.out.println(nums[3]);



        // Making Dynamic array 

        int num1[] = new int[5];  // Creating array of size 5 with empty value we will assign value later -> here all value of array is zero
        System.out.println(num1[3]);


        num1[0] = 4;
        num1[1] = 6;
        num1[2] = 45;
        num1[3] = 5;
        num1[4] = 65;

        System.out.println(num1[3]);

        // Iterating through Lopp(Using a for loop:)

        for(int i = 0; i<num1.length; i++)
        {
            System.out.println(" value of num1 at index "+i+" is "+num1[i]);
        }


        // Iterating through Lopp(Using an enhanced for loop:)
        for( int value : num1)
        {
            System.out.println(" num1 array value is :- "+ value);
        }

    }   
}
