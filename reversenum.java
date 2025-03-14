import java.util.Scanner;

public class reversenum {
     public static void main(String[] args) {
    System.out.println("Enter n :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x=0;
    int a=0;
    while(n>10){
        x = n%10;
        a = a*10 + x;
        n = n/10;
    }
    n = a *10 + n;
    System.out.println(n);
    sc.close();
}
}
