public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) { this.key = key; }
    public void setValue(V value) { this.value = value; }
    public K getKey()   { return key; }
    public V getValue() { return value; }

    public static void main(String[] args){
        Pair<String, Integer> pair1 = new Pair<>("Hello", 5);
        Pair<String, Integer> pair2 = new Pair<>("Howdy", 10);
        // Store the key from pair into a new variable and print it out.
        String key = pair1.getKey();        
        System.out.println(key);

        System.out.println("compare result: "+ 
            // Util.<String,Integer>compare(pair1, pair2)); // Works, but not necessary.
            Util.compare(pair1, pair2));
    }
}