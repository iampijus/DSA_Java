package collections;

import java.util.*;

public class LearnStreamAPI {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,5,2,1,7);

       list.stream()
               .filter(ele->ele%2!=0)
               .sorted()
               .map(n->n*2)
               .forEach(ele-> System.out.println(ele));

    }
}
