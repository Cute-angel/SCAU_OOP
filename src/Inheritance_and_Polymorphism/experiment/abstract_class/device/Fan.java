package Inheritance_and_Polymorphism.experiment.abstract_class.device;

public class Fan extends ElectricalDevice {
    private int speed = 1;

    public Fan(String name) {
        super(name);
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.printf("风扇 [%s] 已启动，当前风速：[%d] 级%n", getName(), speed);
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.printf("风扇 [%s] 已停止%n", getName());
    }

    public void adjustSpeed(int newSpeed){
        if (1 <= newSpeed && newSpeed <= 3 && this.isOn) {
            this.speed = newSpeed;
            System.out.printf("风扇 [%s] 风速已调整为[%d]级%n",getName(), speed);
        }
    }
}
