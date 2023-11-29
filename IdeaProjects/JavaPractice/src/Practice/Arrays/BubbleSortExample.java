package Practice.Hyperskill.Methods.JavaPractice.src.Practice.Arrays;

public class BubbleSortExample {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int arr[] ={3,600,5,2,45,1,5};

        System.out.println("before");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("after");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}