package OCT.ex_23102024_functions;
import java.util.Scanner;

public class lab113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age");
        int age = sc.nextInt();

        calculate(age);

    }
    public static void calculate(int x){
        if(x >= 18){
            System.out.print("You can give vote");
        }else {
            System.out.println("You cant give vote");
        }

    }
}
