import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Printer {
    private static final String OUTPUT_FILE = "output.txt";

    public static void Print(List<String> content) {
        try(PrintWriter fos = new PrintWriter(OUTPUT_FILE)){
            for (String content_line : content) {
                fos.println(content_line);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
