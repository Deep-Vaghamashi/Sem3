import java.util.*;
class stack{
    int top;
    int max;
    int s[];

    public  stack(int size){
        max = size;
        s = new int[max];    
        top = -1;
    }

    public void push(int x){
        if(top>=max-1){
            System.out.println("Stack overflow");
            return;
        }
        else{
            top++;
            s[top] = x;
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
        top--;
        return(s[top+1]);
        }
    }
    public int peep(int i){
        if(top-i+1==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            return s[top-i+1];
        }
    }
    public int change(int i,int x){
        if(top-i+1==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            s[top-i+1] = x;
            return s[top-i+1];
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("Stack element are:");
            for (int i = top;i>=0;i--) {
                System.out.println(s[i]);
            }
        }
    }
}
public class StackDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Stack:");
        int size = sc.nextInt();
        stack s =new stack(size);
        boolean flag =true;

        while (flag) { 
            System.out.println("1.push\n2.pop\n3.peep\n4.change\n5.display\n6.exit");
            int a =sc.nextInt();

            switch (a) {
                case 1:
                    System.out.print("Enter a value to push:");
                    int x =sc.nextInt();
                    s.push(x);
                    break;
                case 2:
                   int b = s.pop();
                   System.out.println(b);
                    break;
                case 3:
                    System.out.println("Enter position of element to peep:");
                    int i = sc.nextInt();
                   int c = s.peep(i);
                   System.out.println(c);
                    break;
                case 4:
                    System.out.println("Enter position of element to change:");
                    int j = sc.nextInt();
                    System.out.println("Enterr new element:");
                    int k = sc.nextInt();
                   int d = s.change(j, k);
                   System.out.println(d);
                    break;
                case 5:
                    s.display();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice!!");
            }
        }

        sc.close();
    }
}