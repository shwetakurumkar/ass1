public class setA_q5 {
    public static void main(String[] args) {
        String str= "education";
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
            ||str.charAt(i)=='o'||str.charAt(i)=='u'){
                c++;
            }
        }
        System.out.println("Total number of vowels "+c);
    }
}
