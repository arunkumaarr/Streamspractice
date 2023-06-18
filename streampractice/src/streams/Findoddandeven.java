package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Findoddandeven {
    List<Integer> list_num = Arrays.asList(15,23,67,23,4,66,88,23,67,86);

    public static void main(String[] args) {
        Findoddandeven fodd = new Findoddandeven();

        List<Integer> foddno=  fodd.list_num.stream().filter(e -> (e%2==0)).collect(Collectors.toList());
        List<Integer> foddevn=  fodd.list_num.stream().filter(e -> (e%2!=0)).collect(Collectors.toList());

        System.out.println(foddno);
        System.out.println(foddevn);
    }
}
