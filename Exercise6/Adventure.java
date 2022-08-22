package Exercise6;

//Create three interfaces, each with one method. Inherit a new interface
//that combines the three, adding a new method. Create a class by implementing the new
//interface and also inheriting from a concrete class. Now write four methods, each of which
//takes one of the four interfaces as an argument. In main( ), create an object of your class
//and pass it to each of the methods.

interface CanFight {
    void fight();
}
interface CanSwim {
    void swim();
}
interface CanFly {
    void fly();
}
interface CanClimb {
    void climb();
}
class ActionCharacter {
    public void fight() {}
}
class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly,CanClimb {
    public void swim() {}
    public void fly() {}
    public void climb() {}
}
public class Adventure {
    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
    public static void x(CanClimb x) { x.climb(); }
    public static void w(ActionCharacter x) { x.fight(); }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        x(h); //Treat it as a CanClimb
        w(h); // Treat it as an ActionCharacter
    }
}
//you can inherit(extend) from only one concrete class.But You can implement from as many interfaces as you want.
//You place all the interface names after the implements' keyword, separating them with commas.
//And the concrete class must come first, then the interfaces