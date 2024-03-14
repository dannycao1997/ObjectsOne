package object1;
// Define a class
class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age;
    int height; //centimeters

    // Constructor and initialing instance variables
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("Danny", 30, 0);

        /* Now you can use the Object `person1` */
    }
}
