import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        int r = sc.nextInt();
        double area = Math.PI*r*r;
        System.out.print("Area of circle is "+area);
    }
}