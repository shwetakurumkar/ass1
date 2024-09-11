public class setC_q2 {
    public static void main(String[] args){
        String[] words = {"java","dsa","sql","cpp","php"};

        for(String word : words){
            String reversedWord = reverseString(word);
            System.out.println(reversedWord);
        }
    }
        public static string reverseString(String input){
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        }
}