import java.util.List;

public class Main {

    private static final String COMPARE_WHAT = "what.txt";
    private static final String COMPARE_WITH = "with.txt";

    public static void main(String[] args) {
        List<String> file_what = Reader.Read(COMPARE_WHAT);
        List<String> file_with = Reader.Read(COMPARE_WITH);
        if (file_what != null && file_with != null) {
            List<String> result = Comparator.Compare(file_what, file_with);
            Printer.Print(result);
        }
    }
}
