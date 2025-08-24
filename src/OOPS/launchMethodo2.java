package OOPS;

import javax.swing.plaf.metal.MetalLabelUI;

class Multiply{

   void  multiply(int a ,int b){
        int res = a +b;
         System.out.println(res);
    }
    void multiply(float a, int b){
         float s = a + b;
    }

}
public class launchMethodo2 {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        m.multiply(10,10);
        main(20);


    }
    public static void main(int a){
        System.out.println("print the :" +a);
    }
    public static void main(String b){

    }
}
