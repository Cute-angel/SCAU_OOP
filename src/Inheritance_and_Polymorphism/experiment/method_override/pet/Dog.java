package Inheritance_and_Polymorphism.experiment.method_override.pet;

public class Dog extends Pet {
    public Dog(String name, java.time.LocalDate birthday) {
        super(name, birthday);
    }

    public String guard(){
        return "我能警戒";
    }

    @Override
    public String shout() {
         return String.format("狗，名字：%s，生日：%d年%02d月%02d日",
                 this.getName(),
                this.getBirthday().getYear(),
                this.getBirthday().getMonth().getValue(),
                this.getBirthday().getDayOfMonth()
        );
    }
}
