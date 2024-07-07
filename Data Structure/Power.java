import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        System.out.print("Enter power of number:");
        int p = sc.nextInt();
        int ans = a;
        for(int i = 2;i<=p;i++){
            ans = ans*a;
        }
        System.out.print(ans);
        sc.close();
    }
}
