import java.util.Scanner;
public class divident{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter divisor:");
        int divisor = sc.nextInt();
        System.out.printf("enter quotient:");
        int quotient = sc.nextInt();
         System.out.printf("enter remainder:");
        int remainder= sc.nextInt();
        double divident = (divisor*quotient)+remainder;
        System.out.printf("the divident is:%f",divident);
    }
}
