import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2st number:");
        int b = sc.nextInt();
        int sum = 0;
        for(int i = a;a<=b;a++){
            sum =sum+a;
        }
        System.out.println(sum);
        sc.close();
    }
}
