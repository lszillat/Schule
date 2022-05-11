public class main {
    public static void main(String[] args) {
        Mitarbeiter Test = new Mitarbeiter("Test", "2", "Test");
        Mitarbeiter Test2 = new Mitarbeiter("Test", "2");
        Schueler Testx = new Schueler("Test", "x", 3, "Deutsch", 4, "BWL");
        System.out.println(String.format("%s %s %s: %d, %s: %d", Testx.getVorname(), Testx.getName(), Testx.getFach1(), Testx.getNote1(), Testx.getFach2(), Testx.getNote2()));
    }
}