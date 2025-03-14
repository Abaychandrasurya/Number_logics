import java.util.Scanner;

public class area {

   public static void main(String[] args) {
    System.out.println("Enter l :");
    Scanner sc = new Scanner(System.in);
    double l = sc.nextDouble();
    System.out.println("Enter b :");
    double b = sc.nextDouble();
    double sqr = l * l;
    double rect = l * b; 

    System.out.println("Area of RECT  = " + rect + " sqm" );
    System.out.println("Area of SQR  = " + sqr + " sqm");
    sc.close();
   }
}

