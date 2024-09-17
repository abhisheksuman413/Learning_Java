

class Student
{
    int rollno;
    String name;
    int marks;
}


class Array_of_Objects
{
    public static void main(String arr []) 
    {
        Student s1 = new Student();
        s1.rollno =1;
        s1.name = "Abhishek";
        s1.marks = 25;

        Student s2 = new Student();
        s2.rollno =2;
        s2.name = "Rohit";
        s2.marks = 5;

        Student s3 = new Student();
        s3.rollno =3;
        s3.name = "Shyam";
        s3.marks = 65;



        Student demo_student[] = new Student[3];
        demo_student[0]=s1;
        demo_student[1]=s2;
        demo_student[2]=s3;



        for( int i =0; i<demo_student.length; i++)
        {
            System.out.println(demo_student[i].name + "  " + demo_student[i].marks);
        }

        //Using an enhanced for loop:

        for(Student stud: demo_student)
        {
            System.out.println(stud.name + "  " + stud.marks);
        }

    }    
}
