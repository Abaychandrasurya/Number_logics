import java.util.Scanner;

public class end1 {
    public static void main(String[] args) {
    System.out.println("Enter n :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = n/10;
    System.out.println("Num without End " + x);
    sc.close(); 
}
}
