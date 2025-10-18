package lesson13.prob5;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondSmallest{


    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list){
        return list.stream()
                 .distinct()
                 .sorted()
                 .skip(1)
                 .findFirst()
                 .orElse(null);


        }
        public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
         int result = secondSmallest(list);
            System.out.println(result);

        }

    }



