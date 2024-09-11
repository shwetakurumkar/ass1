import java.util.ArrayList;
import java.util.Scanner;

public class setB_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number element:");
        int n = sc.nextInt();

        ArrayList<Integer> armnumber = new ArrayList<>();
        System.out.println("Enter "+n+" number:");

        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(isArmstrong(num)){
                armnumber.add(num);
            }
        }
        System.out.println("Armstrong number are:"+armnumber);
    }
    public static boolean isArmstrong (int num){
        int orignalNum = num;
        int result=0;
        int numberOfDigit= String.valueOf(num).length();
        while(num != 0){
            int digit = num % 10;
            result += Math.pow(digit, numberOfDigit);
            num /= 10;
        }
        return result == orignalNum;
    }
}
