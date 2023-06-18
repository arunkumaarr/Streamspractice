package streams;

import java.util.Arrays;
import java.util.List;

public class squaredavggt100 {
    List<Integer> list_num = Arrays.asList(15,23,67,23,4,66,88,23,67,86);

    public static void main(String[] args) {
        squaredavggt100 s = new squaredavggt100();

        System.out.println((s.list_num.stream().map(e -> e*e).filter(e -> e>6000).mapToInt(Integer::intValue).average()));
    }
}
