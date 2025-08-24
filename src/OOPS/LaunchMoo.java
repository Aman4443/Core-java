
package OOPS;
class Calculator{


     int add(int m, int n){
        return m+n;

    }
    double add(double z, double y){
         return z + y;
    }
    int add( int a, int b, int c){
         return a +b+c;
    }
}

public class LaunchMoo {
    public static void main(String[] args) {
        Calculator  cal=  new Calculator();
        System.out.println("result is : "+cal.add(4,7));
        float f = 10.2f;
        int a = 20;
        double z = 200.12;
        double y =400.24;
        int b = 30;
        int c = 50;


        System.out.println("result is : "+ cal.add(z,y));
        System.out.println("result is : "+cal.add(a,b,c) );



    }
}
