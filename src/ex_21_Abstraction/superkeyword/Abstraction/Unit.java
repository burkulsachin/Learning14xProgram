package ex_21_Abstraction.superkeyword.Abstraction;
//TV is abstract class defining turnOn() and turnOff() methods.
//TVRemote class implements the abstract methods with specific logic.
//Unit class(Main class) uses TV remote = new TVRemote(); to
// interact without knowing the internal implementation.

abstract class  TV {
    abstract void turnOn();
    abstract void turnedOff();
}
// Concrete class implementing the abstract methods
class  TvRemote extends TV {
@Override
    void turnOn() {
        System.out.println("TV is turned On");
    }
@Override
    void turnedOff() {
        System.out.println("TV is turned Off");
    }

    // Main class to demonstrate abstraction
    public class Unit {
        public static void main(String[] args) {
            TV rm = new TvRemote();
            rm.turnOn();
            rm.turnedOff();
        }
    }
}
