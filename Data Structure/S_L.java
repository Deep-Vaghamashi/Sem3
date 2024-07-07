import java.util.*;
public class S_L {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int array[] = new int[n];
        int min = array[0];
        int max = array[0];
        int min_pos = 0;
        int max_pos = 0;

        for(int i =0;i<n;i++){
            System.out.println("array ["+(i+1)+"] =");
            array[i] = sc.nextInt();
        }

        for(int i =1;i<n;i++){
            if (min<=array[i]) {
                min = array[i];
                min_pos = i;
            }
            if (max>array[i]) {
                max = array[i];
                max_pos = i;
            }
        }
        System.out.println("Index of minimum number:"+min_pos);
        System.out.println("Index of maximum number:"+max_pos);
        sc.close();
    }
}
