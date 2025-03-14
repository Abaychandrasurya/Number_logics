import java.util.Scanner;

public class sumn1 {
    
    public static void main(String[] args) {
    System.out.println("Enter n :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i=0;i<n+1;i++){
        sum = sum + i;
    }
    System.out.println("Sum of n = " + sum);
    sc.close();
}
}
