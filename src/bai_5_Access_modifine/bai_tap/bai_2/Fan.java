package bai_5_Access_modifine.bai_tap.bai_2;

public class Fan {
    // Hằng số
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Thuộc tính
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    // Constructor mặc định
    public Fan() {
    }

    // Getter và Setter
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    public String toString() {
        if (on) {
            return "Fan is on - speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan is off - color: " + color + ", radius: " + radius;
        }
    }
}

