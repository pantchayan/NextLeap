public class Dec5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = new int[arr.length];
        reverseArray(arr, 0, ans);

        for(int a:ans){
            System.out.print(a+", ");
        }
    }

    public static void reverseArray(int[] arr, int idx, int[] ans){
        if(idx == arr.length){
            return;
        }

        reverseArray(arr, idx+1, ans);
        ans[arr.length - idx - 1] = arr[idx];
    }
}
