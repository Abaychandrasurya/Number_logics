import java.util.Scanner;

public class Greatn3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n1 :");
    int n1 = sc.nextInt();
    System.out.println("Enter n2 :");
    int n2 = sc.nextInt();
    System.out.println("Enter n3 :");
    int n3 = sc.nextInt();

    if (n1>n2 && n1>n3 ){
        System.out.println( n1 + " is greater");
    }
    else if (n2>n1 && n2>n3) {
        System.out.println( n2 + " is greater");
    } else {
        System.out.println( n3 + " is greater");
    }
    sc.close();
    }
}

