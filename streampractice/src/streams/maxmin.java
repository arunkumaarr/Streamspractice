package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maxmin {

    List<Integer> list_num = Arrays.asList(15, 23, 67, 23, 4,-1, 66,4, 88, 23, 67, 86);

    public static void main(String[] args) {
        maxmin m = new maxmin();

        System.out.println(m.list_num.stream().max(Comparator.comparing(Integer::valueOf)).get());
        System.out.println(m.list_num.stream().min(Comparator.comparing(Integer::valueOf)).get());
    }

}

