import java.util.Scanner;

 class Swapnumber{
    public static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}
public class Swap{
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int num1 = op.nextInt();
        System.out.print("Enter another number: ");
        int num2 = op.nextInt();

        Swapnumber.swap(num1,num2);

        op.close();

    }
}
