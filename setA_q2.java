import java.util.Scanner;

public class setA_q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        int sum=0;
        System.out.println("perfect number between 1 and "+n+" are:");
        for(int i=1;i<n;i++){
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum += j;
                }
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}