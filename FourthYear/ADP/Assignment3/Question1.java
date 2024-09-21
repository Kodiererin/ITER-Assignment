import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Question : 1.	Write a POJO class named Person with the following details
a.	Name (String)
b.	Age (int)
c.	City (String)
d.	Phone number (List)
take the input from user and print the details.

 */

public class Question1 {
    public static void main(String[] args) {
        POJO obj = new POJO();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
            obj.setName(sc.nextLine());
        System.out.println("Enter the age");
            obj.setAge(sc.nextInt());
        System.out.println("Enter The City");
            obj.setAge(sc.nextInt());
        System.out.println("Enter the List of Phone Numbers ");
            ArrayList<Long> list = new ArrayList<>();
        System.out.println("Press 0 to Exit");
            long x = sc.nextLong();
            while(x!=0){
                list.add(x);
                x = sc.nextLong();
            }
            obj.setPhoneNo(list);

        // Display the Data.
        System.out.println("The Name is "+obj.getName());
        System.out.println("The Age is "+obj.getAge());
        System.out.println("The City is "+obj.getCity());
        System.out.println("The Phone Numbers are ");
        for(int i=0 ; i<obj.getPhoneNo().size() ; i++){
            System.out.println(obj.getPhoneNo().get(i));
        }
    }
}


class POJO{
    String Name;
    int Age;
    String City;
    List<Long> phoneNo;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public List<Long> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(List<Long> phoneNo) {
        this.phoneNo = phoneNo;
    }

}