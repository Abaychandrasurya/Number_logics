import java.util.Scanner;

public class evodd {
    public static void main(String[] args) {
    System.out.println("Enter n :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n%2==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
    sc.close();
}
}
