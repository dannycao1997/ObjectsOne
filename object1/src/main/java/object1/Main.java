package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("Danny", 26, 0);
        Person person2 = new Person("Andy", 26, 1);
        Person person3 = new Person("Anthony", 33, 2);
        System.out.println(person1.height);

        Person[] people = new Person[3];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        System.out.println(people[1].name); //prints out Andy's name in the array

        Car car1 = new Car("blue", "manual", 30, 0);
        Car car2 = new Car("red", "automatic", 34, 10);
        Car car3 = new Car("white", "manual", 18, 7);

        Chair chair1 = new Chair("Ikea", "black", 4);
        Chair chair2 = new Chair("Walmart", "white", 1);
        Chair chair3 = new Chair("Target", "brown", 2);

        Dog dog1 = new Dog("brown", 2, "poodle");
        Dog dog2 = new Dog("white", 1, "lab");
        Dog dog3 = new Dog("black", 4, "pit");

    }
}
