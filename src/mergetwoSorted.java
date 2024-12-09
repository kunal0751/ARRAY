import java.util.Arrays;

public class mergetwoSorted {
    public static void main(String[] args) {
        int []arr1={1,3,5,7,9};
        int []arr2={2,4,6,8};
        int []res=merge(arr1,arr2);
        System.out.println(Arrays.toString(res));


    }
    static int[] merge(int arr1[],int arr2[]){
        int res[]= new int [arr1.length+ arr2.length];
        int ptr1=0;
        int ptr2=0;
        int ptr3=0;
        while(ptr1<arr1.length && ptr2< arr2.length){

            if(arr1[ptr1]<arr2[ptr2]){
                res[ptr3]=arr1[ptr1];
                ptr1++;
                ptr3++;

            }else{
                res[ptr3]=arr2[ptr2];
                ptr2++;
                ptr3++;
            }
        }
        if(ptr1== arr1.length){
            for(int i=ptr2;i< arr2.length;i++){
                res[ptr3]=arr2[ptr2];

                        ptr3++;
            }
        }else{
            for(int i=ptr1;i< arr1.length;i++){
                res[ptr3]=arr1[ptr1];
                ptr3++;
            }
        }
        return res;
    }
}
