package HashMap;

public class CustomHashMap<K,V> {

    static class Entry<K,V>{
        K key;
        V value;
        Entry<K,V> next;

        public Entry(K key, V value){
            this.key=key;
            this.value=value;
            next=null;
        }

    }

    private final int SIZE;
    private Entry<K,V>[] bucket;
    public CustomHashMap() {
        SIZE = 8;
        bucket= new Entry[SIZE];
    }

    public void put(K key, V value){
        int hashCode = key.hashCode()%SIZE;
        Entry<K,V> e = bucket[hashCode];

        if(e==null){
            Entry<K,V> newEntry = new Entry<>(key,value);
            bucket[hashCode]=newEntry;
            return;
        }

        while(e.next!=null){
            if(e.key==key){
                e.value=value;
                return;
            }
        }

        if(e.key==key){
            e.value=value;
            return;
        }

        Entry<K,V> newEntry = new Entry<>(key,value);
        e.next=newEntry;
    }

    public V get(K key){
        int hashCode = key.hashCode()%SIZE;
        Entry<K,V> e = bucket[hashCode];

        if(e==null)
            return null;
        while(e!=null){
            if(e.key==key)
                return e.value;
            e=e.next;
        }
        return null;
    }


    //printing
    public String toString(){
        StringBuilder result= new StringBuilder();
        for(int i=0;i<SIZE;i++){
            Entry<K,V> e = bucket[i];
            while(e != null){
                result.append("[").append(e.key).append(",").append(e.value).append("]");
                e=e.next;
            }
        }
        return result.toString();
    }

}
