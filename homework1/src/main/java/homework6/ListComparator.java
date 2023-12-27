package homework6;

import java.util.List;

public class ListComparator {
    public int calculateAverage(List<Integer> list) {
        if (!list.isEmpty()) {
            int sum = 0;
            for (Integer integer : list) {
                sum += integer;
            }
            return sum / list.size();
        } else {
            return 0;
        }
    }

    public String compareLists(List<Integer> list1, List<Integer> list2) {
        int average1 = this.calculateAverage(list1);
        int average2 = this.calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
