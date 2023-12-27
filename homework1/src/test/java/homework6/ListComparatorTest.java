package homework6;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;



class ListComparatorTest {
    private ListComparator comparator;
    private List<Integer> list1;
    private List<Integer> list2;
    private List<Integer> list3;
    private List<Integer> list4;
    private List<Integer> list5;
    private List<Integer> list6;
    @BeforeAll
    static void setup() {
        System.out.println("All tests started...");
    }
    @BeforeEach
    void init() {
        comparator = new ListComparator();
        list1 = Arrays.asList(1,2,3,4,5);
        list2 = Arrays.asList(1,2,3,4,5);
        list3 = Arrays.asList(1,1,1,1,1);
        list4 = Arrays.asList(9,9,9,9,9);
        list5 = new ArrayList<>();
        list6 = new ArrayList<>();
    }
    @AfterEach
    void cleanup() {
        comparator = null;
        list1 = null;
        list2 = null;
        list3 = null;
        list4 = null;
    }

    @AfterAll
    static void teardown() {
        System.out.println("All tests finished");
    }

    @Test
    void testCalculateAverage() {
        int resultAverage = comparator.calculateAverage(list1);
        assertEquals(3, resultAverage);
    }
    @Test
    void testCompareEqualLists() {
        String resultString = comparator.compareLists(list1, list2);
        assertEquals("Средние значения равны",
                resultString);
    }

    @Test
    void testCompareEmptyLists() {
        String resultString = comparator.compareLists(list5, list6);
        assertEquals("Средние значения равны",
                resultString);
    }

    @Test
    void testCompareListsFirstAverageMoreThanSecondAverage() {
        String resultString = comparator.compareLists(list1, list3);
        assertEquals("Первый список имеет большее среднее значение",
                resultString);
    }
    @Test
    void testCompareListsFirstAverageLessThanSecondAverage() {
        String resultString = comparator.compareLists(list1, list4);
        assertEquals("Второй список имеет большее среднее значение",
                resultString);
    }

}