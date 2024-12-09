import java.util.Arrays;

public class remove_duplicates_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,2,89,2};
        int k=2;
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
            }
        }
        int res[]= new int[arr.length-count];
        int ptr=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=k){
                res[ptr]=arr[i];
                ptr++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
