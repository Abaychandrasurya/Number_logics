import java.util.Scanner;

public class startingnum {
    public static void main(String[] args) {
    System.out.println("Enter n :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>10){
        int x = n%10;
        n = n/10;
    }
    System.out.println(n);
    sc.close();
}
}
