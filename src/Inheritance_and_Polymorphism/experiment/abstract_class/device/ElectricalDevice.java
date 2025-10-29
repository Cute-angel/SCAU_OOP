package Inheritance_and_Polymorphism.experiment.abstract_class.device;

public abstract class ElectricalDevice {
    private String name;
    protected boolean isOn = false;
    public ElectricalDevice(String name) {
        this.name = name;
    }
    public abstract void powerOn();

    public abstract void powerOff();

    public String getStatus() {
        return String.format("[%s] 当前状态: %s", name, isOn ? "开启" : "关闭");
    }

    public String getName() {
        return name;
    }
}
