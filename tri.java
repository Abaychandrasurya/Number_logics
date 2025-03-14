import java.util.Scanner;

public class tri {
    public static void main(String[] args) {
    System.out.println("Enter h :");
    Scanner sc = new Scanner(System.in);
    double h = sc.nextDouble();
    System.out.println("Enter b :");
    double b = sc.nextDouble();
    double tri = 0.5 * h * b;
    System.out.println("Area of RECT  = " + tri +" sqm" );
    sc.close();
   }
}