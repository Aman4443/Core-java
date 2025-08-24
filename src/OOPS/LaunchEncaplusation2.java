package OOPS;
class Employee{
   private int id;
     private String Name;
     private int  age;

     void setid(int id){
         id = id;
     }
     void setName(String Name){
         Name = Name;
     }
     void SetAge(int age){
         age = age;
     }
     // geeter
    int getId(){
         return id;
    }
   String getName(){
         return Name;
    }

     int getage(){
         return age;
    }
}
public class LaunchEncaplusation2 {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.setid(45);
        em.setName("Anay Shukla");
        em.SetAge(22);
        System.out.println(em.getId());
        System.out.println(em.getName());
        System.out.println(em.getage());
    }
}
