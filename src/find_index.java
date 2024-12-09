public class find_index {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,8,9,5};

        int first=-1;
        int last=-1;
        int k=5;
        int ans=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                first=i;
                last=i;
            }else if(arr[i]==k){
                last=i;
            }


        }
        System.out.println(first+" "+last);
    }
}
