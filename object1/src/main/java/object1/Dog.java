package object1;

public class Dog {
    private String color;
    private int age;
    private String breed;

    public Dog(String color, int age, String breed) {
        this.color = color;
        this.age = age;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setName(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}