import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter p :");
    int p = sc.nextInt();
    System.out.println("Enter t :");
    int t = sc.nextInt();
    System.out.println("Enter r :");
    double r = sc.nextDouble();

    double Amt = (p * t * r)/100;
    System.out.println("Simple Interest : " + Amt); 
    sc.close();  
}
}
