package Exercise8;

import java.util.Arrays;

//strategy design pattern
// You can use my method with any object you like, as long as
//your object conforms to my interface.
// This makes your method more flexible, general and reusable.
public class DesignPattern1 {
}
class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) { return input; }
}
class Upcase extends Processor {
    String process(Object input) { // Covariant return
        return ((String)input).toUpperCase();
    }
}
class Downcase extends Processor {
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}
class Splitter extends Processor {
    String process(Object input) {
        // The split() argument divides a String into pieces:
        return Arrays.toString(((String)input).split(" "));
    }
}
 class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
    public static String s =
            "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}