import  java.util.*;
public class SumOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[2][2];
        int arr2[][] = new int[2][2];
        int sum[][] = new int[2][2];
        System.out.println("Array 1:");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print("Enter a number");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array 2:");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print("Enter a number");
                arr2[i][j] = sc.nextInt();
            }
        }
        System.err.println("sum of array:");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                sum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(sum[i][j]);
            }
            System.out.println(" ");
        }
    }
}
