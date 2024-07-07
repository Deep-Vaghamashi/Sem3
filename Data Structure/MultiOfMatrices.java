import java.util.Scanner;

public class MultiOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[3][2];
        int arr2[][] = new int[2][3];
        int multi[][] = new int[3][3];
        System.out.println("Array 1:");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<2;j++){
                System.out.print("Enter a number");
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array 2:");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<3;j++){
                System.out.print("Enter a number");
                arr2[i][j] = sc.nextInt();
            }
        }

        System.err.println("multiplication of array");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                multi[i][j] = (arr1[i][0]*arr2[0][j])+(arr1[i][1]*arr2[1][j]);
            }
        }
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.err.print(multi[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
