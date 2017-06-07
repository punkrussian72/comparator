import java.util.ArrayList;
import java.util.List;

public class Comparator {

    public static List<String> Compare(List<String> what, List<String> with) {
        List<String> contain_lines = new ArrayList<>();
        contain_lines.add("File 'what' contains following strings from 'with' file:");
        List<String> not_contain_lines = new ArrayList<>();
        not_contain_lines.add("File 'what' doesn't contain following strings from 'with' file:");
        for (String with_line : with) {
            if (with_line != null && !with_line.trim().isEmpty()) {
                if (what.contains(with_line)) contain_lines.add(with_line);
                else not_contain_lines.add(with_line);
            }
        }
        contain_lines.addAll(not_contain_lines);
        return contain_lines;
    }

}
