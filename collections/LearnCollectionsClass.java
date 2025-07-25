package collections;

import java.util.ArrayList;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//
//        list.add(52);
//        list.add(5);
//        list.add(70);
//        list.add(1);
//
//        System.out.println(Collections.min(list));
//        System.out.println(Collections.max(list));
//
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);


        List<Student> list=new ArrayList<>();

        list.add(new Student("Pijus",4));
        list.add(new Student("Arun",2));
        list.add(new Student("Shyam",3));
        list.add(new Student("Kunal",1));


        System.out.println(list);

//        Collections.sort(list, new Comparator<collections.Student>() {
//            @Override
//            public int compare(collections.Student o1, collections.Student o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
//
//        System.out.println(list);
    }
}
