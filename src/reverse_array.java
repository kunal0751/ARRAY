public class reverse_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};

//       int start=0;
//       int end=arr.length-1;
//
//       while(start<end){
//           int temp=arr[start];
//           arr[start]=arr[end];
//           arr[end]=temp;
//           start++;
//           end--;
//       }
//       for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
        // second mathod
        //   extra memory allocation
        int ans[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[arr.length-1-i];
            System.out.print(ans[i]);
        }


    }
}
