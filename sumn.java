import java.util.Scanner;

public class sumn {
    
    public static void main(String[] args) {
    System.out.println("Enter n :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = (n*(n+1))/2;

    System.out.println("Sum of n =" + sum);
    sc.close();

}
    
}
