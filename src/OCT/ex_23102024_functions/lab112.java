package OCT.ex_23102024_functions;
import java.util.Scanner;

public class lab112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();

        sub(a,b);
    }
    public static void sub(int n1, int n2){
        int sub = 0;
        sub = n1 - n2;
        System.out.println("Result = " + sub);
    }
}
