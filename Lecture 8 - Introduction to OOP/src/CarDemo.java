public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "green";
        car1.model = "Ford Mustang";
        car1.fuel = "Gasoline";
        car1.maxSpeed = 200;

        Car car2 = new Car();
        car2.color = "red";
        car2.model = "Toyot Prius";
        car2.fuel = "Electricity";
        car2.maxSpeed = 220;

        Car car3 = new Car();
        car3.color = "blue";
        car3.model = "Volkswagen Golf";
        car3.fuel = "Diesel";
        car3.maxSpeed = 250;

        Person owner = new Person();
        owner.ime = "Pesho";
        owner.godini = 14;
        car3.owner = owner;
//        car3.ownerInfo();

        Person kuncho = new Person();
        kuncho.ime = "Kuncho";
        kuncho.godini = 24;

        Person puncho = new Person();
        puncho.ime = "Puncho";
        puncho.godini = 25;

        Person mruncho = new Person();
        mruncho.ime = "Mruncho";
        mruncho.godini = 30;

//        System.out.println("My name is " + owner.ime + " and my friend's name is " + owner.friend.ime);
//        System.out.println("My name is " + kuncho.ime + " and my friend's name is " + ((kuncho.friend == null)?"No fiend":kuncho.friend.ime));
//        car2.owner = mruncho;
//        System.out.println(car2.owner);

        car1.accelerate();
        car1.changeGearDown();
        car2.changeColor(null);
        System.out.println(car2.color);
        car3.changeColor("123");
        System.out.println(car3.color);
    }
}
