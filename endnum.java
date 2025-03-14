import java.util.Scanner;

public class endnum {
    public static void main(String[] args) {
    System.out.println("Enter n :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = n%10;
    System.out.println("end Num " + x);
    sc.close(); 
}
}
