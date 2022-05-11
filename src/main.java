public class main {
    public static void main(String[] args) {
        Mitarbeiter Test = new Mitarbeiter("Leonard", "Szillat", "Test");
        Mitarbeiter Test2 = new Mitarbeiter("Leonard", "Szillat");
        Schueler Testx = new Schueler("Szillat", "Leonard", 3, "Deutsch", 4, "BWL");
        System.out.println(String.format("%s %s %s: %d, %s: %d", Testx.getVorname(), Testx.getName(), Testx.getFach1(), Testx.getNote1(), Testx.getFach2(), Testx.getNote2()));
    }
}