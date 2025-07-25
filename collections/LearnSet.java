package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();

//        set.add(15);
//        set.add(60);
//        set.add(35);
//        set.add(7);
//
//        System.out.println(set);
//
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());
//        System.out.println(set.remove(60));
//        System.out.println(set);
//
//        set.clear();
//        System.out.println(set);


        Set<Student> stu=new HashSet<>();
        stu.add(new Student("Pijus",4));
        stu.add(new Student("Arun",2));
        stu.add(new Student("Shyam",3));
        stu.add(new Student("Kunal",1));

        stu.add(new Student("Kunal",2));

        System.out.println(stu);
    }
}
