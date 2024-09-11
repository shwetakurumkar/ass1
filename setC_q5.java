import java.util.Scanner;
public class setC_q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inpuString = s.nextLine();

        StringBuilder result = new StringBuilder();
        for(int i=0;i<inpuString.length();i+=2){
            result.append(inpuString.charAt(i));
        }
        System.out.println("alternate character of the string are:"+result.toString());
    }
}
