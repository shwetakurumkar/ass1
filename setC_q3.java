import java.util.HashSet;;
public class setC_q3 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4};
        int[] arr2 = {8,9,10};
        int[] unionArray = findUnion(arr1,arr2);

        System.out.println("union of the arrays: ");
        for(int num: unionArray){
            System.out.println(num +" ");
        }
    }
    public static int[] findUnion(int[] arr1,int[] arr2) {
        HashSet<Integer> unionSet = new HashSet<>();
        for(int num : arr1){
            unionSet.add(num);
        }
        for(int num : arr2){
            unionSet.add(num);
        }
        int[] unionArray = new int[unionSet.size()];
        int index = 0;
        for(int num: unionSet){
            unionArray[index++]=num;
        }
        return unionArray;
    }
}
