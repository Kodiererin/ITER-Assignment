package Assignment1_Java;

import java.util.Scanner;
// Q20. Write program to create a class Student having membervariable name, rn, age. Addrequired set, get and constructer to Student class.Crate an array of student object and sort it according to rn in ascending order.
class Student
{
    Student(String name,int roll , int age)
    {
        setAge(age);
        setName(name);
        setRoll(roll);
    }
    private String name;
    private int roll;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}


public class q_20 {

    public  void sort(Student[] arr)
    {
        for(int i=1 ; i<arr.length ; i++)
        {
            int j=i;
            while(j>=0 && arr[j].getRoll()<arr[i].getRoll())
            {
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        display(arr);
    }

    public void display(Student[] abc)
    {
        for(int i=0 ; i<abc.length ; i++)
        {
            System.out.println("Student Name -"+abc[i].getName()+" Student Age -"+abc[i].getAge()+" Student Roll No -"+abc[i].getAge());
        }
    }

    public static void main(String[] args) 
    {
        System.out.println("Student Class"); 
        System.out.println("Enter The Strength of the Class");
        Scanner sc= new Scanner(System.in);
        int Strength = sc.nextInt();
        Student[] obj = new Student[Strength];
        System.out.println("Enter Student Name , Roll No and Age");
        for(int i=0 ; i<obj.length ; i++)
        {
            obj[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt());
        }


        q_20 objStudent = new q_20();
        objStudent.sort(obj);

    }
}
