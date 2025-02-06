
public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun("Arjun", 90, 10, "high");
        Bheem bheem = new Bheem("Bheem", 80, 9, "low");
        Vikarn vikarn = new Vikarn("Vikarn", 70, 2, 8, "high");
        Kaurav kaurav = new Kaurav("Kaurav", 60, 7);

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();

        kaurav.fight();
        kaurav.disobey();
    }
}