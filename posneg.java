import java.util.Scanner;

public class posneg {
    
    public static void main(String[] args) {
    System.out.println("Enter n :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n>0){
        System.out.println("Positive");
    }
    else if (n == 0) {
        System.out.println("ZERO");
    } else {
        System.out.println("negative");
    } 
    sc.close();
}
}
