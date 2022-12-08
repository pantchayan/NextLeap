public class Sorting {

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(j+1 < arr.length && arr[j] > arr[j+1]){
                    swap(j, j+1, arr);
                }
            }
        }
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr){
        System.out.print("[ ");
        for(int a:arr){
            System.out.print( a+ ", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr = {2,5,4,3,1};

        bubbleSort(arr);
        printArray(arr);
    }

}
