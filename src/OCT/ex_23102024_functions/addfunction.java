package OCT.ex_23102024_functions;
import java.util.Scanner;

public class addfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

       sum(n1,n2);

    }
    public static void sum(int a, int b){
        int sum= 0;
        sum = a + b;

        System.out.println("Result = "+ sum);

    }
}
