package OOPS;
class Book{
     private  int pageNumber;
    void display(int pageNumber){

        System.out.println("page Number is : "+pageNumber);
    }
    void setPageNumber(int pg){
         pageNumber =pg;

    }
    void display(){
        System.out.println("Page Number is :"+pageNumber);
    }
}
public class launchEncaplusation {
    public static void main(String[] args) {
        Book b = new Book();
        b.display(45);
        b.setPageNumber(80);
        b.display();

    }
}
