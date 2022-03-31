package arquivoEntradaSaida;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class inputOutputFiles {
    
    public static String showFile(String file) throws IOException {
    	/*
    	 * Esse método mostra o arquivo
    	 */
        String words = "";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        while (line != null) {
            words = words + line + "\n";
            line = reader.readLine();
        }
        reader.close();
        return words;
    }
    public static void writeFile(String file, String words) throws IOException {
    	/*
    	 * Esse método escreve arquivo
    	 */
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.append(words);
        writer.close();
    }
}
