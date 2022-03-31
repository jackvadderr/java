package arrays;
public class convert_Array {

    public static int[] toArrayInt(String[] arrayString) {
    	/*
    	 * Esse método converte um array de string para array de inteiros
    	 */
        int[] arrayInt = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }

        return arrayInt;
    }
    public static String[] str_toArrayString(String text, String spacer) {
    	/*
    	 * Este método converte um array de inteiros para um array de strings
    	 */
        text = text.replace("\n", spacer);
        return text.split(spacer);
    }
}
