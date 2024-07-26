package linkedList;


import java.util.List;

public class LinkedListDemo {
    public static void main(String []args) {


        List<String> myList = List.of("Apple","Orange", "Banana1");

        String maxString = myList.stream().max((s1,s2)-> s1.length()-s2.length()).get();
        System.out.println(maxString);

    }
}
