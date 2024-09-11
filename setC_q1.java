import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;;
public class setC_q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String inputString = sc.nextLine();

        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] charArray = inputString.toCharArray();

        for(char c : charArray){
            if(frequencyMap.containsKey(c)){
                frequencyMap.put(c,frequencyMap.get(c)+1);
            }
            else{
                frequencyMap.put(c,1);
            }
        }
        System.out.println("Character frequency");
        for(Map.Entry<Character,Integer>entry:frequencyMap.entrySet()){
            System.out.println(entry.getKey()+":"+ entry.getValue());
        }
    }
}
