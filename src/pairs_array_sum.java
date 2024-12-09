public class pairs_array_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 10;
         int ans[]= new int[2];

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }

        }
        System.out.println(ans);;
    }
}
