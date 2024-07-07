import java.util.*;
public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int ans = 1;
        for(int i = 1;i<=a;i++){
            ans = ans*i;
        }
        System.out.println("Factorial ="+ans);
    }
}
