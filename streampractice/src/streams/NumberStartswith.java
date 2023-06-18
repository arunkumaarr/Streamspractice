package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartswith {

    List<Integer> list_num = Arrays.asList(15,23,67,23,4,66,88,-2,23,67,86);

    public static void main(String[] args) {
        NumberStartswith num = new NumberStartswith();

        List<Integer> l1 = num.list_num.stream().map(e->String.valueOf(e)).filter(e -> (e.startsWith("2")||e.startsWith("-2"))).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(l1);
    }
}
