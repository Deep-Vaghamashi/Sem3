import java.util.*;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last number:");
        int a = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=a;i++){
            sum += i;
        }
        int avg = sum/a;
        System.out.println(avg);
        sc.close();
    }
}
