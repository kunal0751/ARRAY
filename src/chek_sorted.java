public class chek_sorted {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,2};

        boolean flag= true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                flag=false;
                break;
            }

        }
        System.out.println(flag);
    }
}
