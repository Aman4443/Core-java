package Pattern;
import java.util.*;
public class TPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter the Value of n : ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n ; j++) {
                    if(i==0 || j==(n-1)/2){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
        }
    }
}
