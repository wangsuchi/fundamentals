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
    }
}

