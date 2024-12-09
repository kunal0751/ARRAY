public class Second_Min {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8};
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                smin=min;
                min=arr[i];;
            }else if(smin>arr[i]){
                smin=arr[i];
            }
        }
        System.out.println(min+" "+smin);
    }
}
