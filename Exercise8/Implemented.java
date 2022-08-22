package Exercise8;

import Exercise7.Interfaces;

public class Implemented implements Interfaces {
    @Override
    public void print(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        new Implemented().print();
    }
}
//you can inherit(extend) from only one concrete class.But You can implement from as many interfaces as you want.
//You place all the interface names after the implements' keyword, separating them with commas.
//And the concrete class must come first, then the interfaces
