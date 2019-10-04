package tp2;

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
        Node<KeyType, DataType> [] oldMap;
        oldMap = map;
        map = new Node[DEFAULT_CAPACITY * CAPACITY_INCREASE_FACTOR];
        for(int i = 0; i < oldMap.length; i++){
            if(oldMap[i] != null)
                map[i] = oldMap[i];
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
        Node<KeyType, DataType> []iterator = map;
        for(int i = 0; i < iterator.length; i++) {
            while (iterator[i].next != null)
                if (iterator[i].key == key)
                    return true;
                else
                    iterator[i] = iterator[i].next;
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
            return map[getIndex(key)].data;
        }
        return null;
    }

    /** TODO
     * Assigns a value to a key
     * @param key Key which will have its value assigned or reassigned
     * @return Old DataType instance at key (null if none existed)
     */
    public DataType put(KeyType key, DataType value) {
        int index = getIndex(key);
        Node<KeyType, DataType> iterator = map[index];
        if(containsKey(key)) {

            while (iterator != null) { //do while maybe

                if (iterator.key.equals(key)) {
                    DataType ancien = iterator.data;
                    iterator.data = value;
                    return ancien;
                }
                iterator = iterator.next;
            }
        }

        }

    return null;
    }

    /** TODO
     * Removes the node attached to a key
     * @param key Key which is contained in the node to remove
     * @return Old DataType instance at key (null if none existed)
     */
    public DataType remove(KeyType key) {

        return null;
    }

    /** TODO
     * Removes all nodes contained within the map
     */
    public void clear() {

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


