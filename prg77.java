import java.util.Scanner;

public class prg77 {
    public static void main(String[] args) {
    System.out.println("Enter n :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    n = (n*100)+77;
    System.out.println(n);
    sc.close();
}
}