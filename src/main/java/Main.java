import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Huffman huffman = new Huffman("aaaaabbbbcccdde");

        String encodedText = huffman.encode();
        System.out.println(encodedText);

        huffman.printCodes();

        String originalText = huffman.decode(encodedText);
        System.out.println(originalText);

        Map<Character, Integer> stuff = new HashMap<Character, Integer>();

        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // if we see new char
            if(stuff.get(c) == null){
                stuff.put(c, 1);
            }else {
                stuff.put(c, stuff.get(c) + 1);
            }
        }
        // stuff.put('a', 3);
        // stuff.put('b', 13);
        // stuff.put('z', 6);

        // int result = stuff.get('z');
        // System.out.println("result: " + result);

        for(Entry<Character, Integer> entry : stuff.entrySet()){
            System.out.println("key: " + entry.getKey() + " " + "value: " + entry.getValue());
        }
    }
}
