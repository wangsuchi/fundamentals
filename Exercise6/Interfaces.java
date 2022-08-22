package Exercise6;

public interface Interfaces {
    int primitiveTest = 1;
    void print();
}


//You can choose to explicitly declare the methods in an interface as public, but they are
//public even if you don’t say it. So when you implement an interface, the methods from the
//interface must be defined as public. Otherwise, they would default to package access, and
//you’d be reducing the accessibility of a method during inheritance, which is not allowed by
//the Java compiler.



//An interface can also
//contain fields, but these are implicitly static and final