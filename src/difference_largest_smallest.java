public class difference_largest_smallest {
    public static void main(String[] args) {
        int arr[]= {0,2,3,4,5,6,7,8};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }else if(arr[i]>max){
                max=arr[i];
            }
        }
        int diff= max-min;
        System.out.println(diff);
    }
}
