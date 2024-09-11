import java.util.Scanner;
public class setA_q3 {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("enter the emp name:");
        String str = sn.next();

       String reversedName = new StringBuilder(str).reverse().toString();
       System.out.println("reversed emp name:"+reversedName);
    }
}
