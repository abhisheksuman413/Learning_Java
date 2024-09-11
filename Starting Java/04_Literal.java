class Literal
{
 
    public static void main( String a[])
    {
        int num1 = 100000000;
        int num2 = 10_00_00_00_0; // Java me upper wale ko ase v likh skte hai print krne pe without _ ke aayega 

        System.out.println(num1);
        System.out.println(num2);


        double num3 = 56; // yha error nhi aayega because int float me conver ho ja rha hai
        System.out.println(num3);

        // boolean value = 1; // ye java me error dega becaouse int cannot convert into boolean

        char c ='a';
        // char is also treated as integers

        System.out.println(c);
        c++;
        System.out.println(c); // here it print b 



    }
}
