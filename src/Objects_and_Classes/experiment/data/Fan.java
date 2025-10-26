package Objects_and_Classes.experiment.data;

public class Fan {
    public static final int SLOW  = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private String brand;

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getBrand() {
        return brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Fan(String brand) {
        this.brand = brand;
        this.speed = SLOW;
        this.on = false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("品牌: "+this.brand+"\n");
        sb.append("运行： "+(this.on ? "是" : "否") + "\n");
        sb.append("速度： ");
        switch (this.speed){
            case FAST:
                sb.append("快");
                break;
            case MEDIUM:
                sb.append("中");
                break;
            case SLOW:
                sb.append("慢");
                break;
        }
        return sb.toString();
    }

}
