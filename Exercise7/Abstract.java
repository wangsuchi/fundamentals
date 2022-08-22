package Exercise7;

//Exercise 3:  Create a base class with an abstract print( ) method that is overridden in a
// derived class. The overridden version of the method prints the value of an int variable
// defined in the derived class. At the point of definition of this variable, give it a
// nonzero value. In the base-class constructor, call this method. In main( ), create an
// object of the derived type, and then call its print( ) method. Explain the results.

public abstract class Abstract {
    abstract void print();
    Abstract() {
        System.out.println("abstract constructor called");
        print();
    }
}

class Derived extends Abstract{
    private int num = 8;
    @Override
    void print() {
        System.out.println("derived class print() called " + num);
    }

    public static void main(String[] args) {
        new Derived().print();
    }
}
//abstract class is a kind of midway step between an
// ordinary class and an interface.
//Only some of the methods will be abstract, since making a class abstract doesn’t force
//you to make all the methods abstract.