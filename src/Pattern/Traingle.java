package Pattern;

public class Traingle {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if(i+j==3 || i+j == 10 || i-j ==3 || j-i ==3){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
