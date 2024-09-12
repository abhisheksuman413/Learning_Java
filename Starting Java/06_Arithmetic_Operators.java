class Arithmetic_Operators {
    public static void main(String args[]) {


        int num1 = 10;
        int num2 = 5;

        int resultAdd = num1 + num2;
        System.out.println("Printing resultAdd:- "+resultAdd); 
        
        int resultSubtract = num1 - num2;
        System.out.println("Printing resultSubtract:- "+resultSubtract); 
        
        int resultMultiply = num1 * num2;
        System.out.println("Printing resultMultiply:- "+resultMultiply); 
        
        int resultDivide = num1 / num2;
        System.out.println("Printing resultDivide:- "+resultDivide); 
        
        int resultRemender = num1 % num2;
        System.out.println("Printing resultRemender:- "+resultRemender); 
        
        
        num1 = num1+2;
        System.out.println("Printing num1:- "+num1);
        
        num1 +=2; // samed peration as num1 = num1+2; >>> ASa ham kisi operations ke liye kr skte hai (+,-,/,%)
        System.out.println("Printing num1:- "+num1);
        
        num1++; // Incrementing num1 by value 1   // post - increment
        System.out.println("Printing num1:- "+num1);
        
        num1--; // Decrementing num1 by value 1
        System.out.println("Printing num1:- "+num1);


        ++num1;  // pre - increment
        System.out.println("Printing num1:- "+num1);

        // pre - increment And // post - increment

        int num4 = 9;
        int num5 = 9;

        int resultOfNum4 = ++num4; // Yha 10 value store hoga >>> operation hone ke bad store ho rha hai >>>First increament itself then fetch the value 
        int resultOfNum5 = num5++; // Yha 9 value store hoga  >>> Sore hone ke bad operation ho rha hai >>> First fetch vale then increament 

        System.out.println("Printing resultOfNum4:- "+resultOfNum4);
        System.out.println("Printing resultOfNum5:- "+resultOfNum5);







    }
}
