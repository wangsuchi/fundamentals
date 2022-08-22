package Exercise8;

import java.nio.*;
import java.util.*;
// Create a class that produces a sequence of chars. Adapt this class so
//that it can be an input to a Scanner object.

public class CharsProducer {
}
 class RandomWords implements Readable {

    //random number generator
    private static Random rand = new Random(47);

    //an array of lowercase letters
    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();

    //number of words to generate
    private int count;

    //constructor
    public RandomWords(int count) { this.count = count; }

    //read method (required to implement Readable)
    public int read(CharBuffer cb) {

        if(count-- == 0)
            return -1; // Indicate end of input

        //ten letter random word
        for(int i = 0; i < 9; i++) {
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" "); //separate tokens with a space ?
        return 10; // Number of characters appended
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(8));
        while(s.hasNext())
            System.out.println(s.next());
    }

}