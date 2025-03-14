import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
    System.out.println("Enter year :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n%4==0 ){
        System.out.println("Leap year");
    }
    else{
        System.out.println("not leap year");
    }
    sc.close();
}
}
