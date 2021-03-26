package leet.sort;

import java.util.Arrays;

public class AllSort {
    

    public static void main(String[] args) {
        int[] numbers = {2,7,4,1,5,3};
        System.out.println(Arrays.toString(numbers) );
        check(numbers);
        System.out.println("After modify = " + Arrays.toString(numbers) );
        apiSort(numbers);
        
        System.out.println("Before selection sort = " + Arrays.toString(numbers));
        selectionSort(numbers);


        System.out.println("Before Bubble sort = " + Arrays.toString(numbers));
        bubbleSort(numbers);

        System.out.println("Before insertion sort = " + Arrays.toString(numbers));
        insertionSort(numbers);
        
        System.out.println("Before merge sort = " + Arrays.toString(numbers));
        int[] nos = Arrays.copyOf(numbers, numbers.length);
        mergeSort(nos);
        System.out.println("After merge sort = " + Arrays.toString(nos));

        System.out.println("before quick sort = "+ Arrays.toString(numbers));
        nos = Arrays.copyOf(numbers, numbers.length);
        quickSort(nos,0,nos.length-1);
        System.out.println("After quick sort = " + Arrays.toString(nos));
        
    }


    private static void quickSort(int[] nos, int start, int end) {
        if(start<end){
            int pIndex = partition(nos, start, end);
            quickSort(nos, start, pIndex-1);
            quickSort(nos, pIndex, end);
        }      
    }


    private static int partition(int[] nos, int start, int end) {

        int pivot = nos[end];
        int pIndex = 0;
        for (int i =0; i< end; i++ ){
            if(nos[i] < pivot){
                swap(nos, i, pIndex);
                pIndex++;      
            }
        }
        swap(nos, end, pIndex);
        return pIndex;
    }


    private static void mergeSort(int[] numbers) {
        int arrayLength = numbers.length;
        if(arrayLength < 2)
            return;
        
        int midLen = arrayLength/2;
        int[] left = Arrays.copyOfRange(numbers, 0 , midLen);
        int[] right = Arrays.copyOfRange(numbers, midLen , arrayLength);
        mergeSort(left);
        mergeSort(right);
        merge(left,right,numbers);
    }

    private static void merge(int[] left, int[] right , int[] nos){
        int i =0,j=0,k=0;
        while(i < left.length && j < right.length){
            nos[k++] = ( left[i] < right[j])? left[i++]: right[j++];
        }

        System.arraycopy(left, i, nos, k, left.length-i);
        System.arraycopy(right, j, nos, k, right.length-j);
    }


    private static void insertionSort(int[] numbers) {
        int[] nos = Arrays.copyOf(numbers, numbers.length);

        for (int i =0; i<numbers.length; i++){
            int current = nos[i];
            for(int j =i-1; j>=0; j--){
                if(nos[j] > current){
                    nos[j+1] = nos[j];
                    nos[j] = current;
                }
                else{
                    break;
                }    
            }
        }
        System.out.println("Insertion sort n = " + Arrays.toString(nos) );
    }


    private static void apiSort(int[] numbers) {
        int[] n = Arrays.copyOf(numbers,numbers.length);
        Arrays.sort(n);
        System.out.println("api sort n = " + Arrays.toString(n) );
    }

    private static void check(int[] numbers) {

        numbers[1]= 199;
    }


    private static int[] selectionSort(int[] numbers) {
        int[] nos = Arrays.copyOf(numbers, numbers.length);
        for( int i =0 ; i< nos.length; i++)
        {
            int smallIndex = i;
            for(int j = i+1; j< nos.length ;j++){
                if(nos[j]< nos[smallIndex]){
                    smallIndex = j;
                }                 
            }
            swap(nos, i,smallIndex);
        }
        System.out.println("After selection sort = " + Arrays.toString(nos));
        return nos;
    }

    private static void swap(int[] nos, int i, int smallIndex) {
        int s = nos[i];
        nos[i]= nos[smallIndex];
        nos[smallIndex] = s;
    }

    private static void bubbleSort(int[] numbers) {

        int[] nos = Arrays.copyOf(numbers, numbers.length);

        for(int i = 0; i< nos.length; i++){

            for(int j=0;j< nos.length - i - 1; j++){
                if(nos[j] > nos[j+1]){
                    swap(nos, j, j+1);
                }
            }
        }

        System.out.println("After bubble sort = " + Arrays.toString(nos));

    }
}
