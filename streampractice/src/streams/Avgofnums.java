package streams;

import java.util.Arrays;
import java.util.List;

public class Avgofnums {
    List<Integer> list_num = Arrays.asList(15,23,67,23,4,66,88,23,67,86);

    public static void main(String[] args) {
        Avgofnums avg = new Avgofnums();

        System.out.println((avg.list_num.stream().mapToInt(Integer::intValue).average().getAsDouble()));
    }
}
