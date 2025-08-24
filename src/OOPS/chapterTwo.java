

package OOPS;
import com.sun.security.jgss.GSSUtil;

import java.util.*;
class Telusko{
    int age;
    int yrs;
    String founder;


    int add(int m ,int n) {
        int num1 = m;
        int num2 = n;
        int res = num1 + num2;
        System.out.println("result is :" + res);
        return res;

    }

     int sub(int k ,int l){
        int ans = k -l;
        System.out.println("Substraction is : " +ans);
        return ans;
    }
    int mul(int h, int g){
        int nd = h*g;
        System.out.println("Multiplication is :" + nd);
        return nd;
    }
    int division(){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int u = sc.nextInt();
        int fys = f/u;
        System.out.println("division is : " +fys);
        return fys;
    }
}
public class chapterTwo {
    public static void main(String[] args) {
    Telusko tl   = new Telusko();
    tl.add(10,8);
    tl.sub(20,11);
    tl.mul(5,8);
    tl.division();
    }
}

