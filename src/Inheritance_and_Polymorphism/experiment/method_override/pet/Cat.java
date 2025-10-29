package Inheritance_and_Polymorphism.experiment.method_override.pet;

import java.time.LocalDate;

public class Cat extends Pet {
    public Cat(String name, LocalDate birthday) {
        super(name, birthday);
    }

    public String climbTree() {
        return "我会爬树";
    }

    @Override
    public String shout() {
        return String.format("猫，名字：%s，生日：%d年%02d月%02d日",
                this.getName(),
                this.getBirthday().getYear(),
                this.getBirthday().getMonth().getValue(),
                this.getBirthday().getDayOfMonth()
        );
    }
}
