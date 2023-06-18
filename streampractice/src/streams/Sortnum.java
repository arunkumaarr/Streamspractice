package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sortnum {
    List<Integer> list_num = Arrays.asList(15, 23, 67, 23, 4,-1, 66,4, 88, 23, 67, 86);

    public static void main(String[] args) {
        Sortnum s = new Sortnum();

        System.out.println(s.list_num.stream().sorted().collect(Collectors.toList()));

        System.out.println(s.list_num.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
    }
}
