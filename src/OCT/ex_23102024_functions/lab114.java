package OCT.ex_23102024_functions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class lab114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();

        checkOddEven(n);
    }
    public static void checkOddEven(int num){
        if(num % 2 == 0){
            System.out.print("Even number");
        }else {
            System.out.println("odd number");
        }
    }
}
