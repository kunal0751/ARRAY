public class maximum_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,80,8,9};
        int max= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
