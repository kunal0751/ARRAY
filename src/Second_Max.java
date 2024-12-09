public class Second_Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i =0;i <arr.length;i++) {
            if (max<arr[i]) {
                smax = max;
                max = arr[i];
            } else if (smax < arr[i]) {
                smax=arr[i];
            }
        }
        System.out.println(max + " " + smax);
    }

}
