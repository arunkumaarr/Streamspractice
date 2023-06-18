package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Printduplicate {
    List<Integer> list_num = Arrays.asList(15, 23, 67, 23, 4, 66,4, 88, 23, 67, 86);

    public static void main(String[] args) {
        Printduplicate s = new Printduplicate();

        System.out.println((s.list_num.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()))).entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList()));
    }
}
