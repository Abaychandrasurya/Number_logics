import java.util.Scanner;

public class Greatn2 {
    
    public static void main(String[] args) {
    System.out.println("Enter n1 :");
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    System.out.println("Enter n2 :");
    int n2 = sc.nextInt();

    if (n1>n2){
        System.out.println( n1 + " is greater");
    }
    else{
        System.out.println( n2 + " is greater");
    }
    sc.close();
}
}
