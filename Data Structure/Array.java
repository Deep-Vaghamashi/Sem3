import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("Enter array["+(i+1)+"] =");
            array[i] = sc.nextInt();
        }
        
        for(int i =0;i<n;i++){
            System.out.println("Enter array["+(i+1)+"] ="+array[i]);
        }
        sc.close();
    }
}
