package LRU;

public class CacheTest {
    public static void main(String[] args)
    {
        LRUCache lru = new LRUCache(2);
        lru.put(1,1);
        lru.put(2,2);
        System.out.println("get 1: "+ lru.get(1));
        lru.put(3,3);
        System.out.println("get 2: " + lru.get(2));
        lru.put(4,4);
        System.out.println("get 1: " + lru.get(1));
        System.out.println("get 3: " + lru.get(3));
        System.out.println("get 4: " + lru.get(4));

    }
}
