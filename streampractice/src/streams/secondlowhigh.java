package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class secondlowhigh {
    List<Integer> list_num = Arrays.asList(15, 23, 67, 23, 104,-1, 66,4, 88, 23, 67, 86);

    public static void main(String[] args) {
        secondlowhigh s = new secondlowhigh();
        System.out.println("Second Lowest:" + s.list_num.stream().sorted().skip(1).limit(1).collect(Collectors.toList()));

        System.out.println("Second Highest:" + s.list_num.stream().sorted(Collections.reverseOrder()).skip(1).limit(1).collect(Collectors.toList()));
    }
}
