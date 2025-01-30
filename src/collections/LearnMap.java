package collections;

import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
//        Map<String,Integer> numbers=new HashMap<>();
        Map<String,Integer> numbers=new TreeMap<>();

        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);
        numbers.put("five",5);


//        System.out.println(numbers);
//
//        if(!numbers.containsKey("three")){
//            numbers.put("three",5);
//        }
//
//        numbers.putIfAbsent("six",8);

        System.out.println(numbers);

//        for(Map.Entry<String,Integer> e:numbers.entrySet()){
//            System.out.println(e);
//        }
//
//        for(Map.Entry<String,Integer> e:numbers.entrySet()){
//            System.out.println(e.getKey());
//        }
//
//        for(Map.Entry<String,Integer> e:numbers.entrySet()){
//            System.out.println(e.getValue());
//        }

//        for(String key:numbers.keySet()){
//            System.out.println(key);
//        }

//        for(Integer v:numbers.values()){
//            System.out.println(v);
//        }

//        System.out.println(numbers.containsKey("four"));
//        System.out.println(numbers.containsValue(10));

//        System.out.println(numbers.isEmpty());
//        numbers.remove("four");
//        System.out.println(numbers);
    }


}
