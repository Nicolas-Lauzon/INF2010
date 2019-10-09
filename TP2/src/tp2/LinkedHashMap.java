package tp2;

import java.util.Arrays;
import java.util.Iterator;

public class LinkedHashMap<KeyType, DataType> {

    private static final double COMPRESSION_FACTOR = 2; // 50%
    private static final int DEFAULT_CAPACITY = 20;
    private static final int CAPACITY_INCREASE_FACTOR = 2;

    private Node<KeyType, DataType>[] map;
    private int capacity;
    private int size = 0;

    public LinkedHashMap() {
        capacity = DEFAULT_CAPACITY;
        map = new Node[DEFAULT_CAPACITY];
    }

    public LinkedHashMap(int capacity) {
        this.capacity = capacity;
        map = new Node[capacity];
    }

    /**
     * Finds the index attached to a particular key
     * @param key Value used to access to a particular instance of a DataType within map
     * @return The index value attached to a particular key
     */
    private int getIndex(KeyType key){
        int keyHash = key.hashCode() % capacity;
        return keyHash < 0 ? -keyHash : keyHash;
    }

    private boolean shouldRehash() {
        return size * COMPRESSION_FACTOR > capacity;
    }

    /** TODO
     * Increases capacity by CAPACITY_INCREASE_FACTOR (multiplication) and
     * reassigns all contained values within the new map
     */
    private void rehash() {
        Node<KeyType, DataType> [] oldMap = map;
        Node<KeyType,DataType> iterator=null;
        capacity*=CAPACITY_INCREASE_FACTOR;
        map = new Node[capacity];
        int i=0;
        boolean assignation_initiale = false;
        while(i < oldMap.length){
            //System.out.println(oldMap.length);
            if (assignation_initiale == false){
                iterator = oldMap[i];
                assignation_initiale = true;
            }
            if (iterator != null){
               put(iterator.key, iterator.data);
               iterator = iterator.next;
           }
           else if (iterator==null){
               i++;
               assignation_initiale = false;
           }
        }
    }

    public int size() {
        return size;
    }

    public int getCapacity(){
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /** TODO
     * Finds if map contains a key
     * @param key Key which we want to know if exists within map
     * @return if key is already used in map
     */
    public boolean containsKey(KeyType key) {
        Node<KeyType, DataType> iterator = map[getIndex(key)];
        while(iterator != null) {
            if (iterator.key.equals(key))
                    return true;
                else
                    iterator = iterator.next;
        }
        return false;
    }

    /** TODO
     * Finds the value attached to a key
     * @param key Key which we want to have its value
     * @return DataType instance attached to key (null if not found)
     */
    public DataType get(KeyType key) {
        if (containsKey(key)){
            for (Node<KeyType,DataType> i = map[getIndex(key)] ; i!=null ; i=i.next){
                if (i.key == key){
                    return i.data;
                }
            }
        }
        return null;
    }

    /** TODO
     * Assigns a value to a key
     * @param key Key which will have its value assigned or reassigned
     * @return Old DataType instance at key (null if none existed)
     */
    public DataType put(KeyType key, DataType value) {
        Node<KeyType, DataType> iterator = map[getIndex(key)];
        if(containsKey(key)) {
            while (iterator != null){ //do while maybe
                if (iterator.key.equals(key)) {
                    DataType ancien = iterator.data;
                    iterator.data = value;
                    //map[getIndex(key)] = iterator;

                    size++;
                    return ancien;
                }
                iterator = iterator.next;
            }
        }
        else{
            Node <KeyType,DataType> derniere_node = null;
            if(map[getIndex(key)] == null){
                size++;
                map[getIndex(key)]=new Node<>(key,value);
                if (shouldRehash()){
                    rehash();
                }
            }
            else{
                for(Node<KeyType,DataType> i=map[getIndex(key)] ; i != null ; i=i.next){
                    derniere_node=i;
                }
                derniere_node.next=new Node<>(key,value);
            }
            /*size++;
            map[getIndex(key)]= new Node<>(key,value);*/

        }
         return null;
    }




    /** TODO
     * Removes the node attached to a key
     * @param key Key which is contained in the node to remove
     * @return Old DataType instance at key (null if none existed)
     */
    public DataType remove(KeyType key) {
        Node<KeyType,DataType> iterator = map [getIndex(key)];
        size =0;
        if (containsKey(key)){
            DataType ancien = iterator.data;
            map[getIndex(key)] = null;

            return ancien;
            /*while (iterator != null){
                if (iterator.key == key){
                    map[getIndex(key)].next = null;
                }
                else{
                    iterator = iterator.next;
                }
            }*/
        }

        return null;
    }

    /** TODO
     * Removes all nodes contained within the map
     */
    public void clear() {
        /*DataType temp;
        for (int i=0 ; i < map.length;i++){
            temp =remove(map[i].key);
        }*/

        map = new Node[map.length];
    }


    static class Node<KeyType, DataType> {
        final KeyType key;
        DataType data;
        Node next; // Pointer to the next node within a Linked List

        Node(KeyType key, DataType data)
        {
            this.key = key;
            this.data = data;
            next = null;
        }
    }
}


