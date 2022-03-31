package sortingSort;
public class Sort {
    public static void bubbleSort(int[] array){
        //int n = array.length;
        int temp = 0;
        for(int i = 0; i < array.length; i++){
	        for(int j = 0; j < array.length-1; j++){
		        if(array[j] > array[j + 1]){
			        temp = array[j];
			        array[j] = array[j+1];
			        array[j+1] = temp;
			    }
            }
        }
    }
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int index = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[index]){
                    index = j;
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
    public static void insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i-1;
            while((j >= 0) && (array[j] > key)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
