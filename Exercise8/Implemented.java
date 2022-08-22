package Exercise8;

import Exercise6.Interfaces;

//test interface is implicitly public. So implement from another package
public class Implemented implements Interfaces {
    @Override
    public void print(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {

        new Implemented().print();
        System.out.println(Interfaces.primitiveTest); //implicitly final static, so it can't be changed
    }
}
//The fields, of course, are not part of the interface.
//The values are stored in the static storage
//area for that interface.
