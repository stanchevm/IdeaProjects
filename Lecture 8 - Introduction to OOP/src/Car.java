import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    String model;
    int maxSpeed;
    String fuel;
    String color;
    int currentGear = 2;
    int currentSpeed = 10;
    Person owner;

    public void ownerInfo(){
        System.out.println(owner);
    }

//    public void ownerInfo() {
//        System.out.println("Owner name is " + owner.ime);
//        System.out.println("Owner's age is " + owner.godini);
//    }

    public void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed += 10;
            System.out.println(currentSpeed);
        } else {
            System.out.println("You can't accelerate further, you ar already driving with " + maxSpeed + "km");
        }
    }

    public void changeGearUp() {
        if (currentGear < 5) {
            accelerate();
            currentGear++;
        } else {
            System.err.println("You cannot accelerate further");
        }
    }

    public void changeGearDown() {
        if (currentGear > 1) {
            accelerate();
            currentGear--;
        } else {
            System.err.println("You cannot go any slower, you will stop");
        }
    }

    public void changeGear(int nextGear) {
        if (nextGear >= 1 && nextGear <= 5) {
            currentGear = nextGear;
        } else {
            System.out.println("You can't switch");
        }
    }

    public void changeColor(String newColor) {
        if (newColor != null) {
            Pattern pattern = Pattern.compile("[A-Za-z]");
            Matcher matcher = pattern.matcher(newColor);
            if (matcher.matches()) {
                color = newColor;
            } else {
                System.out.println("Invalid color");
            }
        } else {
            System.out.println("Input null is invalid");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuel='" + fuel + '\'' +
                ", color='" + color + '\'' +
                ", currentGear=" + currentGear +
                '}';
    }
}
