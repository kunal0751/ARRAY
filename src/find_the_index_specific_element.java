public class find_the_index_specific_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=6;
        int idx=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                arr[idx]=i;
                break;
            }
        }
        System.out.println(arr[idx]);
    }
}
