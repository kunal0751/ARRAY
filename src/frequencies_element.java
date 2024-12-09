public class frequencies_element {
    public static void main(String[] args) {
        int []arr={1,2,34,5,6,2,89,2};
        int count=0;
        int k=2;


        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
            }

        }
        System.out.println(count+" ");

    }
}
