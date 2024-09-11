public class setB_q1 {
    public static void main(String[] args) {
        String str="shrigonda";
        char [] ch = str.toCharArray();

        for(int i=0;i<ch.length-1;i++){
            for(int j=0;j<ch.length-1-i;j++){
                if(ch[j]>ch[j+1]){
                    char temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                }
            }
        }
        String sortedString = new String(ch);
        System.out.println("sorted string:"+sortedString);
    }
}
