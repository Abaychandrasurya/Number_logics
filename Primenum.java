import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
    System.out.println("Enter n :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n== 2 || n ==3 || n==5) {
        System.out.println("Prime number");
    }
    else if (n%2 ==0 || n%3 ==0 || n%5==0 ){
        System.out.println("it is not Prime Number");
    }
    else {
        System.out.println("Prime number");
    }
    sc.close();
}
}
