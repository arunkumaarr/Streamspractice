package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sumfirst5 {
    List<Integer> list_num = Arrays.asList(15, 23, 67, 23, 104,-1, 66,4, 88, 23, 67, 86);

    public static void main(String[] args) {
        sumfirst5 s = new sumfirst5();

        System.out.println(s.list_num.stream().skip(5).collect(Collectors.summingInt(i->i)));
    }
}
