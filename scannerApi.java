import java.util.Scanner;
public class scannerApi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        System.out.println("enter a number:");
        int b = sc.nextInt();
        System.out.println("sum = " + (a+b));


    }
}
