package Inheritance_and_Polymorphism.experiment.inheritance.pet;

import java.time.LocalDate;

public class Pet {
    private String name;
    private LocalDate birthday;

    public Pet (String name , LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String shout(){
        return String.format("名字：%s，生日：%d年%02d月%02d日",
                this.name,
                this.birthday.getYear(),
                this.birthday.getMonth().getValue(),
                this.birthday.getDayOfMonth()
    );
    }
}
