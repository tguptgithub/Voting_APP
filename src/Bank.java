//Abstract Classes are a good fit if you want to provide implementation details to your children
// but don't want to allow an instance of your class to be directly instantiated
// (which allows you to partially define a class).
//Here methods are defined but these methods don't provide the implementation.
//Abstract Methods can only be implemented using subclasses or classes that implement the interfaces.
abstract class Bank {
    //Why do we need abstract method in Java?
    //In object oriented programming, abstraction is defined as hiding the unnecessary details (implementation)
    // from the user and to focus on essential details (functionality).
    // It increases the efficiency and thus reduces complexity.
    // In Java, abstraction can be achieved using abstract classes and methods.
    abstract int getROI();

    abstract void deposite();
    abstract void withdrawl();

}
