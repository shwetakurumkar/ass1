import java.util.Scanner;
public class setB_q3 {
    public static void main(String[] args) {
        String[] name = {"bob","charl","tomi","alice","tiger"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name to search:");
        String nameToSearch = sc.nextLine();
        boolean isFound = false;

        for(int i=0;i<name.length;i++){
            if(name[i].equalsIgnoreCase(nameToSearch)){
                System.out.println("name found at index:"+i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("name not found in the array.");
        }
    }
}
