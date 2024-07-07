import java.util.*;
public class Fact_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int ans = Fact(a);
        System.out.println(ans);
    }
    public static int Fact (int a){
        if (a==1) {
            return 1;
        }
        return a*Fact(a-1);
    }
}
