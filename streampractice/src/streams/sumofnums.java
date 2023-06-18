package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class sumofnums {

    List<Integer> list_num = Arrays.asList(15,23,67,23,4,66,88,23,67,86);

    public static void main(String[] args) {
        sumofnums s = new sumofnums();
        int total;
        System.out.println(s.list_num.stream().mapToInt(Integer::intValue).sum());
//                .reduce((a,b) -> a+b);
//        System.out.println(total_1.get());
    }
}
