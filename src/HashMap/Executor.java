package HashMap;

public class Executor {
    public static void main(String []args){
        CustomHashMap<Integer,String> myMap = new CustomHashMap<>();
        myMap.put(1,"Hello");
        myMap.put(2,"World");
        System.out.println(myMap);
        myMap.put(2,"Universe");
        System.out.println(myMap);
        System.out.println(myMap.get(1));
        System.out.println(myMap.get(0));
    }
}
