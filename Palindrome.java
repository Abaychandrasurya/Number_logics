import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    System.out.println("Enter n :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y =n;
    int x=0;
    int a=0;
    while(n>10){
        x = n%10;
        a = a*10 + x;
        n = n/10;
    }
    n = a *10 + n;
    if(n==y){
        System.out.println("it is Palindrome");
    }
    else{
        System.out.println("it is not palindrome");
    }
    sc.close();
}
}