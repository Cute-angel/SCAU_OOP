package Inheritance_and_Polymorphism.experiment.abstract_class.device;

public class Light extends ElectricalDevice {
    public Light(String name) {
        super(name);
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.printf("电灯 [%s] 已点亮%n", getName());
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.printf("电灯 [%s] 已关闭%n", getName());
    }
}
