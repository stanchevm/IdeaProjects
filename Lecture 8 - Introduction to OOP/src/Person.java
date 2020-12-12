public class Person {
    public int godini;
    public boolean isFemale;
    public int teglo = 20;
    public double visochina;
    public String ime;
    Person friend;

    @Override
    public String toString() {
        return "My name is " + ime + " and I am " + godini + " years old!";
    }
}
