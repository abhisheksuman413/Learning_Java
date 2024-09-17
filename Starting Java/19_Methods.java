


/*
 * In Java, methods are blocks of code that perform a specific task. They allow you to organize and reuse code efficiently.
   A method in Java is similar to a function in other programming languages.

  * Key Components of a Method:
        ---> Return Type: The data type of the value the method returns (e.g., int, void, String).
        ---> Method Name: A unique identifier for the method. It should follow naming conventions, 
            typically starting with a lowercase letter.
        ---> Parameter List: The input to the method, enclosed in parentheses, 
            which can be used inside the method. Parameters are optional.
        ---> Method Body: The block of code that defines the task the method will perform.
        ---> Return Statement: (Optional) It specifies what value the method 
            should return. If the method's return type is void, it does not return any value.
 */



class computer
{
    public void playMusic()
    {
        System.out.println(" Playing Music ");
    }

    public String getPen(int cost )
    {
        if( cost >= 10 )
        {
            return " Pen ";
        }
        else
        {
            return " Pen is not at this price ";
        }
    }
}

class Methods {
    public static void main(String arr[]) {

        computer obj = new computer();
         obj.playMusic(); // Calling method playMusic()

        String Result1 =  obj.getPen(9); // Calling method getPen() with cost value 9
        System.out.println(Result1);
        String Result2 =  obj.getPen(10); // Calling method getPen() with cost value 10
        System.out.println(Result2);
    }
}
