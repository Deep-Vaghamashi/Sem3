import java.util.*;

public class D_delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        System.out.println("new array:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                    while (arr1[i] == arr1[j]) {
                        j++;
                    }
                    arr1[i + 1] = arr1[j];
                }
            }
        }
        for (int i = 0; i < n - count; i++) {
            System.out.println(arr1[i]);
        }
        sc.close();
    }
}
