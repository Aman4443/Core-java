package OOPS;
class Student{
    int age;
    int id;
    String Name;

    void eat(){
        System.out.println("Student is Eating");
    }
    void sleeping(){
        System.out.println("Student is Sleeping");
    }
     void talking(){
         System.out.println("Student is Talking");
     }
}
public class Revision {
    public static void main(String[] args) {
      Student stu =  new Student();
      stu.eat();
      stu.sleeping();
      stu.talking();
    }
}
