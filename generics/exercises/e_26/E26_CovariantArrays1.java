package generics.exercises.e_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E26_CovariantArrays1 {
    public static void main(String[] args) {


        Integer[] integers = {1, 2, 3, 4, 5};
        Number[] numbers = integers; // 协变性

        // 修改数组中的元素
        numbers[0] = 3.14;

        // 遍历并打印数组中的元素
        for (Number number : numbers) {
            System.out.println(number);
        }

//        List<Number> lists = new ArrayList<>();
//        lists.add(new Integer("9"));
//        lists = new ArrayList<>(Arrays.asList(integers));
    }
}
