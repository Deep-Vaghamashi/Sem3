import java.util.*;
public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter index of number:");
        int b = sc.nextInt();
        for(int i=0;i<n;i++){
             if (i<(b-1)) {
                System.out.println(arr1[i]);
            }
            else if(i>b){
                System.out.println(arr1[i]);
            }
        }
        sc.close();
    }
}
