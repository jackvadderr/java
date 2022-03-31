package arrays;
import java.util.Random;

class inputOutputArray{
    public static void showArray(int[] arrayInt){
        for(int i = 0;  i < arrayInt.length; i++){
            System.out.println("[" + i + "] " + arrayInt[i]);
        }
    }

    public static int[] makeArray(int size, int max) {
        int[] arrayInt = new int[size];
        Random r = new Random();
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = r.nextInt(max);
        }
        return arrayInt;
    }
}
