package pers.xin.six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 选择排序
 */
public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(1, "小红");
        Person p2 = new Person(20, "小黑");
        Person p3 = new Person(18, "小白");
        Person p4 = new Person(15, "小绿");
        Person p5 = new Person(31, "小明");
        Person p6 = new Person(5, "小刚");
        List<Person> personList = new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        Person[] personArray = new Person[personList.size()];
        personArray = personList.toArray(personArray);
        selectSort(personArray);
        System.out.println(Arrays.asList(personArray));
    }

    public static <T extends Comparable<T>> void selectSort(T[] list) {
        int i = 0, j = 0, count = 0, k = 0;
        T min = null, temp = null;
        for (i = 0; i < list.length - 1; i++) {
            min = list[i];
            count = i;
            int minIndex = i;
            for (j = i + 1; j < list.length; j++) {
                min = (min.compareTo(list[j]) > 0) ? list[j] : min;
                minIndex = j;
            }
            if (count != minIndex) {
                change(list, count, minIndex);
            }
            for (k = 0; k < list.length; k++) {
                System.out.print(list[k] + " ");
            }
            System.out.println();
        }
    }

    private static void change(Object[] list, int count, int minIndex) {
        Object obj = list[count];
        list[count] = list[minIndex];
        list[minIndex] = obj;
    }
}
