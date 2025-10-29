package Inheritance_and_Polymorphism.experiment.inheritance.pet;

public class Dog extends Pet{
    public Dog(String name, java.time.LocalDate birthday) {
        super(name, birthday);
    }

    public String guard(){
        return "我能警戒";
    }
}
