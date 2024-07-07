import java.util.*;
public class Vowel {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter:");
        String a = sc.next();
        if("a".equals(a)||"e".equals(a)||"i".equals(a)||"o".equals(a)||"u".equals(a)|| 
                "A".equals(a)||"E".equals(a)||"I".equals(a)||"O".equals(a)||"U".equals(a) ){
            System.out.print("The letter is vowel.");
        }
        else{
            System.out.print("the letter is consonant.");
        }
    }
}
