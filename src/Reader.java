import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static List<String> Read(String filename){
        try (
                BufferedReader br = new BufferedReader(new FileReader(filename))
        ) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
//            return lines.toArray(new String[lines.size()]);
            return lines;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
