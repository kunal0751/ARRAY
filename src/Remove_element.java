public class Remove_element {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8};
    int [] res=new int[arr.length-1];
    int k=5;
    int ptr=0;

    for(int i=0;i<arr.length;i++) {
        if (arr[i] != k) {
            res[ptr] = arr[i];
            ptr++;
        }
    }
//        System.out.println("");
        for(int num:res){
            System.out.println(num+" ");
      }
    }
}
