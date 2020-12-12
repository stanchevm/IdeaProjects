public class PeopleDemo {
    public static void main(String[] args) {
        Person radi = new Person();
        radi.godini = 20;
        radi.ime= "Radostina";
        radi.isFemale = true;
        radi.teglo = 40;

        System.out.println("Radi godini: " + radi.godini + " visochine" + radi.visochina);
//        People.eat();
        Person deyan = new Person();
        deyan.godini = 25;
        deyan.ime = "Deyan";
        System.out.println(radi.teglo);
        System.out.println(deyan.teglo);
        deyan = null;
        System.out.println(deyan.teglo);
    }
}
