import java.util.*;
public class Delete_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i = 0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter delete number:");
        int b = sc.nextInt();
        Arrays.sort(arr1);
        for(int i=0;i<n;i++){
            if (arr1[i]<(b-1)) {
               System.out.println(arr1[i]);
           }
           else if(arr1[i]>b){
               System.out.println(arr1[i]);
           }
       }
    }
}
