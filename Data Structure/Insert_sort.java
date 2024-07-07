import java.util.*;
public class Insert_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n+1];

        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter new number:");
        int b = sc.nextInt();
        Arrays.sort(arr1);

        for(int i=0;i<(n+1);i++){
            if (i<b) {
                arr2[i]=arr1[i];
            }
            else if (i>b) {
                arr2[i]=arr1[i-1];
            }
           else{
            arr2[i]=b;
           }
        }
        System.out.println("Array 2:");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2);
        }
    }
}
