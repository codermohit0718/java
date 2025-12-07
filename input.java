import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;

        System.out.printf("The area of circle is %.2f", area);
    }
}
