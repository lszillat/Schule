public class main {
    public static void main(String[] args) {
        Person Sebi = new Person("Vettel", "Sebastian");
        Auto Ferrari_SF90 = new Auto(0, 0);
        Ferrari_SF90.beschleunigen(160);
        System.out.println(String.format("%s %s fährt aktuell %d Stundenkilometer.", Sebi.vorname, Sebi.name, Ferrari_SF90.getV_aktuell()));
    }
}