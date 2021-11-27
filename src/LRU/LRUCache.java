package LRU;
import java.util.*;

class LRUCache {
    class DlinkedNode{
        int key;
        int value;
        DlinkedNode next;
        DlinkedNode prev;
    }

    private Map<Integer, DlinkedNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DlinkedNode head,tail;

    public void addNode(DlinkedNode node){
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
        cache.put(node.key, node);
    }

    public void removeNode(DlinkedNode node){
        DlinkedNode prev = node.prev;
        DlinkedNode next = node.next;
        prev.next = next;
        next.prev = prev;
        cache.remove(node.key, node);
    }



    public LRUCache(int capacity) {
        head = new DlinkedNode();
        tail = new DlinkedNode();

        this.size = 0;
        this.capacity = capacity;

        head.next = tail;
        tail.prev = head;
    }

    public void printCurrentCache(){
        System.out.println("--------------");
        System.out.println("Printing current cache");
        for (Integer key: cache.keySet()) {
            String keyString = key.toString();
            Integer value = cache.get(key).value;
            System.out.println(keyString + " " + value);
        }
        System.out.println("--------------");
    }

    public int get(int key) {
        DlinkedNode node = cache.get(key);
        if(node == null){
            return -1;
        }

        removeNode(node);
        addNode(node);
        printCurrentCache();
        return node.value;
    }

    public void put(int key, int value) {
        if(size == capacity){
            removeNode(head.next);
            size--;
            //cache.remove(head.next.key);
        }
        DlinkedNode node = new DlinkedNode();
        node.key = key;
        node.value = value;
        cache.put(key, node);
        addNode(node);
        size ++;
        printCurrentCache();
    }
}

