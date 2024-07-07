import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.print("Number is even");
        }
        else{
            System.out.print("Number is odd");
        }
    }
}
